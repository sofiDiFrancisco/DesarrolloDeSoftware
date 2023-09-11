package com.utn.trabajopractico.repositorios;

import com.utn.trabajopractico.entidades.Rubro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RubroRepository extends JpaRepository <Rubro,Long> {
}
