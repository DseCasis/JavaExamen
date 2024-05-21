package com.example.danny;

import com.example.danny.DannyCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface DannyClienteRepository extends JpaRepository<DannyCliente, Long> {
    void deleteByNombre(String nombre);
    Optional<DannyCliente> findByNombre(String nombre);
}
