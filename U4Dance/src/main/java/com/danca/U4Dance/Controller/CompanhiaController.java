package com.danca.U4Dance.Controller;

import java.util.List;
import java.util.function.Predicate;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.danca.U4Dance.Database;
import com.danca.U4Dance.Model.Companhia;

@RestController
public class CompanhiaController {
    @GetMapping("/companhias")
    public List<Companhia> listarCompanhias() {
        return Database.recuperaCompanhia();
    }
    
    @PostMapping("/companhias")
    public void addCompanhia(@RequestBody Companhia companhia) {
        Database.addCompanhia(companhia);
    }

    @DeleteMapping("/companhias")
    public void deletarCompanhias(@RequestBody Companhia companhia){
        Database.delCompanhia(companhia);
    }
}
