package com.horarios.horarios.Controllers;

import com.horarios.horarios.Entities.Asignaciones;
import com.horarios.horarios.Services.AsignacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/asignaciones")
public class AsignacionesController {

  @Autowired
  private AsignacionService asignacionesService;


  @GetMapping // Ruta: /api/v1/asignaciones?page=1&size=10
  public Page<Asignaciones> getAllPaginated(
          @RequestParam(value = "page", defaultValue = "0") int page,
          @RequestParam(value = "size", defaultValue = "10") int size) {
      return asignacionesService.getAllPaginated(page, size);
  }

  @GetMapping("/docente") // Ruta: api/v1/asignaciones/docente?docenteId=D0001
  public List<Asignaciones> getByDocente(@RequestParam("docenteId") String id) {
      return asignacionesService.getAsignacionByDocente(id);
  }

  @GetMapping("/materia") // Ruta: api/v1/asignaciones/materia?materiaId=M0001
  public List<Asignaciones> getByMateria(@RequestParam("materiaId") String id){
      return asignacionesService.getAsignacionByMateria(id);
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
