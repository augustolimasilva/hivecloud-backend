package com.hivecloud.hivecloudbackend.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.sql.Blob;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransportadoraDTO {

    @Length(min = 10, max = 100, message =  "{transportadora.email.length}")
    @Email(message = "{transportadora.email.msg}")
    private String email;

    @Length(min = 4, max = 300, message = "{transportadora.nome.length}")
    private String nome;

    @Length(min = 14, max = 14, message = "{transportadora.cnpj.length}")
    @CNPJ(message = "{transportadora.cnpj.msg}")
    private String empresa;

    @Length(min = 10, max = 10, message = "{transportadora.telefone.length}")
    private String telefone;

    @Length(max = 11, message = "{transportadora.celular.length}")
    private String celular;

    @Length(max = 11, message = "{transportadora.whatsapp.length}")
    private String whatsapp;

    @Length(min = 5, max = 20, message =  "{transportadora.modalidade.length}")
    private String modalidade;

    @Length(max = 8, message = "{transportadora.cep.length")
    private String cep;

    @Length(min = 5, max = 200, message =  "{transportadora.rua.length}")
    private String rua;

    @Length(min = 1, max = 10, message = "{transportadora.numero.length}")
    private String numero;

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
