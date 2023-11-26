package com.danca.U4Dance.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.danca.U4Dance.Model.Evento;
import com.danca.U4Dance.Repository.EventoRepository;

@RestController
@CrossOrigin
public class EventoController {

    @Autowired
    EventoRepository eventoRepository;

    @GetMapping("/eventos/listar")
    public List<Evento> recuperar(){
        return (List<Evento>) eventoRepository.findAll();
    }

    @PostMapping("/eventos")
    public Evento adicionar(@RequestBody Evento evento){
        return eventoRepository.save(evento);
    }

    @DeleteMapping("/eventos/{id}")
    public String deletar(@PathVariable("id") Long id){
        eventoRepository.deleteById(id);
        return "O evento de id "+id+" foi excluído!";
    }
}
