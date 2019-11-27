package com.hivecloud.hivecloudbackend.service;

import com.hivecloud.hivecloudbackend.domain.Transportadora;
import com.hivecloud.hivecloudbackend.util.Response;

import java.util.List;

public interface TransportadoraService {

    Transportadora inserirTransportadora(Transportadora transportadora);

    Transportadora alterarTransportadora(Transportadora transportadora, Long id);

    List<Transportadora> listarTransportadoras();

    Response excluirPorId(Long id);
}
