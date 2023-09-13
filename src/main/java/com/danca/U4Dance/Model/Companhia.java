package com.danca.U4Dance.Model;

public class Companhia {
    private int id;
    private String nome;
    private String cidade;
    private String nomeDono;
    private int anoDeCriacao;

    public Companhia() {
    }
    
    public Companhia(int id, String nome, String cidade, String nomeDono, int anoDeCriacao) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.nomeDono = nomeDono;
        this.anoDeCriacao = anoDeCriacao;
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }
}
