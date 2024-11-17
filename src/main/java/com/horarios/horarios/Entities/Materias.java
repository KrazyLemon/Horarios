package com.horarios.horarios.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "materias")
public class Materias {
    @Id
    @Column(name = "materia_id")
    private String materiaId;

    @Column(name = "clave", length = 20, nullable = false)
    private String clave;

    @Column(name = "materia", length = 50, nullable = false)
    private String materia;

    @Column(name = "horas")
    private int horas;

    @ManyToOne
    @JoinColumn(name = "semestre_id",nullable = false)
    private Semestres semestre;

    public String getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(String materiaId) {
        this.materiaId = materiaId;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Semestres getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestres semestre) {
        this.semestre = semestre;
    }
}
