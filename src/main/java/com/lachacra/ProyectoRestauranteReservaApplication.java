package com.lachacra;

import com.lachacra.model.Menu;
import com.lachacra.repository.MenuRepository;
import com.lachacra.resource.MenuResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoRestauranteReservaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProyectoRestauranteReservaApplication.class, args);
    }

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public void run(String... args) throws Exception {


        Menu menu = new Menu();
        menu.setName("Arroz con pollo");
        menu.setDescription("Descripcion Arros con pollo");
        menu.setNameFoto("arrozconpollo.jpg");

        menuRepository.save(menu);

        Menu menu2 = new Menu();
        menu2.setName("Arroz con pollo2");
        menu2.setDescription("Descripcion Arros con pollo 2 ");
        menu2.setNameFoto("arrozconpollo2.jpg");

        menuRepository.save(menu2);

        Menu menu3 = new Menu();
        menu3.setName("Arroz con pollo3");
        menu3.setDescription("Descripcion Arros con pollo 3");
        menu3.setNameFoto("arrozconpollo3.jpg");

        menuRepository.save(menu3);

    }
}
