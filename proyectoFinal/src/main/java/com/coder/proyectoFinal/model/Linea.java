package com.coder.proyectoFinal.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name="linea")
@NamedQuery(name="Linea.findAll", query="SELECT l FROM Linea l")
public class Linea implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idlinea;

    private Integer cantidad;

    private String descripcion;

    private BigDecimal precio;

    //bi-directional many-to-one association to Comprobante
    @ManyToOne
    @JoinColumn(name="idcomprobante")
    private Comprobante comprobante;

    //bi-directional many-to-one association to Producto
    @ManyToOne
    @JoinColumn(name="idproducto")
    private Producto producto;

    public Linea() {
    }

    public Integer getIdlinea() {
        return this.idlinea;
    }

    public void setIdlinea(Integer lineaId) {
        this.idlinea = lineaId;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return this.precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Comprobante getComprobante() {
        return this.comprobante;
    }

    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Linea [idlinea=").append(idlinea).append(", cantidad=").append(cantidad).append(", ");
        if (descripcion != null)
            builder.append("descripcion=").append(descripcion).append(", ");
        if (precio != null)
            builder.append("precio=").append(precio);
        builder.append("]");
        return builder.toString();
    }


}
