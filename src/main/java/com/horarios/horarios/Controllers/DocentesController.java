package com.horarios.horarios.Controllers;

import com.horarios.horarios.DTOs.DocenteDTO;
import com.horarios.horarios.Entities.Banderas;
import com.horarios.horarios.Entities.Docentes;
import com.horarios.horarios.Repositories.BanderaRepository;
import com.horarios.horarios.Services.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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

    @Autowired
    private BanderaRepository banderaRepository;

    @GetMapping
    public List<Docentes> getAll(){
        return docentesService.getDocentes();
    }

//    @GetMapping // Ruta: /api/v1/docentes?page=1&size=10
//    public Page<Docentes> getAllPaginated(
//            @RequestParam(value = "page",defaultValue ="0") int page,
//            @RequestParam(value = "size", defaultValue = "10") int size){
//        return docentesService.getDocentesPaginated(page, size);
//    }

    @GetMapping("/{docenteId}") // Ruta: api/v1/docentes/D0001
    public Optional<Docentes> getById(@PathVariable("docenteId") String id){
        return docentesService.getDocenteById(id);
    }

    @PostMapping
    public void saveUpdate(@RequestBody DocenteDTO docenteDTO) {

        Banderas bandera = banderaRepository.findById(docenteDTO.getBanderaId())
                .orElseThrow(() -> new IllegalArgumentException("La bandera no existe"));

        Docentes docente = new Docentes();

        docente.setDocenteId(docenteDTO.getDocenteId());
        docente.setNombre(docenteDTO.getNombre());
        docente.setApellidos(docenteDTO.getApellidos());
        docente.setAntiguedad(docenteDTO.getAntiguedad());
        docente.setEntrada(docenteDTO.getEntrada());
        docente.setSalida(docenteDTO.getSalida());
        docente.setHoras(docenteDTO.getHoras());

        docente.setBandera(bandera);
        docentesService.saveOrUpdateDocente(docente);
    }

    @DeleteMapping("/{docenteId}")
    public void delete(@PathVariable("docenteId") String id){
        docentesService.deleteDocente(id);

    }
}
