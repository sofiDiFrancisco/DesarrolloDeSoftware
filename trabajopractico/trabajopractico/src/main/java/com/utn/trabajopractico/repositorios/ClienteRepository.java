package com.utn.trabajopractico.repositorios;

import com.utn.trabajopractico.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long> {
}
