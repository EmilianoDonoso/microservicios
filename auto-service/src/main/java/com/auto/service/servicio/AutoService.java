package com.auto.service.servicio;

import com.auto.service.entidades.Auto;
import com.auto.service.repositorio.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoService {

    @Autowired
    private AutoRepository autoRepository;

    public List<Auto> getAll() {
        return autoRepository.findAll();
    }

    public Auto getAutoById(int id) {
        return autoRepository.findById(id).orElse(null);
    }

    public Auto save(Auto auto) {
        Auto nuevoAuto = autoRepository.save(auto);
        return nuevoAuto;
    }

    public List<Auto> byUsuarioId(int usuarioId){
        return autoRepository.findByUsuarioId(usuarioId);
    }
}
