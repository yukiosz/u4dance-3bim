package com.danca.U4Dance;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.danca.U4Dance.Model.Dancarino;
import com.danca.U4Dance.Model.Evento;
import com.danca.U4Dance.Model.Organizador;

public class Database {
    private static ArrayList<Organizador> organizadores;
    private static ArrayList<Dancarino> dancarinos;
    private static ArrayList<Evento> eventos;
    
    public static void init() {
        organizadores = new ArrayList<Organizador>();
        dancarinos = new ArrayList<Dancarino>();
        eventos = new ArrayList<Evento>();

        eventos.add(new Evento(1, "Evento de Dança Bragantina", "Lago do Taboão", "17/09", "13:00"));
        dancarinos.add(new Dancarino(1, "Roberto Carlos", "Bragança Paulista", 20, "Hip-Hop"));
        organizadores.add(new Organizador(1, "Cauê", "Dancing Stars", 29));
    }

    public Database() {
        organizadores = new ArrayList<>();
        dancarinos = new ArrayList<>();
        eventos = new ArrayList<>();
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

        
    public static void addEvento(Evento evento) {
        eventos.add(evento);
    }

    public static ArrayList<Evento> recuperaEvento() {
        return eventos;
    }

    public static void delEvento(Evento evento) {
        Predicate<Evento> deletar = eventolista -> eventolista.getId() == evento.getId();
        eventos.removeIf(deletar);
    }
}