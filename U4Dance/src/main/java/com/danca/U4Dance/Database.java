package com.danca.U4Dance;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.danca.U4Dance.Model.Companhia;

public class Database {
    private static ArrayList<Companhia> companhias;
	
    public static void init(){
        companhias = new ArrayList<Companhia>();
        companhias.add(new Companhia(1, "Studio Magic Dance", "Bragança Paulista", "Binho", 2023));
    }

    public Database() {
        companhias = new ArrayList<>();
    }

	public static void addCompanhia(Companhia comp) {
        companhias.add(comp);
    }

    public static ArrayList<Companhia> recuperaCompanhia() {
        return companhias;
    }
    
    public static void delCompanhia(Companhia companhia) {
        Predicate<Companhia> deletar = companhialista -> companhialista.getId() == companhia.getId();
		companhias.removeIf(deletar);
    }
}
