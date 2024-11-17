package com.horarios.horarios.Repositories;

import com.horarios.horarios.Entities.Grupos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoRepository extends JpaRepository<Grupos,String> {
}
