package com.utn.trabajopractico.entidades;

import jakarta.persistence.*;
import com.utn.trabajopractico.anexo.Tipo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private int tiempoEstimadoCocina;
    private String denominacion;
    private double precioVenta;
    private double precioCompra;
    private int stockActual;
    private int stockMinimo;
    private String receta;
    private String unidadMedida;
    private Tipo tipo;

}

