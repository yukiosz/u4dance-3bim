package com.danca.U4Dance.Model;

import java.util.ArrayList;

import com.danca.U4Dance.Database;

public class OrganizadorDAO {
    public static Database db;
    private static OrganizadorDAO instance;
    public static ArrayList<Organizador> organizadores = db.recuperaOrganizador();

    public static OrganizadorDAO getInstance(){
        if(instance == null){
            instance = new OrganizadorDAO();
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

    public void criarOrganizador(Organizador org){
        Database db = getConnection();
        db.addOrganizador(org);
    }

    public ArrayList<Organizador> read(){
        Database db = getConnection();
        return db.recuperaOrganizador();
    }

    public void deletarOrganizador(Organizador org){
        Database db = getConnection();
        db.delOrganizador(org);
    }
}