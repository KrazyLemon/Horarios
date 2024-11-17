package com.horarios.horarios.Controllers;

import com.horarios.horarios.Entities.Grupos;
import com.horarios.horarios.Services.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/grupos")
public class GruposController {

    @Autowired
    private GrupoService gruposService;

    @GetMapping
    public List<Grupos> getAll(){
        return gruposService.getGrupos();
    }

    @GetMapping("/{grupoId}")
    public Optional<Grupos> getById(@PathVariable("grupoId") String id){
        return gruposService.getGrupoById(id);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Grupos grupo){
        gruposService.saveOrUpdateGrupo(grupo);
    }

    @DeleteMapping("/{grupoId}")
    public void delete(@PathVariable("grupoId") String id){
        gruposService.deleteGrupo(id);
    }

}
