package com.utn.trabajopractico.repositorios;

import com.utn.trabajopractico.entidades.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallePedidoRepository extends JpaRepository <DetallePedido, Long> {
}
