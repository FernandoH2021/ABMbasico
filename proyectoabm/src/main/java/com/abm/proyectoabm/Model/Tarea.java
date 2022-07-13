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
    
    @Column(name = "Tarea")
    private String Tarea;
    
    @Column(name = "Finalizado")
    private Boolean Finalizado;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getTarea() {
        return Tarea;
    }

    public void setTarea(String Tarea) {
        this.Tarea = Tarea;
    }

    public Boolean getFinalizado() {
        return Finalizado;
    }

    public void setFinalizado(Boolean Finalizado) {
        this.Finalizado = Finalizado;
    }
    
}
