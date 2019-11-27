package com.hivecloud.hivecloudbackend.domain.dto;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.sql.Blob;

public class TransportadoraDTO {

    @Length(min = 10, max = 100, message =  "{fornecedor.email.length}")
    private String email;

    @Length(min = 4, max = 300, message =  "{fornecedor.nome.length}")
    private String nome;

    @Length(min = 14, max = 14, message =  "{fornecedor.cnpj.length}")
    private String empresa;

    private int telefone;

    private int celular;

    private int whatsapp;

    @Length(min = 5, max = 20, message =  "{fornecedor.modalidade.length}")
    private String modalidade;

    @Length(min = 5, max = 200, message =  "{fornecedor.rua.length}")
    private String rua;

    private int numero;

    @Length(min = 3, max = 100, message =  "{fornecedor.bairro.length}")
    private String bairro;

    @Length(min = 3, max = 100, message =  "{fornecedor.cidade.length}")
    private String cidade;

    @Length(min = 2, max = 2, message =  "{fornecedor.uf.length}")
    private String uf;

    private Blob logo;

    @Length(min = 1, max = 1, message =  "{fornecedor.snAceitouTermos.length}")
    private String snAceitouTermos;
}
