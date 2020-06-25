package com.lachacra.resource;

import com.lachacra.model.Menu;
import com.lachacra.repository.MenuRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MenuResource {

    private final MenuRepository menuRepository;

    public MenuResource(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @GetMapping("/menus")
    public ResponseEntity list(){
        List<Menu> menus = menuRepository.findAll();
        if(menus.isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(menus, HttpStatus.OK);
    }

    @PostMapping("/menus")
    public ResponseEntity save( @RequestBody Menu menu){
        menuRepository.save(menu);
        return new ResponseEntity(menu, HttpStatus.CREATED);
    }
}
