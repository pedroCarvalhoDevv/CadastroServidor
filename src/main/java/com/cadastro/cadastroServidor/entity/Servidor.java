package com.cadastro.cadastroServidor.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
@Table(name = "tb_servidor")
public class Servidor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matriculaId;
    private String nome;
    @Column(columnDefinition = "date")
    private LocalDate data;
    @ManyToOne
    @JoinColumn(name = "lotacao")
    private Lotacao lotacao;

    public Servidor() {
    }

    public Servidor(Long matriculaId, String nome, LocalDate data, Lotacao lotacao) {
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Lotacao getLotacao() {
        return lotacao;
    }

    public void setLotacao(Lotacao lotacao) {
        this.lotacao = lotacao;
    }

}
