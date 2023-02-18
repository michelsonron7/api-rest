package br.com.michelsonroncete.projetospringboot.controller;

import java.time.Instant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.michelsonroncete.projetospringboot.modelo.Aluno;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@GetMapping
	public Aluno getInfo() {
		
		Aluno aluno = new Aluno(1L, "Tobias", "2196965656", "Tobias@gmail.com", Instant.now());
		
		
		
		return aluno;
	}
}
