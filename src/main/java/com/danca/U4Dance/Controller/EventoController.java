package com.danca.U4Dance.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.danca.U4Dance.Database;
import com.danca.U4Dance.Model.Evento;

@RestController
public class EventoController {
    @GetMapping("/eventos")
    public List<Evento> listarEventos(){
        return Database.recuperaEvento();
    }

    @PostMapping("/eventos")
    public void addEvento(@RequestBody Evento evento){
        Database.addEvento(evento);
    }

    @DeleteMapping("/eventos")
    public void deletarEventos(@RequestBody Evento evento){
        Database.delEvento(evento);
    }
}
