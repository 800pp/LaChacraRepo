package com.lachacra.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

public class ModelSaveReserve {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private String hour;
    private Double montoTotal;
    private Integer cantidadPersonas;

    private Integer codUser;



    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Integer getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(Integer cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public Integer getCodUser() {
        return codUser;
    }

    public void setCodUser(Integer codUser) {
        this.codUser = codUser;
    }

    @Override
    public String toString() {
        return "ModelSaveReserve{" +
                ", date=" + date +
                ", hour='" + hour + '\'' +
                ", montoTotal=" + montoTotal +
                ", cantidadPersonas=" + cantidadPersonas +
                ", codUser=" + codUser +
                '}';
    }
}
