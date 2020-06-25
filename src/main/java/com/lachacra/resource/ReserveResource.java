package com.lachacra.resource;

import com.lachacra.model.Menu;
import com.lachacra.model.Reserve;
import com.lachacra.repository.MenuRepository;
import com.lachacra.repository.ReserveRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReserveResource {

    private final ReserveRepository reserveRepository;

    public ReserveResource(ReserveRepository reserveRepository) {
        this.reserveRepository = reserveRepository;
    }

    @GetMapping("/reserves")
    public ResponseEntity list(){
        List<Reserve> reserves = reserveRepository.findAll();
        if(reserves.isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(reserves, HttpStatus.OK);
    }

    @PostMapping("/reserves")
    public ResponseEntity save( @RequestBody Reserve reserve){
        reserveRepository.save(reserve);
        return new ResponseEntity(reserve, HttpStatus.CREATED);
    }
}
