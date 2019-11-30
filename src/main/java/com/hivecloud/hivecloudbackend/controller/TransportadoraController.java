package com.hivecloud.hivecloudbackend.controller;

import com.hivecloud.hivecloudbackend.domain.Transportadora;
import com.hivecloud.hivecloudbackend.domain.dto.TransportadoraDTO;
import com.hivecloud.hivecloudbackend.service.TransportadoraService;
import com.hivecloud.hivecloudbackend.util.Response;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/transportadora")
public class TransportadoraController {

    @Autowired
    TransportadoraService transportadoraService;

    @PostMapping
    public ResponseEntity<Transportadora> inserirTransportadora(@RequestBody @Valid TransportadoraDTO transportadoraDTO){
        Transportadora transportadora = new ModelMapper().map(transportadoraDTO, Transportadora.class);
        return new ResponseEntity<>(transportadoraService.inserirTransportadora(transportadora), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Transportadora> alterarTransportadora(@RequestBody @Valid TransportadoraDTO transportadoraDTO, @PathVariable Long id){
        Transportadora transportadora = new ModelMapper().map(transportadoraDTO, Transportadora.class);
        return new ResponseEntity<>(transportadoraService.alterarTransportadora(transportadora, id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Transportadora>> listarTransportadoras(){
        return new ResponseEntity<>(transportadoraService.listarTransportadoras(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Response> excluirPorCodigo(@PathVariable Long id){
        return new ResponseEntity<>(transportadoraService.excluirPorId(id),HttpStatus.OK);
    }
}
