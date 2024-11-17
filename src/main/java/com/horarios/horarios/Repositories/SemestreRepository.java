package com.horarios.horarios.Repositories;

import com.horarios.horarios.Entities.Semestres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemestreRepository extends JpaRepository<Semestres,String> {
}
