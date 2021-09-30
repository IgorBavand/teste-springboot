package com.estagio.teste.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estagio.teste.model.PessoaModel;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaModel, Long>{

	PessoaModel findById(long id);
	List<PessoaModel> findByCpf(String cpf);

	
}

