package com.utn.trabajopractico.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.utn.trabajopractico.entidades.Domicilio;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends JpaRepository <Domicilio, Long> {
}
