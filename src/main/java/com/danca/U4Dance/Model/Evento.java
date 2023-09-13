package com.danca.U4Dance.Model;

public class Evento {
    private int id;
    private String nome;
    private String local;
    private String data;
    private String horário;

    public Evento(int id, String nome, String local, String data, String horário) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.horário = horário;
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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorário() {
        return horário;
    }

    public void setHorário(String horário) {
        this.horário = horário;
    }

}
