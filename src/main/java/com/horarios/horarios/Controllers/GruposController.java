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

    @GetMapping("/turno") // /api/v1/grupos/turno?turno=M
    public List<Grupos> getByTurno(@RequestParam("turno") String turno){
        return gruposService.getGruposByTurno(turno);
    }

    @GetMapping("/semestre") // /api/v1/grupos/semestre?semestre=2
    public List<Grupos> getBySemestre(@RequestParam("semestre") String semestre){
        return gruposService.getGruposBySemestre(semestre);
    }

    @GetMapping("/tys") // /api/v1/grupos/tys?semestreId=2&turno=M
    public List<Grupos> getByTurnoYSemestre(@RequestParam("semestreId") String semestreId,@RequestParam("turno") String turno){
        return gruposService.getGruposByTurnoYSemestre(semestreId,turno);
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
