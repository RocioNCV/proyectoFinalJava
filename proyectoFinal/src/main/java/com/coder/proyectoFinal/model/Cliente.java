package com.coder.proyectoFinal.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="cliente")
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idCliente;
    private String nombre;
    private String apellido;
    private String email;
    private Integer dni;

    public Cliente() {
    }

    public Cliente(Integer idCliente, String nombre, String apellido, String email, Integer dni) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.dni = dni;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Cliente [");
        if (idCliente != null)
            builder.append("idCliente=").append(idCliente).append(", ");
        if (dni != null)
            builder.append("dni=").append(dni);
        builder.append("]");
        return builder.toString();
    }
}
