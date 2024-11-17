package com.horarios.horarios.Repositories;

import com.horarios.horarios.Entities.Materias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends JpaRepository<Materias,String> {
}
