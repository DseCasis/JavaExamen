package com.example.danny;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DannyClienteService {

    @Autowired
    private DannyClienteRepository repository;

    public List<DannyCliente> getAll() {
        return repository.findAll();
    }

    public DannyCliente save(DannyCliente cliente) {
        return repository.save(cliente);
    }

    public void deleteByNombre(String nombre) {
        repository.deleteByNombre(nombre);
    }
}
