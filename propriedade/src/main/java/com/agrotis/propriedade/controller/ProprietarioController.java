package com.agrotis.propriedade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.agrotis.propriedade.model.Proprietario;
import com.agrotis.propriedade.repository.ProprietarioRepository;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/Propriedade")
public class ProprietarioController {
	@Autowired
	private ProprietarioRepository proprietarioRepository; 
	@GetMapping
	 @ResponseStatus(HttpStatus.OK)
	public List<Proprietario> listar(){
		return proprietarioRepository.findAll();
	}
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(value = "/Propriedade", 
    produces = "application/json", 
    method=RequestMethod.POST)
	public void salvar (@RequestBody Proprietario proprietario) {
		 proprietarioRepository.save(proprietario);
	}
    
   
    
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping
   	public void alterar (@RequestBody Proprietario proprietario) {
    	
   		 proprietarioRepository.save(proprietario);
   	}
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
   	public void deletar (@RequestBody Proprietario proprietario) {
    	
   		 proprietarioRepository.delete(proprietario);
   	}
  /*
    @GetMapping(path = {"/{id}"})
    public ResponseEntity findById(@PathVariable String id){
       return proprietarioRepository.findById(id)
               .map(record -> ResponseEntity.ok().body(record))
               .orElse(ResponseEntity.notFound().build());
    
   
    */
}
