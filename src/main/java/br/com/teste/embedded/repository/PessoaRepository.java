package br.com.teste.embedded.repository;

import br.com.teste.embedded.orm.Pessoa;
import br.com.teste.embedded.orm.PessoaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, PessoaId> {
}
