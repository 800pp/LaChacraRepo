package com.lachacra.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "menu")
@Entity
public class Menu
{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer codMenu;
    private String name;
    private String description;
    private String nameFoto;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codCategoria")
    private CategoriaMenu categoriaMenu;

}
