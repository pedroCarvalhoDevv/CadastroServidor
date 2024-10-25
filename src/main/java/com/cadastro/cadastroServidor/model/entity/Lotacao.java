package com.cadastro.cadastroServidor.model.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.util.Date;


@Entity
@Table(name = "tb_lotacao")
public class Lotacao {
private static final int NOME_MAX_LENGTH = 200;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String descricao;
    @Column(name = "data_Cadastro", updatable = false)
    private Date dataCadastro;

    public Lotacao(String nome) {
    }

    public Lotacao(Long id, String descricao, Date dataCadastro) {
        this.id = id;
        setDescricao(descricao);
        this.dataCadastro = dataCadastro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank String getDescricao() {
        return descricao;
    }

    public void setDescricao(@NotBlank String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
