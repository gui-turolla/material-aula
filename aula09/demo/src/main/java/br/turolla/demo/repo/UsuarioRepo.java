package br.turolla.demo.repo;

import org.springframework.data.repository.CrudRepository;

import br.turolla.demo.models.Usuario;

public interface UsuarioRepo extends CrudRepository <Usuario, Integer> {
    public Usuario findByEmailOrRacf(String email, String racf);  
}
