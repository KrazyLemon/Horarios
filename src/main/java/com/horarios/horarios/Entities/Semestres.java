package com.horarios.horarios.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "semestres")
public class Semestres {
    @Id
    @Column(name = "semestre_id", length = 6)
    private String semestreId;

    @Column(name = "semestre", nullable = false)
    private int semestre;

    public String getSemestreId() {
        return semestreId;
    }

    public void setSemestreId(String semestreId) {
        this.semestreId = semestreId;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
