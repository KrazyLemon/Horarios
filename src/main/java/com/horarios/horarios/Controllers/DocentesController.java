package com.horarios.horarios.Controllers;

import com.horarios.horarios.Entities.Docentes;
import com.horarios.horarios.Services.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/docentes")
public class DocentesController {

    @Autowired
    private DocenteService docentesService;

    @GetMapping
    public List<Docentes> getAll(){
        return docentesService.getDocentes();
    }

    @GetMapping("/{docenteId}")
    public Optional<Docentes> getById(@PathVariable("docenteId") String id){
        return docentesService.getDocenteById(id);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Docentes docente){
        docentesService.saveOrUpdateDocente(docente);
    }

    @DeleteMapping("/{docenteId}")
    public void delete(@PathVariable("docenteId") String id){
        docentesService.deleteDocente(id);
    }
}
