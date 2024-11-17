package com.horarios.horarios.Controllers;

import com.horarios.horarios.Entities.Materias;
import com.horarios.horarios.Services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/materias")
public class MateriasController {
    @Autowired
    private MateriaService materiaService;

    @GetMapping
    public List<Materias> getAll(){
        return materiaService.getMaterias();
    }

    @GetMapping("/{materiaId}")
    public Optional<Materias> getById(@PathVariable("materiaId") String id){
        return materiaService.getMateriaById(id);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Materias materia){
        materiaService.saveOrUpdateMateria(materia);
    }

    @DeleteMapping("/{materiaId}")
    public void delete(@PathVariable("materiaId") String id){
        materiaService.deleteMateria(id);
    }

}
