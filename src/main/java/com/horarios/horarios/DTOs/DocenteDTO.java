package com.horarios.horarios.DTOs;

import java.time.LocalDate;
import java.time.LocalTime;

public class DocenteDTO {
    private String docenteId;
    private String nombre;
    private String apellidos;
    private LocalDate antiguedad;
    private LocalTime entrada;
    private LocalTime salida;
    private Integer horas;
    private String banderaId;

    public String getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(String docenteId) {
        this.docenteId = docenteId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(LocalDate antiguedad) {
        this.antiguedad = antiguedad;
    }

    public LocalTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalTime entrada) {
        this.entrada = entrada;
    }

    public LocalTime getSalida() {
        return salida;
    }

    public void setSalida(LocalTime salida) {
        this.salida = salida;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public String getBanderaId() {
        return banderaId;
    }

    public void setBanderaId(String banderaId) {
        this.banderaId = banderaId;
    }
}
