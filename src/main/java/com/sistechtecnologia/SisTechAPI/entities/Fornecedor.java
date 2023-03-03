package com.sistechtecnologia.SisTechAPI.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "c000009")
public class Fornecedor {
	
	@Id
	private String codigo;
	private String nome;
	private String fantasia;
	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	private String complemento;
	private String telefone1;
	private String telefone2;
	private String fax;
	private String contato1;
	private String contato2;
	private String celular1;
	private String celular2;
	private String email;
	private String homepage;
	private String cnpj;
	private String ie;
	private String banco;
	private String agencia;
	private String conta;
	private String obs1;
	private String obs2;
	private String obs3;
	private String data;
	private Integer tipo;
	private Integer assistencia_tecnica;
	private String numero;
	private String im;
	private String rep_nome;
	private String rep_telefone;
	private String rep_endereco;
	private String rep_bairro;
	private String rep_complemento;
	private String rep_cidade;
	private String rep_uf;
	private String rep_cep;
	private String rep_telefone1;
	private String rep_telefone2;
	private String rep_telefone3;
	private String rep_fax;
	private String rep_cnpj;
	private String rep_ie;
	private String rep_home_page;
	private String rep_email;
	private String cnae;
	private String cod_municipio_ibge;
	private String ibge;
	private String id_empresa;
	
	public Fornecedor() {
		
	}

	public Fornecedor(String codigo, String nome, String fantasia, String endereco, String bairro, String cidade,
			String uf, String cep, String complemento, String telefone1, String telefone2, String fax, String contato1,
			String contato2, String celular1, String celular2, String email, String homepage, String cnpj, String ie,
			String banco, String agencia, String conta, String obs1, String obs2, String obs3, String data,
			Integer tipo, Integer assistencia_tecnica, String numero, String im, String rep_nome, String rep_telefone,
			String rep_endereco, String rep_bairro, String rep_complemento, String rep_cidade, String rep_uf,
			String rep_cep, String rep_telefone1, String rep_telefone2, String rep_telefone3, String rep_fax,
			String rep_cnpj, String rep_ie, String rep_home_page, String rep_email, String cnae,
			String cod_municipio_ibge, String ibge, String id_empresa) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.fantasia = fantasia;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.complemento = complemento;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.fax = fax;
		this.contato1 = contato1;
		this.contato2 = contato2;
		this.celular1 = celular1;
		this.celular2 = celular2;
		this.email = email;
		this.homepage = homepage;
		this.cnpj = cnpj;
		this.ie = ie;
		this.banco = banco;
		this.agencia = agencia;
		this.conta = conta;
		this.obs1 = obs1;
		this.obs2 = obs2;
		this.obs3 = obs3;
		this.data = data;
		this.tipo = tipo;
		this.assistencia_tecnica = assistencia_tecnica;
		this.numero = numero;
		this.im = im;
		this.rep_nome = rep_nome;
		this.rep_telefone = rep_telefone;
		this.rep_endereco = rep_endereco;
		this.rep_bairro = rep_bairro;
		this.rep_complemento = rep_complemento;
		this.rep_cidade = rep_cidade;
		this.rep_uf = rep_uf;
		this.rep_cep = rep_cep;
		this.rep_telefone1 = rep_telefone1;
		this.rep_telefone2 = rep_telefone2;
		this.rep_telefone3 = rep_telefone3;
		this.rep_fax = rep_fax;
		this.rep_cnpj = rep_cnpj;
		this.rep_ie = rep_ie;
		this.rep_home_page = rep_home_page;
		this.rep_email = rep_email;
		this.cnae = cnae;
		this.cod_municipio_ibge = cod_municipio_ibge;
		this.ibge = ibge;
		this.id_empresa = id_empresa;
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

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getContato1() {
		return contato1;
	}

	public void setContato1(String contato1) {
		this.contato1 = contato1;
	}

	public String getContato2() {
		return contato2;
	}

	public void setContato2(String contato2) {
		this.contato2 = contato2;
	}

	public String getCelular1() {
		return celular1;
	}

	public void setCelular1(String celular1) {
		this.celular1 = celular1;
	}

