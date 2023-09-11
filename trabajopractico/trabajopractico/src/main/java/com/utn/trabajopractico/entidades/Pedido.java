package com.utn.trabajopractico.entidades;

import jakarta.persistence.*;
import com.utn.trabajopractico.anexo.TipoEnvio;
import com.utn.trabajopractico.anexo.Estado;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Pedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Date fecha;
    private double total;
    private Estado estado;
    private TipoEnvio tipoenvio;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "factura_id")
    private Factura factura;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.EAGER)
    @JoinColumn(name = "detallepedido_id")
    @Builder.Default
    private List<DetallePedido> detallepedidos = new ArrayList<>();

    public void agregarDetallePedido(DetallePedido deta){
        detallepedidos.add(deta);
    }

}
