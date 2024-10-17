package com.tesji.apitrakstesji.service;

import com.tesji.apitrakstesji.model.DatosApiTraks;
import com.tesji.apitrakstesji.repository.CrudApiTraksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

//Exponer como un servicio en nuestra ApiRest
@Service
public class ApiTraksServiceImplement implements ApiTraksService{

    //inyectar un objeto de la clase CrudApiTraks para las operaciones crud
    @Autowired
    CrudApiTraksRepository crudApiTraksRepository;
    @Override
    public ArrayList<DatosApiTraks> mostrarTraks() {
        return (ArrayList<DatosApiTraks>) crudApiTraksRepository.findAll();
    }

    @Override
    public Optional<DatosApiTraks> buscarTrakPorId(long id) {
        return crudApiTraksRepository.findById(id);
    }

    @Override
    public DatosApiTraks registrarTrak(DatosApiTraks cancion) {
        return crudApiTraksRepository.save(cancion);
    }

    @Override
    public boolean eliminarTrak(long id) {
        Optional<DatosApiTraks> track = buscarTrakPorId(id);
        if (track.isPresent()){
            crudApiTraksRepository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }
}
