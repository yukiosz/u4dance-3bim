/*
package com.danca.U4Dance.Model;

import java.util.ArrayList;

import com.danca.U4Dance.Database;

public class CompanhiaDAO {
    private static Database db;
    private static CompanhiaDAO instance;

    private CompanhiaDAO(){
    }

    public static CompanhiaDAO getInstance(){
        if(instance == null){
            instance = new CompanhiaDAO();
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

    public void criarCompanhia(Companhia companhia){
        Database db = getConnection();
        db.addCompanhia(companhia);
    }

    public ArrayList<Companhia> read(){
        Database db = getConnection();
        return db.recuperaCompanhia();
    }

    public void deletarCompanhia(Companhia companhia){
        Database db = getConnection();
        db.delCompanhia(companhia);;
    }
}
*/
