package com.lachacra.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "user")
@Entity
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer cod;
    private String name;
    private String surnames;
    private String email;
    private String password;
    private String dni;
    private String cellphone;
    private int rol;
    private int state;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Reserve> reserves;
}
