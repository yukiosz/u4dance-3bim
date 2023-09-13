package com.danca.U4Dance;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.danca.U4Dance.Model.Organizador;

public class Database {
    private static ArrayList<Organizador> organizadores;

    public static void init() {
        organizadores = new ArrayList<Organizador>();

        organizadores.add(new Organizador(1, "Cauê", "Dancing Stars", 29));
    }

    public Database() {
        organizadores = new ArrayList<>();
    }

    public static void addOrganizador(Organizador org) {
        organizadores.add(org);
    }

    public static ArrayList<Organizador> recuperaOrganizador() {
        return organizadores;
    }

    public static void delOrganizador(Organizador org) {
        Predicate<Organizador> deletar = organizadorlista -> organizadorlista.getId() == org.getId();
        organizadores.removeIf(deletar);
    }
}