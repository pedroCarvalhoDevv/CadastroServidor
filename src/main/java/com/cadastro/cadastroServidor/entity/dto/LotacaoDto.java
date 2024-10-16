package com.cadastro.cadastroServidor.entity.dto;

import java.time.LocalDateTime;

public class LotacaoDto {

    private Long id;
    @NotBlank
    private String nome;
    private LocalDateTime dataCadastro;

    public LotacaoDto() {
    }

    public LotacaoDto(Long id, String nome, LocalDateTime dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.dataCadastro = dataCadastro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
