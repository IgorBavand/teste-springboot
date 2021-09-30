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


import com.estagio.teste.model.VendedorModel;
import com.estagio.teste.repository.*;

@RestController
@RequestMapping(value="/api")
public class VendedorController {
	
	
	@Autowired
	VendedorRepository Vendedor;

	
	@GetMapping("/vendedores")
	public List<VendedorModel> read(){
		return Vendedor.findAll();
	}
	
	
	@PostMapping("/create/vendedor")
	public VendedorModel create(@RequestBody VendedorModel vendedor) {
		return Vendedor.save(vendedor);
	}
	
	@PutMapping("update/venedor")
		public VendedorModel update(@RequestBody VendedorModel vendedor) {
		return Vendedor.save(vendedor);
	}
	
	@GetMapping("/search/vendedor/{cpf}")
	public List<VendedorModel> search(@PathVariable(value="cpf") String cpf){
		return Vendedor.findByCpf(cpf);
	}
	
	@DeleteMapping
	public void delete(@RequestBody VendedorModel vendedor) {
		Vendedor.delete(vendedor);
	}
	}


