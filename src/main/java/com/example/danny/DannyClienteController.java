package com.example.danny;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dannyclientes")
public class DannyClienteController {

    @Autowired
    private DannyClienteService service;

    @GetMapping("/all")
    public List<DannyCliente> getAll() {
        return service.getAll();
    }

    @PostMapping("/save")
    public DannyCliente save(@RequestBody DannyCliente cliente) {
        return service.save(cliente);
    }

    @DeleteMapping("/delete")
    public void deleteByNombre(@RequestParam String nombre) {
        service.deleteByNombre(nombre);
    }
}
