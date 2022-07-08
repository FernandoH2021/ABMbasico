
package com.abm.proyectoabm.Service;

import com.abm.proyectoabm.Model.Tarea;
import java.util.List;


public interface TareaService {
    //aca declaramos las funciones crud
    
    public List<Tarea> findAll();
    public Tarea save(Tarea tarea);
    public Tarea findById (Integer id); //selecciona un elemento a traves del id
    
    //para eliminar creamos una variable
    
    public void delete(Integer id);
    
    
    
}
