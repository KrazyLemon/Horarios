package com.horarios.horarios.Repositories;

import com.horarios.horarios.Entities.Materias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MateriaRepository extends JpaRepository<Materias,String> {

    @Query(value = "Select * from materias where semestre_id = %:id%", nativeQuery = true)
    public List<Materias> buscarPorSemestre(String id);

    @Query(value = "SELECT * FROM materias WHERE materia LIKE %:filtro% OR clave LIKE %:filtro% ", nativeQuery = true)
    public List<Materias> buscarPorMateriaOClave(@Param("filtro")String nombre);

}
