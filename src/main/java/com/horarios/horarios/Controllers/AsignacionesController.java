package com.horarios.horarios.Controllers;

import com.horarios.horarios.Entities.Asignaciones;
import com.horarios.horarios.Services.AsignacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/asignaciones")
public class AsignacionesController {

  @Autowired
  private AsignacionService asignacionesService;

  @GetMapping
  public List<Asignaciones> getAll(){
      return asignacionesService.getAsignaciones();
  }

  @GetMapping("/{asignacionId}")
  public Optional<Asignaciones> getById(@PathVariable("asignacionId") Long id){
      return asignacionesService.getAsignacionById(id);
  }

  @PostMapping
  public void saveUpdate(@RequestBody Asignaciones asignacion){
      asignacionesService.saveOrUpdateAsignacion(asignacion);
  }

  @DeleteMapping("/{asignacionId}")
    public void delete(@PathVariable("asignacionId") Long id){
        asignacionesService.deleteAsignacion(id);
    }

}
