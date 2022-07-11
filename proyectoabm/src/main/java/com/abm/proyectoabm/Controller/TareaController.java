//Recibe los eventos de entrada (un clic, un cambio en un campo de texto, etc.).
//Contiene reglas de gestión de eventos, del tipo "SI Evento Z, entonces Acción W".
package com.abm.proyectoabm.Controller;

import com.abm.proyectoabm.Model.Tarea;
import com.abm.proyectoabm.Service.TareaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*") //permite dar acceso de donde se puede conectar
@RequestMapping("/api") //indica la ruta de acceso
public class TareaController {

    @Autowired //nos permite inyectar dependencias
    //llamamos a nuestro servicio creando una nueva variable:

    private TareaService tareaService;

    //listar
    @GetMapping("/tareas")//nos va a indicar para mostrar algo
    public List<Tarea> listar() {

        return tareaService.findAll();

    }

    //guardar
    @PostMapping("/tareas") //tambien designamos una ruta
    //creamos la funcion
    public Tarea guardar(@RequestBody Tarea tarea) {

        return tareaService.save(tarea);

    }

    //get una tarea
    @GetMapping("/tareas/{id}")
    //creamos la funcion
    public Tarea getUnaTarea(@PathVariable Integer id) {

        return tareaService.findById(id);

    }

    //seleccionamos y modificamos
    @PutMapping("/tareas/{id}")//El método PUT HTTP se usa para modificar/actualizar un recurso donde el cliente envía datos que actualizan todo el recurso.
    public Tarea modificar(@RequestBody Tarea tarea, @PathVariable Integer id) {

        //creamos una nueva tarea
        Tarea tareaActual = tareaService.findById(id);

    }
}
