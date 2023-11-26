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

import com.danca.U4Dance.Model.Dancarino;
import com.danca.U4Dance.Repository.DancarinoRepository;

@RestController
@CrossOrigin
public class DancarinoController {

    @Autowired 
    DancarinoRepository dancarinoRepository;

    @GetMapping("/dancarinos/listar")
    public List<Dancarino> recuperar(){
        return (List<Dancarino>) dancarinoRepository.findAll();
    }

    @PostMapping("/dancarinos")
        public Dancarino adicionarDanc(@RequestBody Dancarino danc){
            return dancarinoRepository.save(danc);
        }
    
    @DeleteMapping("/dancarinos/{id}")
    public String deletar(@PathVariable("id") Long id){
        dancarinoRepository.deleteById(id);
        return "Dançarino de id "+id+" deletado.";
    }
}