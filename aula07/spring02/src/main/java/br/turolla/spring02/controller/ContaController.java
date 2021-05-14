package br.turolla.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.turolla.spring02.model.Conta;
import br.turolla.spring02.repo.ContaRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/conta")
public class ContaController {

    @Autowired
    private ContaRepo repo;

    @GetMapping("/numero/{id}")
    public ResponseEntity <Conta> getConta(@PathVariable int id){
        Conta conta = repo.findById(id).orElse(null);
        if (conta !=null){
            return ResponseEntity.ok (conta);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/all")
    public List<Conta> getAll(){
        List<Conta> lista = (List<Conta>)repo.findAll();
        return lista;
    }

    @PostMapping("/new")
    public Conta insertConta(@RequestBody Conta newConta){
        Conta conta = repo.save(newConta);
        return conta;
    }
}
