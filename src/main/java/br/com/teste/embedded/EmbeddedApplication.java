package br.com.teste.embedded;

import br.com.teste.embedded.orm.Pessoa;
import br.com.teste.embedded.orm.PessoaId;
import br.com.teste.embedded.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("br.com.teste.embedded.orm")
public class EmbeddedApplication implements CommandLineRunner {
	@Autowired
	private PessoaRepository pessoaRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmbeddedApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		PessoaId pessoaId = new PessoaId("5566", "432423");

		PessoaId pessoaId2 = new PessoaId("5577", "432432423");
		System.out.println(this.pessoaRepository.findById(pessoaId).orElse(null));
		System.out.println(this.pessoaRepository.findById(pessoaId2).orElse(null));
	}
}
