package com.lachacra.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "reserve")
@Entity
public class Reserve {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer cod;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private String hour;
    private Double montoTotal;
    private Integer cantidadPersonas;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "codUser")
    private User user;
}
