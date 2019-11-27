package com.hivecloud.hivecloudbackend.exception;

public class TransportadoraNaoEncontradaException extends RuntimeException {

    public TransportadoraNaoEncontradaException(){
        super("A tranportadora informada não foi encontrado.");
    }
}
