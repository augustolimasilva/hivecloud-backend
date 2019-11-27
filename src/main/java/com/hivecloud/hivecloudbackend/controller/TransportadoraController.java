package com.hivecloud.hivecloudbackend.controller;

import com.hivecloud.hivecloudbackend.domain.Transportadora;
import com.hivecloud.hivecloudbackend.domain.dto.TransportadoraDTO;
import com.hivecloud.hivecloudbackend.service.TransportadoraService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import com.hivecloud.hivecloudbackend.response.Response;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/transportadora")
public class TransportadoraController {

    @Autowired
    TransportadoraService transportadoraService;

    @PostMapping
    public ResponseEntity<Response> inserirTransportadora(@RequestBody @Valid TransportadoraDTO transportadoraDTO){
        Transportadora transportadora = new ModelMapper().map(transportadoraDTO, Transportadora.class);
        return ResponseEntity.ok(new Response(transportadoraService.inserirTransportadora(transportadora)));
    }

    @PutMapping
    public ResponseEntity<Response> alterarTransportadora(@RequestBody @Valid TransportadoraDTO transportadoraDTO){
        Transportadora transportadora = new ModelMapper().map(transportadoraDTO, Transportadora.class);
        return ResponseEntity.ok(new Response(transportadoraService.alterarTransportadora(transportadora)));
    }

    @GetMapping
    public ResponseEntity<Response> listarTransportadoras(){
        return ResponseEntity.ok(new Response(transportadoraService.listarTransportadoras()));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Response> excluirPorCodigo(@PathVariable Long id){
        return ResponseEntity.ok(new Response(transportadoraService.excluirPorId(id)));
    }
}
