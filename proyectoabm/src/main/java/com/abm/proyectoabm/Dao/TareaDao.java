//Esta interface lo que hace es utilizar las funciones CRUD de springboot
package com.abm.proyectoabm.Dao;

import com.abm.proyectoabm.Model.Tarea;
import org.springframework.data.repository.CrudRepository;

public interface TareaDao extends CrudRepository <Tarea, Integer> { //para ver las funciones del CrudRepository colocar Ctrl + CrudRepository
    
    
}
