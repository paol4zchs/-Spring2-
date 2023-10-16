package com.senai.paola.PrjGame.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senai.paola.PrjGame.entities.Jogo;
import com.senai.paola.PrjGame.repositories.JogoRepository;

@Service
public class JogoService {

	private final JogoRepository jogoRepository;

	public JogoService(JogoRepository jogoRepository) {
		this.jogoRepository = jogoRepository;
	}

	public Jogo saveJogo(Jogo jogo) {
		return jogoRepository.save(jogo);
	}

	public Jogo getJogoById(Long Id) {
		return jogoRepository.findById(Id).orElse(null);
	}

	public List<Jogo> getAllJogos() {
		return jogoRepository.findAll();
	}

	public void deleteJogo(Long Id) {
		jogoRepository.deleteById(Id);
	}

}
