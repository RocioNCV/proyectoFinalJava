package com.coder.proyectoFinal.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name="producto")
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idProducto;
    private Integer cantidad;
    private Integer codigo;
    private String descripcion;
    private BigDecimal precio;

    public Producto() {
    }

    public Producto(Integer idProducto, Integer cantidad, Integer codigo, String descripcion, BigDecimal precio) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Producto [");
        if (idProducto != null)
            builder.append("idProducto=").append(idProducto).append(", ");
        if (cantidad != null)
            builder.append("cantidad=").append(cantidad).append(", ");
        if (codigo != null)
            builder.append("codigo=").append(codigo);
        builder.append("]");
        return builder.toString();
    }
}
