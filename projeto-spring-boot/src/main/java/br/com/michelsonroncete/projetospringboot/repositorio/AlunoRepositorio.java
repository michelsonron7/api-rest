package br.com.michelsonroncete.projetospringboot.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.michelsonroncete.projetospringboot.modelo.Aluno;

public interface AlunoRepositorio extends JpaRepository<Aluno, Long>{

}
