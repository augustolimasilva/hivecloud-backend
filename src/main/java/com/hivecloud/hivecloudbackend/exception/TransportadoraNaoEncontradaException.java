package com.hivecloud.hivecloudbackend.exception;

public class TransportadoraNaoEncontradaException extends RuntimeException {

    public TransportadoraNaoEncontradaException(){
        super("O Fornecedor informado não foi encontrado.");
    }
}
