package com.coder.proyectoFinal.repository;

import com.coder.proyectoFinal.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Cliente, Long> {
}
