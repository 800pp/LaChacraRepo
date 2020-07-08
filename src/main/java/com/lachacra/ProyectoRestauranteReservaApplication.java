package com.lachacra;

import com.lachacra.model.Menu;
import com.lachacra.model.Reserve;
import com.lachacra.model.User;
import com.lachacra.repository.MenuRepository;
import com.lachacra.repository.ReserveRepository;
import com.lachacra.repository.UserRepository;
import com.lachacra.resource.MenuResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ProyectoRestauranteReservaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProyectoRestauranteReservaApplication.class, args);
    }

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ReserveRepository reserveRepository;


    @Override
    public void run(String... args) throws Exception {

        User user1 = new User();
        user1.setName("Jose");
        user1.setEmail("user1@email.com");
        user1.setUsername("user1");
        user1.setPassword("123");

        User userGuardado = userRepository.save(user1);

        Reserve reserve1 = new Reserve();
        reserve1.setDate(LocalDate.now());
        reserve1.setCantidadPersonas(2);
        reserve1.setMontoTotal(100.0);
        reserve1.setUser(userGuardado);
        reserveRepository.save(reserve1);

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
