package com.horarios.horarios.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "asignaciones")
public class Asignaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "asignacion_id")
    private long asignacionId;

    @ManyToOne
    @JoinColumn(name = "docente_id", nullable = false)
    private Docentes docente;

    @ManyToOne
    @JoinColumn(name = "materia_id", nullable = false)
    private Materias materia;

    // Getters y Setters
    public long getAsignacionId() {
        return asignacionId;
    }

    public void setAsignacionId(long asignacionId) {
        this.asignacionId = asignacionId;
    }

    public Docentes getDocente() {
        return docente;
    }

    public void setDocente(Docentes docente) {
        this.docente = docente;
    }

    public Materias getMateria() {
        return materia;
    }

    public void setMateria(Materias materia) {
        this.materia = materia;
    }
}

