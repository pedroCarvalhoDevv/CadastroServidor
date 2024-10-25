package com.cadastro.cadastroServidor.model.dto;

public class LotacaoDto {

    private String descricao;

    public LotacaoDto() {
    }

    public LotacaoDto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
