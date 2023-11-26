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

import com.danca.U4Dance.Model.Organizador;
import com.danca.U4Dance.Repository.OrganizadorRepository;

@RestController
@CrossOrigin
public class OrganizadorController {

    @Autowired
    OrganizadorRepository organizadorRepository;

    @GetMapping("/organizadores/listar")
    public List<Organizador> recuperar(){
        return (List<Organizador>) organizadorRepository.findAll();
    }

    @PostMapping("/organizadores")
    public Organizador cadastrar(@RequestBody Organizador org){
        return organizadorRepository.save(org);
    }

    @DeleteMapping("/organizadores/{id}")
    public String deletar(@PathVariable("id") Long id){
        organizadorRepository.deleteById(id);
        return "Organizador do id "+ id +"excluído.";
    }
}
