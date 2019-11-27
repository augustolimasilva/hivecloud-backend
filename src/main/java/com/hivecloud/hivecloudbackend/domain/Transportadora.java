package com.hivecloud.hivecloudbackend.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CNPJ;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.sql.Blob;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transportadora {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "email", length = 100, nullable = false)
    private String email;

    @Column(name = "nome", length = 300, nullable = false)
    private String nome;

    @Column(name = "empresa", length = 14, nullable = false)
    private String empresa;

    @Column(name = "telefone", length = 10, nullable = false)
    private String telefone;

    @Column(name = "celular", length = 11, nullable = true)
    private String celular;

    @Column(name = "whatsapp", length = 11, nullable = true)
    private String whatsapp;

    @Column(name = "modalidade", length = 20, nullable = false)
    private String modalidade;

    @Column(name = "rua", length = 200, nullable = false)
    private String rua;

    @Column(name = "numero", length = 10, nullable = false)
    private String numero;

    @Column(name = "bairro", length = 100, nullable = false)
    private String bairro;

    @Column(name = "cidade", length = 100, nullable = false)
    private String cidade;

    @Column(name = "uf", length = 2, nullable = false)
    private String uf;

    @Column(name = "logo", nullable = true)
    private Blob logo;

    @Column(name = "snAceitouTermos", length = 1, nullable = false)
    private String snAceitouTermos;
}
