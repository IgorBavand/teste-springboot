package com.estagio.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estagio.teste.repository.PessoaRepository;
import com.estagio.teste.model.PessoaModel;

@RestController
@RequestMapping(value="/api")
public class PessoaController {

		@Autowired
		PessoaRepository Pessoa;
		
		
		@PostMapping("/create/pessoa")
		public PessoaModel create(@RequestBody PessoaModel pessoa) {
			
			return Pessoa.save(pessoa);
			
		}
		
		@GetMapping("/pessoas")
		public List<PessoaModel> read(){
			return Pessoa.findAll();
		}
		
		@PutMapping("/update/pessoa")
		public PessoaModel update(@RequestBody PessoaModel pessoa) {
			
			return Pessoa.save(pessoa);
			
		}
		
		@DeleteMapping("/delete/pessoa")
		public void delete(@RequestBody PessoaModel pessoa) {
			Pessoa.delete(pessoa);
			
		}
		
		@GetMapping("/search/{cpf}")
		public List<PessoaModel> search(@PathVariable(value="cpf") String cpf){
			return Pessoa.findByCpf(cpf);
		}
}
