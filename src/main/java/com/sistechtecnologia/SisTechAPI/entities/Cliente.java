package com.sistechtecnologia.SisTechAPI.entities;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "c000007")
public class Cliente implements Serializable {	

	private static final long serialVersionUID = 1L;
	
	@Id
	private String codigo;
	private String nome;
	private String endereco;

	public Cliente() {
		
	}

	public Cliente(String codigo, String nome, String endereco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}	

}
