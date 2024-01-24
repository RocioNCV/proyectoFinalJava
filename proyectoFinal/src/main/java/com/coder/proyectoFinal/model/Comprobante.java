package com.coder.proyectoFinal.model;

import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.Date;

public class Comprobante {
    @Id
    private Integer idComprobante;
    private Integer cantidad;
    private Date fecha;
    private BigDecimal totalVenta;
}
