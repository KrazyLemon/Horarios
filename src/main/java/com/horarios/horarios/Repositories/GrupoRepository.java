package com.horarios.horarios.Repositories;

import com.horarios.horarios.Entities.Grupos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Repository
public interface GrupoRepository extends JpaRepository<Grupos,String> {

    @Query(
            value = "SELECT * FROM grupos WHERE semestre_id = %:id%",
            nativeQuery = true
    )
    public List<Grupos> obtenerPorSemestre(@Param("id") String semestre);

    @Query(
            value = "SELECT * FROM grupos WHERE turno = %:turno%",
            nativeQuery = true
    )
    public List<Grupos> obtenerPorTurno(@Param("turno") String turno);

    @Query(
            value = "SELECT * FROM grupos WHERE semestre_id = %:semestreId% AND turno = %:turno%",
            nativeQuery = true
    )
    public List<Grupos> obtenerPorTurnoYSemestre(@Param("semestreId") String semestreId,@Param("turno") String turno);

}
