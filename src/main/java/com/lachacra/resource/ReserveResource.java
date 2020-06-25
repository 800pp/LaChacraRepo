package com.lachacra.resource;

import com.lachacra.model.ModelSaveReserve;
import com.lachacra.model.Reserve;
import com.lachacra.model.User;
import com.lachacra.repository.ReserveRepository;
import com.lachacra.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class ReserveResource {

    private final ReserveRepository reserveRepository;
    private final UserRepository userRepository;

    public ReserveResource(ReserveRepository reserveRepository, UserRepository userRepository) {
        this.reserveRepository = reserveRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/reserves")
    public ResponseEntity list(){
        List<Reserve> reserves = reserveRepository.findAll();
        if(reserves.isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(reserves, HttpStatus.OK);
    }
/*
    @PostMapping("/reserves")
    public ResponseEntity save( @RequestBody Reserve reserve){
        reserveRepository.save(reserve);
        return new ResponseEntity(reserve, HttpStatus.CREATED);
    }
*/
    @PostMapping("/reserves")
    public ResponseEntity  save( @RequestBody ModelSaveReserve modelSaveReserve){

        System.out.println(modelSaveReserve.toString());
        User user;
        user = userRepository.findById(modelSaveReserve.getCodUser()).orElse(null);

        Reserve reserve = new Reserve();
        reserve.setDate(modelSaveReserve.getDate());
        reserve.setMontoTotal(modelSaveReserve.getMontoTotal());
        reserve.setCantidadPersonas(modelSaveReserve.getCantidadPersonas());
        reserve.setHour(modelSaveReserve.getHour());
        reserve.setUser(user);

        reserveRepository.save(reserve);
        return new ResponseEntity(reserve, HttpStatus.CREATED);
    }


}
