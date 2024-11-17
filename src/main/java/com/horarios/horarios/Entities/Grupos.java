package com.horarios.horarios.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "grupos")
public class Grupos{
    @Id
    @Column(name = "grupo_id", length = 6)
    private String grupoId;

//    @Column(name = "semestre_id")
//    private long semestreId;

    @Column(length = 10)
    private String grupo;

    @Column
    private char turno;

    @ManyToOne
    @JoinColumn(name = "semestre_id",nullable = false)
    private Semestres semestre;

    public String getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(String grupoId) {
        this.grupoId = grupoId;
    }


    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public Semestres getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestres semestre) {
        this.semestre = semestre;
    }
}
