package com.cadastro.cadastroServidor.model.dto;

import java.util.Date;

public class LotacaoDto {

    private String nome;
    private Date dataCadastro;

    public LotacaoDto() {
    }

    public LotacaoDto(String nome) {
        this.nome = nome;
        this.dataCadastro = new Date();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
