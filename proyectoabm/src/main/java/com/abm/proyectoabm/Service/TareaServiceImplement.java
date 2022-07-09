
package com.abm.proyectoabm.Service;

import com.abm.proyectoabm.Dao.TareaDao;
import com.abm.proyectoabm.Model.Tarea;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class TareaServiceImplement implements TareaService {

    @Autowired //con esto insertamos dependencias
    private TareaDao tareaDao; // a tareaDao la estamos llamando para utilizar las funciones de springboot
    
    public List<Tarea> findAll(){
        return (List<Tarea>) tareaDao.findAll();// retorna las funciones de tareasDao
        
    }
    //para el guardado
     public Tarea save(Tarea tarea){
         return tareaDao.save(tarea);
         
     }
     public Tarea findById (Integer id){
         return tareaDao.findById(id).orElse(null);
         
     }
     public void delete(Integer id){
         tareaDao.deleteById(id);
     }
}
