package com.danca.U4Dance.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.danca.U4Dance.Database;
import com.danca.U4Dance.Model.Organizador;

@RestController
public class OrganizadorController {
    @GetMapping("/organizadores")
    public List<Organizador> listarOrganizadores(){
        return Database.recuperaOrganizador();
    }

    @PostMapping("/organizadores")
    public void addOrganizador(@RequestBody Organizador org){
        Database.addOrganizador(org);
    }

    @DeleteMapping("/organizadores")
    public void deletarOrganizaores(@RequestBody Organizador org){
        Database.delOrganizador(org);
    }
}
