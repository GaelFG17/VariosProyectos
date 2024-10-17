package com.tesji.apitrakstesji.controller;

//Clase que define el acceso a la API mediante una url
//Y tambien los end-points (peticiones http)

import com.tesji.apitrakstesji.model.DatosApiTraks;
import com.tesji.apitrakstesji.repository.CrudApiTraksRepository;
import com.tesji.apitrakstesji.service.ApiTraksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api-traks")
public class ApiTraks {

    //Inyectar mi objeto repositorio con las operacioes crud
    @Autowired
    ApiTraksService apiTraksService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/get-prueba")
    public String pruebaGet(){
        return "Funciona!!! Bienvenido a API TRAKS TESJI";
    }

    @GetMapping("/get-mostrartodo")
    public ArrayList<DatosApiTraks> mostrarTodosTraks(){
        return apiTraksService.mostrarTraks();
    }

    @GetMapping("/get-mostrartrack/{id}")
    public Optional<DatosApiTraks> mostrarTrack(@PathVariable("id") long id){
        return apiTraksService.buscarTrakPorId(id);
    }

    @PostMapping("/guardartrack")
    public DatosApiTraks registrarTrack(@RequestBody DatosApiTraks cancion){
        return apiTraksService.registrarTrak(cancion);
    }

    @DeleteMapping("/borrartrack/{id}")
    public String borrarTrack(@PathVariable("id") long id){
        if(apiTraksService.eliminarTrak(id)) {
            return "Eliminado correctamente";
        }else {
            return "No borrado";
        }
    }
}
