package com.coder.proyectoFinal.model;

import jakarta.persistence.Id;

public class Cliente {
    @Id
    private Integer idCliente;
    private String nombre;
    private String email;
    private Integer dni;

    public Cliente() {
    }

    public Cliente(Integer idCliente, String nombre, String email, Integer dni) {
        this.idCliente = idCliente;
        this.nombre = nombre;
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
}
