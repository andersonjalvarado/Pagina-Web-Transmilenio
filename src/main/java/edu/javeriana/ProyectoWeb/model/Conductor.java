package edu.javeriana.ProyectoWeb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "conductores")
public class Conductor {
    @Id //se identifica como clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //le genera un valor unico
    private Long id;

    //Atributos
    @Column(name = "name", nullable = false)
    @NotBlank(message = "no puede estar en blanco")   
    private String name;

    @Column(name = "cedula", nullable = false)
    @NotBlank(message = "no puede estar en blanco")                                                  
    private String cedula;

    @Column(name = "telefono", nullable = false)
    @NotBlank(message = "no puede estar en blanco")      
    private long telefono;

    @Column(name = "direccion", nullable = false)
    @NotBlank(message = "no puede estar en blanco")      
    private String direccion;

    //Constructores
    public Conductor(){

    }

    public Conductor(@NotBlank(message = "no puede estar en blanco") String name,
            @NotBlank(message = "no puede estar en blanco") String cedula,
            @NotBlank(message = "no puede estar en blanco") long telefono,
            @NotBlank(message = "no puede estar en blanco") String direccion) {
        this.name = name;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    //Setters & Getters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}