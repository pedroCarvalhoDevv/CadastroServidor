package com.cadastro.cadastroServidor.model.dto;

import java.util.Date;

public class ServidorDto {


    private String nome;
    private Long id;
    private Date dataCadastro;


    public ServidorDto() {
    }

    public ServidorDto(String nome, Long id, Date dataCadastro) {
        this.nome = nome;
        this.id = id;
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
