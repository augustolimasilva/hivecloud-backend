package com.hivecloud.hivecloudbackend.service.impl;

import com.hivecloud.hivecloudbackend.domain.Transportadora;
import com.hivecloud.hivecloudbackend.exception.TransportadoraNaoEncontradaException;
import com.hivecloud.hivecloudbackend.repository.TransportadoraRepository;
import com.hivecloud.hivecloudbackend.service.TransportadoraService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TransportadoraServiceImpl implements TransportadoraService {

    @Autowired
    TransportadoraRepository transportadoraRepository;

    @Override
    public Transportadora inserirTransportadora(Transportadora transportadora) {
        return transportadoraRepository.save(transportadora);
    }

    @Override
    public Transportadora alterarTransportadora(Transportadora transportadora) {
        return transportadoraRepository.findById(transportadora.getId())
                .map(obj -> transportadoraRepository.save(transportadora))
                .orElseThrow(TransportadoraNaoEncontradaException::new);
    }

    @Override
    public List<Transportadora> listarTransportadoras() {
        return transportadoraRepository.findAll();
    }

    @Override
    public String excluirPorId(Long id) {
        transportadoraRepository.deleteById(id);
        return "Fornecedor excluído.";
    }
}
