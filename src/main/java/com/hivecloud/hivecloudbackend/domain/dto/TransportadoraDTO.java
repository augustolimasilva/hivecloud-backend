package com.hivecloud.hivecloudbackend.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.sql.Blob;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransportadoraDTO {

    @Length(min = 10, max = 100, message =  "{transportadora.email.length}")
    private String email;

    @Length(min = 4, max = 300, message =  "{transportadora.nome.length}")
    private String nome;

    @Length(min = 14, max = 14, message =  "{transportadora.cnpj.length}")
    private String empresa;

    private int telefone;

    private int celular;

    private int whatsapp;

    @Length(min = 5, max = 20, message =  "{transportadora.modalidade.length}")
    private String modalidade;

    @Length(min = 5, max = 200, message =  "{transportadora.rua.length}")
    private String rua;

    private int numero;

    @Length(min = 3, max = 100, message =  "{transportadora.bairro.length}")
    private String bairro;

    @Length(min = 3, max = 100, message =  "{transportadora.cidade.length}")
    private String cidade;

    @Length(min = 2, max = 2, message =  "{transportadora.uf.length}")
    private String uf;

    private Blob logo;

    @Length(min = 1, max = 1, message =  "{transportadora.snAceitouTermos.length}")
    private String snAceitouTermos;
}
