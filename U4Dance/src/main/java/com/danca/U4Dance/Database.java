package com.danca.U4Dance;

import java.util.ArrayList;
import java.util.List;

import com.danca.U4Dance.Model.Companhia;

public class Database {
    private static ArrayList<Companhia> companhias;
	
    public static void init(){
        companhias = new ArrayList<Companhia>();
        companhias.add(new Companhia("Studio Magic Dance", "Bragança Paulista", "Binho", 2023));
    }

    public Database() {
        companhias = new ArrayList<>();
    }

	public static void addCompanhia(Companhia comp) {
        companhias.add(comp);
    }

    public static void delCompanhia(Companhia del) {
        companhias.remove(del);
    }

    public static ArrayList<Companhia> recuperaCompanhia() {
        return companhias;
    }

    public static List<Companhia> all(){
        return companhias;
    }
}
