/*
package com.danca.U4Dance.Model;

import java.util.ArrayList;

import com.danca.U4Dance.Database;

public class EventoDAO {
    public static Database db;
    private static EventoDAO instance;
    public static ArrayList<Evento> Eventoes = db.recuperaEvento();

    public static EventoDAO getInstance(){
        if(instance == null){
            instance = new EventoDAO();
        }
        return instance;
    }

    private Database getConnection(){
        if(this.db == null){
            Database db = new Database();
            this.db = db;
        }
        return this.db;
    }

    public void criarEvento(Evento evento){
        Database db = getConnection();
        db.addEvento(evento);
    }

    public ArrayList<Evento> read(){
        Database db = getConnection();
        return db.recuperaEvento();
    }

    public void deletarEvento(Evento evento){
        Database db = getConnection();
        db.delEvento(evento);
    }
}
*/