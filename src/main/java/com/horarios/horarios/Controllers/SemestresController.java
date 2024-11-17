package com.horarios.horarios.Controllers;

import com.horarios.horarios.Entities.Semestres;
import com.horarios.horarios.Services.SemestreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/semestres")
public class SemestresController {

    @Autowired
    private SemestreService semestreService;

    @GetMapping
    public List<Semestres> getAll(){
        return semestreService.getSemestres();
    }

    @GetMapping("/{id}")
    public Optional<Semestres> getById(@PathVariable String id){
        return semestreService.getSemestreById(id);
    }

}
