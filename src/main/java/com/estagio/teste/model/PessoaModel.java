package com.estagio.teste.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pessoa")
public class PessoaModel implements Serializable{
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
    @Column(name = "id_vendedor")
	private Long id_vendedor;
	
    @Column(name = "nome")
	private String nome;
	
    @Column(name = "cpf")
	private String cpf;
	
    @Column(name = "senha")
	private String senha;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Long getId_vendedor() {
		return id_vendedor;
	}

	public void setId_vendedor(Long id_vendedor) {
		this.id_vendedor = id_vendedor;
	}
	
	
	
	
}
