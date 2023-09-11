package com.utn.trabajopractico.entidades;

import com.utn.trabajopractico.anexo.FormaPago;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Factura implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private int numero;
    private Date fecha;
    private double descuento;
    private int total;
    private FormaPago formapago;

}
