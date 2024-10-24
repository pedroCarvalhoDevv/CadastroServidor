package com.cadastro.cadastroServidor.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

@Entity
@Table(name = "tb_lotacao")
public class Lotacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nome;
    @Column(name = "data_Cadastro", updatable = false)
    private Date dataCadastro;

    public Lotacao(String nome) {
    }

    public Lotacao(Long id, String nome, Date dataCadastro) {
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

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }


}
