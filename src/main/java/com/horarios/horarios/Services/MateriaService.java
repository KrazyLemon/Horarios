package com.horarios.horarios.Services;

import com.horarios.horarios.Entities.Materias;
import com.horarios.horarios.Repositories.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaService {
    @Autowired
    private MateriaRepository materiaRepository;

    public List<Materias> getMaterias(){
        return materiaRepository.findAll();
    }

    public Page<Materias> getAllPaginated(int page, int size){
        Pageable pageable = PageRequest.of(page, size);
        return materiaRepository.findAll(pageable);
    }

    public List<Materias> getMateriasBySemestre(String id){
        return materiaRepository.buscarPorSemestre(id);
    }

    public List<Materias> getMateriaByMateriaOrClave(String filtro){
        return materiaRepository.buscarPorMateriaOClave(filtro);
    }

    public Optional<Materias> getMateriaById(String id){
        return materiaRepository.findById(id);
    }

    public void deleteMateria(String id){
        materiaRepository.deleteById(id);
    }

    public void saveOrUpdateMateria(Materias materia){
        materiaRepository.save(materia);
    }

}