	public String getCelular2() {
		return celular2;
	}

	public void setCelular2(String celular2) {
		this.celular2 = celular2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getObs1() {
		return obs1;
	}

	public void setObs1(String obs1) {
		this.obs1 = obs1;
	}

	public String getObs2() {
		return obs2;
	}

	public void setObs2(String obs2) {
		this.obs2 = obs2;
	}

	public String getObs3() {
		return obs3;
	}

	public void setObs3(String obs3) {
		this.obs3 = obs3;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Integer getAssistencia_tecnica() {
		return assistencia_tecnica;
	}

	public void setAssistencia_tecnica(Integer assistencia_tecnica) {
		this.assistencia_tecnica = assistencia_tecnica;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getIm() {
		return im;
	}

	public void setIm(String im) {
		this.im = im;
	}

	public String getRep_nome() {
		return rep_nome;
	}

	public void setRep_nome(String rep_nome) {
		this.rep_nome = rep_nome;
	}

	public String getRep_telefone() {
		return rep_telefone;
	}

	public void setRep_telefone(String rep_telefone) {
		this.rep_telefone = rep_telefone;
	}

	public String getRep_endereco() {
		return rep_endereco;
	}

	public void setRep_endereco(String rep_endereco) {
		this.rep_endereco = rep_endereco;
	}

	public String getRep_bairro() {
		return rep_bairro;
	}

	public void setRep_bairro(String rep_bairro) {
		this.rep_bairro = rep_bairro;
	}

	public String getRep_complemento() {
		return rep_complemento;
	}

	public void setRep_complemento(String rep_complemento) {
		this.rep_complemento = rep_complemento;
	}

	public String getRep_cidade() {
		return rep_cidade;
	}

	public void setRep_cidade(String rep_cidade) {
		this.rep_cidade = rep_cidade;
	}

	public String getRep_uf() {
		return rep_uf;
	}

	public void setRep_uf(String rep_uf) {
		this.rep_uf = rep_uf;
	}

	public String getRep_cep() {
		return rep_cep;
	}

	public void setRep_cep(String rep_cep) {
		this.rep_cep = rep_cep;
	}

	public String getRep_telefone1() {
		return rep_telefone1;
	}

	public void setRep_telefone1(String rep_telefone1) {
		this.rep_telefone1 = rep_telefone1;
	}

	public String getRep_telefone2() {
		return rep_telefone2;
	}

	public void setRep_telefone2(String rep_telefone2) {
		this.rep_telefone2 = rep_telefone2;
	}

	public String getRep_telefone3() {
		return rep_telefone3;
	}

	public void setRep_telefone3(String rep_telefone3) {
		this.rep_telefone3 = rep_telefone3;
	}

	public String getRep_fax() {
		return rep_fax;
	}

	public void setRep_fax(String rep_fax) {
		this.rep_fax = rep_fax;
	}

	public String getRep_cnpj() {
		return rep_cnpj;
	}

	public void setRep_cnpj(String rep_cnpj) {
		this.rep_cnpj = rep_cnpj;
	}

	public String getRep_ie() {
		return rep_ie;
	}

	public void setRep_ie(String rep_ie) {
		this.rep_ie = rep_ie;
	}

	public String getRep_home_page() {
		return rep_home_page;
	}

	public void setRep_home_page(String rep_home_page) {
		this.rep_home_page = rep_home_page;
	}

	public String getRep_email() {
		return rep_email;
	}

	public void setRep_email(String rep_email) {
		this.rep_email = rep_email;
	}

	public String getCnae() {
		return cnae;
	}

	public void setCnae(String cnae) {
		this.cnae = cnae;
	}

	public String getCod_municipio_ibge() {
		return cod_municipio_ibge;
	}

	public void setCod_municipio_ibge(String cod_municipio_ibge) {
		this.cod_municipio_ibge = cod_municipio_ibge;
	}

	public String getIbge() {
		return ibge;
	}

	public void setIbge(String ibge) {
		this.ibge = ibge;
	}

	public String getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(String id_empresa) {
		this.id_empresa = id_empresa;
	}

}
