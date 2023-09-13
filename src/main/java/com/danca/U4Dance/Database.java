package com.danca.U4Dance;

import java.util.ArrayList;
import java.util.function.Predicate;

import org.yaml.snakeyaml.events.Event;

import com.danca.U4Dance.Model.Evento;

public class Database {
    private static ArrayList<Evento> eventos;

    public static void init() {
        eventos = new ArrayList<Evento>();

        eventos.add(new Evento(1, "Evento de Dança Bragantina", "Lago do Taboão", "17/09", "13:00"));
    }

    public Database() {
        eventos = new ArrayList<>();
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
