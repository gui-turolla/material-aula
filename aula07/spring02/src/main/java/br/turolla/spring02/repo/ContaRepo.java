package br.turolla.spring02.repo;
import org.springframework.data.repository.CrudRepository;
import br.turolla.spring02.model.Conta;

    public interface ContaRepo extends CrudRepository<Conta, Integer>{

}
