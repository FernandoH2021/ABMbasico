//Esta clase representa a la tabla tarea de la base de datos
package com.abm.proyectoabm.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tarea")
public class Tarea {
    //creamos los atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para el auto incrementado
    @Column(name = "Id")
    private Integer Id;
    
    @Column(name = "Objetivo")
    private String Objetivo;
    
    @Column(name = "Cumplido")
    private Boolean Cumplido;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getObjetivo() {
        return Objetivo;
    }

    public void setObjetivo(String Objetivo) {
        this.Objetivo = Objetivo;
    }

    public Boolean getCumplido() {
        return Cumplido;
    }

    public void setCumplido(Boolean Cumplido) {
        this.Cumplido = Cumplido;
    }
    
}
