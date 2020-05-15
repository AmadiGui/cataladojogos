package com.mycodeopslab.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mycodeopslab.helloworld.model.*;
@RestController

public class AlunoController {

	@GetMapping("/aluno")
	public Aluno getAluno() {
		Aluno a = new Aluno(1, "gui","gui@gui");
		return a;
	}
	
}
