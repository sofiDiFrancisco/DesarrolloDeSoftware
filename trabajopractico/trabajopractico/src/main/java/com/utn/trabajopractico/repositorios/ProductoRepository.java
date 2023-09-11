package com.utn.trabajopractico.repositorios;

import com.utn.trabajopractico.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository <Producto, Long> {
}
