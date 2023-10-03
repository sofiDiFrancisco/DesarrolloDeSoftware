package com.utn.apiRest.servicios;

import com.utn.apiRest.entidades.Localidad;
import com.utn.apiRest.repositorios.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}