package com.horarios.horarios.Repositories;

import com.horarios.horarios.Entities.Asignaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignacionRepository extends JpaRepository<Asignaciones, Long> {
}
