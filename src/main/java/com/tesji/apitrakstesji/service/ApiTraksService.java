package com.tesji.apitrakstesji.service;

import com.tesji.apitrakstesji.model.DatosApiTraks;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

//Definir Los metodos abstractos para implementarlos en los end-points
public interface ApiTraksService {
    ArrayList<DatosApiTraks> mostrarTraks(); //metodo para mostrar todos los traks
    Optional<DatosApiTraks> buscarTrakPorId(long id);
    DatosApiTraks registrarTrak(DatosApiTraks cancion); //registrar y actualizar
    boolean eliminarTrak(long id);
}
