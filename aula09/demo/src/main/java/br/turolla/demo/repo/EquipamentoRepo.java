package br.turolla.demo.repo;

import org.springframework.data.repository.CrudRepository;

import br.turolla.demo.models.Equipamento;

public interface EquipamentoRepo extends CrudRepository<Equipamento, Integer>{
    
}
