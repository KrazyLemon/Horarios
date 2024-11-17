package com.horarios.horarios.Services;

import com.horarios.horarios.Entities.Docentes;
import com.horarios.horarios.Repositories.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteService {

    @Autowired
    private DocenteRepository docenteRepository;

    public List<Docentes> getDocentes(){
        return docenteRepository.findAll();
    }

    public Optional<Docentes> getDocenteById(String id){
        return docenteRepository.findById(id);
    }

    public void deleteDocente(String id){
        docenteRepository.deleteById(id);
    }

    public void saveOrUpdateDocente(Docentes docente){
        docenteRepository.save(docente);
    }

}
