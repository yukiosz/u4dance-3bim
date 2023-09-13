package com.danca.U4Dance.Model;

public class Organizador {
    protected int id;
    protected String nome;
    protected String nomeEmpresa;
    protected int idade;

    public Organizador(int id, String nome, String nomeEmpresa, int idade) {
        this.id = id;
        this.nome = nome;
        this.nomeEmpresa = nomeEmpresa;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
