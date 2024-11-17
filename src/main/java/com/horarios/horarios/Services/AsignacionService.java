package com.horarios.horarios.Services;

import com.horarios.horarios.Entities.Asignaciones;
import com.horarios.horarios.Repositories.AsignacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignacionService {

    @Autowired
    private AsignacionRepository asignacionRepository;

    public List<Asignaciones> getAsignaciones(){
        return  asignacionRepository.findAll();
    }

    public Optional<Asignaciones> getAsignacionById(Long id){
        return asignacionRepository.findById(id);
    }

    public void deleteAsignacion(Long id){
        asignacionRepository.deleteById(id);
    }

    public void saveOrUpdateAsignacion(Asignaciones Asignacion){
        asignacionRepository.save(Asignacion);
    }

}
