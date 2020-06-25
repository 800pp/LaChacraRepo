package com.lachacra.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "categoria_menu")
@Entity
public class CategoriaMenu
{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer codCategoria;
    private String name;
    private String description;

    @OneToMany(mappedBy = "categoriaMenu")
    private List<Menu> menus;

}
