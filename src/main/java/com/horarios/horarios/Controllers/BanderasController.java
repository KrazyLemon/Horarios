package com.horarios.horarios.Controllers;

import com.horarios.horarios.Entities.Banderas;
import com.horarios.horarios.Services.BanderaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/banderas")
public class BanderasController {

    @Autowired
    private BanderaService banderasService;

    @GetMapping
    public List<Banderas> getAll() {
        return banderasService.getBanderas();
    }

    @GetMapping("/{banderaId}")
    public Optional<Banderas> getById(@PathVariable("banderaId") String id) {
        return banderasService.getBanderaById(id);
    }
}
