package com.hivecloud.hivecloudbackend.service;

import com.hivecloud.hivecloudbackend.domain.Transportadora;

import java.util.List;

public interface TransportadoraService {

    Transportadora inserirTransportadora(Transportadora transportadora);

    Transportadora alterarTransportadora(Transportadora transportadora);

    List<Transportadora> listarTransportadoras();

    String excluirPorId(Long id);
}
