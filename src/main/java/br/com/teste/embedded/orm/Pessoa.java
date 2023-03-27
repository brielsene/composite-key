package br.com.teste.embedded.orm;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pessoa")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
    @EmbeddedId
    private PessoaId pessoaId;
    private String nome;

    public Pessoa (String nome, PessoaId pessoaId){
        this.nome = nome;
        this.pessoaId = pessoaId;
    }
}
