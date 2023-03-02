package com.sistechtecnologia.SisTechAPI.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {
	
	@Id
	private String codigo;
	private String codbarra;
	private String produto;
	private String unidade;
	private String data_cadastro;
	private String codgrupo;
	private String codsubgrupo;
	private String codfornecedor;
	private String codmarca;
	
	public Produto() {
		
	}

	public Produto(String codigo, String codbarra, String produto, String unidade, String data_cadastro,
			String codgrupo, String codsubgrupo, String codfornecedor, String codmarca) {
		super();
		this.codigo = codigo;
		this.codbarra = codbarra;
		this.produto = produto;
		this.unidade = unidade;
		this.data_cadastro = data_cadastro;
		this.codgrupo = codgrupo;
		this.codsubgrupo = codsubgrupo;
		this.codfornecedor = codfornecedor;
		this.codmarca = codmarca;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodbarra() {
		return codbarra;
	}

	public void setCodbarra(String codbarra) {
		this.codbarra = codbarra;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public String getCodgrupo() {
		return codgrupo;
	}

	public void setCodgrupo(String codgrupo) {
		this.codgrupo = codgrupo;
	}

	public String getCodsubgrupo() {
		return codsubgrupo;
	}

	public void setCodsubgrupo(String codsubgrupo) {
		this.codsubgrupo = codsubgrupo;
	}

	public String getCodfornecedor() {
		return codfornecedor;
	}

	public void setCodfornecedor(String codfornecedor) {
		this.codfornecedor = codfornecedor;
	}

	public String getCodmarca() {
		return codmarca;
	}

	public void setCodmarca(String codmarca) {
		this.codmarca = codmarca;
	}
	
	
	
}
