package com.horarios.horarios.Services;

import com.horarios.horarios.Entities.Banderas;
import com.horarios.horarios.Repositories.BanderaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BanderaService {
    @Autowired
    private BanderaRepository banderaRepository;

    public List<Banderas> getBanderas(){
        return  banderaRepository.findAll();
    }

    public Optional<Banderas> getBanderaById(String id){
        return banderaRepository.findById(id);
    }




}
