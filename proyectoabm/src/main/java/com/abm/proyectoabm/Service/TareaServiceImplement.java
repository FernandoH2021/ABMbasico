
package com.abm.proyectoabm.Service;

import com.abm.proyectoabm.Dao.TareaDao;
import com.abm.proyectoabm.Model.Tarea;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TareaServiceImplement implements TareaService {

    @Autowired //con esto insertamos dependencias
    private TareaDao tareaDao; // a tareaDao la estamos llamando para utilizar las funciones de springboot
    
    @Override //La anotación @Override se utiliza, para forzar al compilador a comprobar en tiempo de compilación que estás sobrescribiendo correctamente un método, y de este modo evitar errores en tiempo de ejecución, los cuales serían mucho más difíciles de detectar.
    @Transactional(readOnly = true)
    public List<Tarea> findAll(){
        return (List<Tarea>) tareaDao.findAll();// retorna las funciones de tareasDao
        
    }
    //para el guardado
    @Override
    @Transactional(readOnly = false) //Una transacción de base de datos es un conjunto de instrucciones que se ejecutan en bloque. Por ejemplo, hago una consulta, modifico un registro A en la base de datos y elimino un registro B. Si en alguna de estas instrucciones se produce un error todo el proceso se echa atrás. De esta manera si luego consulto la base de datos veré que el registro A no ha sido alterado. Este proceso de «tirar atrás» las instrucciones realizadas se le dice hacer un rollback, mientras que el proceso de confirmar todas las instrucciones en bloque una vez hemos visto que no se ha producido ningún error se le llama hacer un commit.
     public Tarea save(Tarea tarea){
         return tareaDao.save(tarea);
         
     }
     @Override
     @Transactional(readOnly = true)
     public Tarea findById (Integer id){
         return tareaDao.findById(id).orElse(null);
         
     }
     @Override
     @Transactional(readOnly = false)
     public void delete(Integer id){
         tareaDao.deleteById(id);
     }
}
