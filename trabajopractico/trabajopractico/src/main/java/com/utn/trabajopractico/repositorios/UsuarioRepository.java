package com.utn.trabajopractico.repositorios;

import com.utn.trabajopractico.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
}
