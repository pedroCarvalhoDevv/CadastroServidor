package com.cadastro.cadastroServidor.model.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_servidor")
public class Servidor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matriculaId;
    private String nome;
    @Column(columnDefinition = "date")
    private Date data;
    @ManyToOne
    @JoinColumn(name = "lotacao")
    private Lotacao lotacao;

    public Servidor() {
    }

    public Servidor(Long matriculaId, String nome, Date data, Lotacao lotacao) {
        this.matriculaId = matriculaId;
        this.nome = nome;
        this.data = data;
        this.lotacao = lotacao;
    }

    public Long getMatriculaId() {
        return matriculaId;
    }

    public void setMatriculaId(Long matriculaId) {
        this.matriculaId = matriculaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
