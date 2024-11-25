package com.horarios.horarios.Controllers;

import com.horarios.horarios.Entities.Materias;
import com.horarios.horarios.Services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/materias")
public class MateriasController {
    @Autowired
    private MateriaService materiaService;

//    @GetMapping
//    public List<Materias> getAll(){
//        return materiaService.getMaterias();
//    }

    @GetMapping // Ruta: /api/v1/materias?page=1&size=10
    public Page<Materias> getAllPaginated(
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "10") int size) {
        return materiaService.getAllPaginated(page, size);
    }

    @GetMapping("/semestre") // Ruta: api/v1/materias/semestre?semestreId=S0001
    public List<Materias> getBySemestre(@RequestParam("semestreId") String id){
        return materiaService.getMateriasBySemestre(id);
    }

    @GetMapping("/{materiaId}")
    public Optional<Materias> getById(@PathVariable("materiaId") String id){
        return materiaService.getMateriaById(id);
    }

    @GetMapping("/search") // Ruta: api/v1/materias/search?search=matematicas
    public List<Materias> getByMateriaOrClave(@RequestParam("search") String filtro){
        return materiaService.getMateriaByMateriaOrClave(filtro);
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
