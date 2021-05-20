package br.turolla.demo.repo;

import org.springframework.data.repository.CrudRepository;

import br.turolla.demo.models.Alarme;

public interface AlarmeRepo extends CrudRepository<Alarme, Integer>{
    
}
