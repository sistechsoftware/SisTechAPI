package com.sistechtecnologia.SisTechAPI.entities;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PARAMETRO")
public class Parametro implements Serializable {	

	private static final long serialVersionUID = 1L;
	
	@Id
	private String codigo;
	private String descricao;
	private String parametro;
	private String valor;

	public Parametro() {
		
	}

	public Parametro(String codigo, String descricao, String parametro, String valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.parametro = parametro;
		this.valor = valor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getParametro() {
		return parametro;
	}

	public void setParametro(String parametro) {
		this.parametro = parametro;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	

}
