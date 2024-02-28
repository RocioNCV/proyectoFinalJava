package com.coder.proyectoFinal.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="comprobante")
@NamedQuery(name="Comprobante.findAll", query="SELECT c FROM Comprobante c")
public class Comprobante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idComprobante;
    private Integer cantidad;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    private BigDecimal totalVenta;

    @ManyToOne
    @JoinColumn(name="clienteid")
    private Cliente cliente;

    @OneToMany(mappedBy="comprobante", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Linea> lineas;

    public Comprobante() {
    }

    public Integer getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(Integer idComprobante) {
        this.idComprobante = idComprobante;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(BigDecimal totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<Linea> getLineas() {
        return lineas;
    }

    public void setLineas(Set<Linea> lineas) {
        this.lineas = lineas;
    }

    public Linea addLinea(Linea linea) {
        getLineas().add(linea);
        linea.setComprobante(this);

        return linea;
    }

    public Linea removeLinea(Linea linea) {
        getLineas().remove(linea);
        linea.setComprobante(null);

        return linea;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Comprobante [");
        if (idComprobante != null)
            builder.append("idComprobante=").append(idComprobante).append(", ");
        if (cantidad != null)
            builder.append("cantidad=").append(cantidad).append(", ");
        if (fecha != null)
            builder.append("fecha=").append(fecha).append(", ");
        if (totalVenta != null)
            builder.append("totalVenta=").append(totalVenta).append(", ");
        if (cliente != null)
            builder.append("cliente=").append(cliente).append(", ");
        if (lineas != null)
            builder.append("lineas=").append(lineas);
        builder.append("]");
        return builder.toString();
    }
}
