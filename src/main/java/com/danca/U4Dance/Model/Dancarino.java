package com.danca.U4Dance.Model;

public class Dancarino{

    protected int id;
    protected String nome;
    protected String cidade;
    protected int idade;
    protected String estilo;
    
    public Dancarino(int id, String nome, String cidade, int idade, String estilo) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.idade = idade;
        this.estilo = estilo;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    

}
