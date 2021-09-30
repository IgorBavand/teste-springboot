

  package com.estagio.teste.repository;
 

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estagio.teste.model.VendedorModel;

@Repository
public interface VendedorRepository extends JpaRepository<VendedorModel, Long>{
	VendedorModel findById(long id);
	List<VendedorModel> findByCpf(String cpf);
}
