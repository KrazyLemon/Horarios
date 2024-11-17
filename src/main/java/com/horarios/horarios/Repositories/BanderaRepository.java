package com.horarios.horarios.Repositories;

import com.horarios.horarios.Entities.Banderas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanderaRepository extends JpaRepository<Banderas, String> {

}
