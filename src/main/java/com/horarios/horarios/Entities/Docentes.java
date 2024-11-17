package com.horarios.horarios.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "docentes")
public class Docentes {
    @Id
    @Column(name = "docente_id", length = 6)
    private String docenteId;

    @Column(name = "nombre",nullable = false)
    private String nombre;

    @Column(name = "apellidos",nullable = false)
    private String apellidos;

    @Column(name = "antiguedad", nullable = false)
    private LocalDate antiguedad;

    @Column(name = "entrada", nullable = false)
    private LocalTime entrada;

    @Column(name = "salida", nullable = false)
    private LocalTime salida;

    @Column(name = "horas")
    private Integer horas;

    @ManyToOne
    @JoinColumn(name = "bandera_id", nullable = false)
    private Banderas bandera;

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

    public Banderas getBandera() {
        return bandera;
    }

    public void setBandera(Banderas bandera) {
        this.bandera = bandera;
    }
}
