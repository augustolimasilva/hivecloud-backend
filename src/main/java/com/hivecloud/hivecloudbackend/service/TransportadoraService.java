package com.hivecloud.hivecloudbackend.service;

import com.hivecloud.hivecloudbackend.domain.Transportadora;
import com.hivecloud.hivecloudbackend.util.Response;

import java.util.List;
import java.util.Optional;

public interface TransportadoraService {

    Transportadora inserirTransportadora(Transportadora transportadora);

    Transportadora alterarTransportadora(Transportadora transportadora, Long id);

    List<Transportadora> listarTransportadoras();

    Response excluirPorId(Long id);

    Transportadora pesquisarPorId(Long id);
}
