package com.horarios.horarios.Repositories;

import com.horarios.horarios.Entities.Docentes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends JpaRepository<Docentes,String> {
}