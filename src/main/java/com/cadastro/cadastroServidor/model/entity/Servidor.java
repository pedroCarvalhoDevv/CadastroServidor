package com.cadastro.cadastroServidor.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@Entity
@Table(name = "tb_servidor")
public class Servidor {
private static final int NOME_MAX_LENGTH = 400;
private static final int MATRICULA_MAX_LENGHT = 200;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @NotBlank
    private String nome;
    @NotNull
    private String matricula;
    @Column(columnDefinition = "date")
    private Date data;
    @ManyToOne
    @JoinColumn(name = "lotacao")
    private Lotacao lotacao;

    public Servidor() {
    }

    public Servidor(Long id, String nome, String matricula, Date data, Lotacao lotacao) {
        Id = id;
        setNome(nome);
        setMatricula(matricula);
        this.data = data;
        this.lotacao = lotacao;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > NOME_MAX_LENGTH){
            this.nome = nome.substring(0,NOME_MAX_LENGTH);
        } else {
            this.nome = nome;
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula.length() > MATRICULA_MAX_LENGHT){
            this.matricula = matricula.substring(0,MATRICULA_MAX_LENGHT);
        } else {
            this.matricula = matricula;
        }
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Lotacao getLotacao() {
        return lotacao;
    }

    public void setLotacao(Lotacao lotacao) {
        this.lotacao = lotacao;
    }
}
