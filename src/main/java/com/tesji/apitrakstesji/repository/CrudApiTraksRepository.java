package com.tesji.apitrakstesji.repository;

import com.tesji.apitrakstesji.model.DatosApiTraks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudApiTraksRepository extends CrudRepository<DatosApiTraks,Long> {
}
