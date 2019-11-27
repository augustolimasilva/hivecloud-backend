package com.hivecloud.hivecloudbackend.service.impl;

import com.hivecloud.hivecloudbackend.domain.Transportadora;
import com.hivecloud.hivecloudbackend.exception.CustomException;
import com.hivecloud.hivecloudbackend.repository.TransportadoraRepository;
import com.hivecloud.hivecloudbackend.service.TransportadoraService;
import com.hivecloud.hivecloudbackend.util.Constantes;
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
    public Transportadora alterarTransportadora(Transportadora transportadora) {
        Optional<Transportadora> transp = transportadoraRepository.findById(transportadora.getId());

        if(transp.isPresent()) {
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
    public String excluirPorId(Long id) {
        Optional<Transportadora> transportadora = transportadoraRepository.findById(id);

        if(transportadora.isPresent()) {
            transportadoraRepository.deleteById(id);
            return Constantes.REGISTRO_EXCLUIDO_SUCESSO;
        }else {
            throw new CustomException(Constantes.TRANSPORTADORA_NAO_ENCONTRADA);
        }
    }
}
