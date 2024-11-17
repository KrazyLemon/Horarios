package com.horarios.horarios.Services;

import com.horarios.horarios.Entities.Grupos;
import com.horarios.horarios.Repositories.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GrupoService {

    @Autowired
    private GrupoRepository grupoRepository;

    public List<Grupos> getGrupos(){
        return grupoRepository.findAll();
    }

    public Optional<Grupos> getGrupoById(String id){
        return grupoRepository.findById(id);
    }

    public void deleteGrupo(String id){
        grupoRepository.deleteById(id);
    }
    public void saveOrUpdateGrupo(Grupos grupo){
        grupoRepository.save(grupo);
    }

}