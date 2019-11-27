package com.hivecloud.hivecloudbackend.service.impl;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.hivecloud.hivecloudbackend.domain.Transportadora;
import com.hivecloud.hivecloudbackend.exception.CustomException;
import com.hivecloud.hivecloudbackend.repository.TransportadoraRepository;
import com.hivecloud.hivecloudbackend.service.TransportadoraService;
import com.hivecloud.hivecloudbackend.util.Constantes;
import com.hivecloud.hivecloudbackend.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransportadoraServiceImpl implements TransportadoraService {

    @Autowired
    TransportadoraRepository transportadoraRepository;

    @Override
    public Transportadora inserirTransportadora(Transportadora transportadora) {
        return transportadoraRepository.save(transportadora);
    }

    @Override
    public Transportadora alterarTransportadora(Transportadora transportadora, Long id) {

        if(id == null){
            throw new CustomException(Constantes.ID_OBRIGATORIO);
        }

        Optional<Transportadora> transp = transportadoraRepository.findById(id);

        if(transp.isPresent()) {
            transportadora.setId(id);
            return transportadoraRepository.save(transportadora);
        }else {
            throw new CustomException(Constantes.TRANSPORTADORA_NAO_ENCONTRADA);
        }
    }

    @Override
    public List<Transportadora> listarTransportadoras() {
        return transportadoraRepository.findAll();
    }

    @Override
    public Response excluirPorId(Long id) {

        Optional<Transportadora> transportadora = transportadoraRepository.findById(id);

        if(transportadora.isPresent()) {
            transportadoraRepository.deleteById(id);
            return new Response("sucesso", "Registro excluído com sucesso.");
        }else {
            throw new CustomException(Constantes.TRANSPORTADORA_NAO_ENCONTRADA);
        }
    }
}
