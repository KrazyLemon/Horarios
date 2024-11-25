package com.horarios.horarios.Repositories;

import com.horarios.horarios.Entities.Asignaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AsignacionRepository extends JpaRepository<Asignaciones, Long> {


    //Verifica si existe una asignacion por docente o materia
    //boolean existsByDocenteId(Long id);
    //boolean existsByMateriaId(Long id);


    // Obtener asignaciones por docente
    @Query(value = "SELECT * FROM Asignaciones WHERE docente_id = %:id%", nativeQuery = true)
    public List<Asignaciones> buscarPorDocente( @Param("id") String id);

    @Query(value = "SELECT * FROM Asignaciones WHERE materia_id = %:id%", nativeQuery = true)
    public List<Asignaciones> buscarPorMateria(@Param("id") String id);


}
