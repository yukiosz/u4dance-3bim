package com.danca.U4Dance;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.danca.U4Dance.Model.Dancarino;

public class Database {
    private static ArrayList<Dancarino> dancarinos;
	
    public static void init(){
        dancarinos = new ArrayList<Dancarino>();
        dancarinos.add(new Dancarino(1, "Roberto Carlos", "Bragança Paulista", 20, "Hip-Hop"));
    }

    public Database() {
        dancarinos = new ArrayList<>();
    }

    public static void addDancarino(Dancarino danc){
        dancarinos.add(danc);
    }

    public static ArrayList<Dancarino> recuperaDancarino(){
        return dancarinos;
    }

    public static void delDancarino(Dancarino danc){
        Predicate<Dancarino> deletar = dancarinolista -> dancarinolista.getId() == danc.getId();
        dancarinos.removeIf(deletar);
    }
}
