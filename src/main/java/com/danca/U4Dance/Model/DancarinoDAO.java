package com.danca.U4Dance.Model;

import java.util.ArrayList;

import com.danca.U4Dance.Database;

public class DancarinoDAO {
    public static Database db;
    private static DancarinoDAO instance;
    public static ArrayList<Dancarino> dancarinos = db.recuperaDancarino();

    public static DancarinoDAO getInstance(){
        if(instance == null){
            instance = new DancarinoDAO();
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

    public void criarDancarino(Dancarino danc){
        Database db = getConnection();
        db.addDancarino(danc);
    }

    public ArrayList<Dancarino> read(){
        Database db = getConnection();
        return db.recuperaDancarino();
    }

    public void deletarDancarino(Dancarino del){
        Database db = getConnection();
        db.delDancarino(del);
    }

}
