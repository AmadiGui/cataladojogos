package com.mycodeopslab.cataladojogos.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycodeopslab.cataladojogos.dao.JogoDAO;
import com.mycodeopslab.cataladojogos.model.Jogo;

@RestController
public class jogoController {
	@GetMapping("/teste")
	
	public String teste() {
		return "Teste";
	}
	
	@Autowired
	private JogoDAO dao ;

@GetMapping("/jogos")
	public ArrayList<Jogo> recuperarTodos() {
		ArrayList<Jogo> lista;
		lista =(ArrayList<Jogo>)dao.findAll();
		return lista;
	}

	@PostMapping("/novojogo")
	public Jogo novoJogo(@RequestBody Jogo novo) {
		dao.save(novo);
		return novo;
}
	
	@GetMapping("/jogo/{id}")
	public ResponseEntity<Jogo> recuperaPorId(@PathVariable int id) {
		Jogo jogo = dao.findById(id).orElse(null);
		if (jogo != null) {
			return ResponseEntity.ok(jogo);	
		}
		else {
			return ResponseEntity.notFound().build();
		}
		
	}


}
