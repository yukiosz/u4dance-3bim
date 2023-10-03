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

import com.danca.U4Dance.Model.Companhia;
import com.danca.U4Dance.Repository.CompanhiaRepository;

@RestController
@CrossOrigin
public class CompanhiaController {
    @Autowired
    CompanhiaRepository companhiasRepository;

    @PostMapping("/companhia")
    public Companhia cadastrar(@RequestBody Companhia companhia) {
        return companhiasRepository.save(companhia);
    }

    @GetMapping("/companhia")
    public List<Companhia> recuperar() {
        return (List<Companhia>) companhiasRepository.findAll();
    }

    @DeleteMapping("/companhia/{id}")
    public String deletar(@PathVariable("id") Long id){
        companhiasRepository.deleteById(id);
        return "Companhia foi excluida!!";
    }
}
