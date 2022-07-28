package com.agrotis.propriedade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.agrotis.propriedade.model.Proprietario;
import com.agrotis.propriedade.repository.ProprietarioRepository;


@RestController
@RequestMapping("/Propriedade")
public class ProprietarioController {
	@Autowired
	private ProprietarioRepository proprietarioRepository; 
	@GetMapping
	public List<Proprietario> listar(){
		return proprietarioRepository.findAll();
	}
    @PostMapping
	public void salvar (@RequestBody Proprietario proprietario) {
		 proprietarioRepository.save(proprietario);
	}
    @PutMapping
   	public void alterar (@RequestBody Proprietario proprietario) {
    	
   		 proprietarioRepository.save(proprietario);
   	}
    @DeleteMapping
   	public void deletar (@RequestBody Proprietario proprietario) {
    	
   		 proprietarioRepository.delete(proprietario);
   	}
}
