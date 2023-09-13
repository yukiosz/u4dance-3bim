package com.danca.U4Dance.Controller;

import java.util.List;
import java.util.function.Predicate;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.danca.U4Dance.Database;
import com.danca.U4Dance.Model.Dancarino;

@RestController
public class DancarinoController {
    @GetMapping("/dancarinos")
    public List<Dancarino> listarDancarinos(){
        return Database.recuperaDancarino();
    }

    @PostMapping("/dancarinos")
        public void addDancarino(@RequestBody Dancarino danc){
            Database.addDancarino(danc);
        }
    
    @DeleteMapping("/dancarinos")
    public void delDancarino(@RequestBody Dancarino danc){
    Database.delDancarino(danc);
    }
}