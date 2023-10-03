package com.danca.U4Dance.Model;

import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;

@Entity
public class Organizador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String nome;
    protected String nomeEmpresa;
    protected int idade;

    public Companhia(){

    }

    public Organizador(String nome, String nomeEmpresa, int idade) {
        this.nome = nome;
        this.nomeEmpresa = nomeEmpresa;
        this.idade = idade;
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

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
