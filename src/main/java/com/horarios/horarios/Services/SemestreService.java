package com.horarios.horarios.Services;

import com.horarios.horarios.Entities.Semestres;
import com.horarios.horarios.Repositories.SemestreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SemestreService {
    @Autowired
    private SemestreRepository semestreRepository;

    public List<Semestres> getSemestres(){
        return semestreRepository.findAll();
    }

    public Optional<Semestres> getSemestreById(String id){
        return semestreRepository.findById(id);
    }
}
