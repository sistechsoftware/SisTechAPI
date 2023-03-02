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
	private String apelido;
	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	private String complemento;
	private Integer moradia;
	private Integer tipo;
	private Integer situacao;
	private String telefone1;
	private String telefone2;
	private String telefone3;
	private String celular;
	private String email;
	private String rg;
	private String cpf;
	private String filiacao;
	private String estadocivil;
	private String conjuge;
	private String profissao;
	private String empresa;
	private Double renda;
	private Double limite;
	private String ref1;
	private String ref2;
	private String codvendedor;
	private String data_cadastro;
	private String data_ultimacompra;
	private String obs1;
	private String obs2;
	private String obs3;
	private String obs4;
	private String obs5;
	private String obs6;
	private String nascimento;
	private String codregiao;
	private String codconvenio;
	private String codusuario;
	private String numero;
	private String rg_orgao;
	private String rg_estado;
	private String rg_emissao;
	private String sexo;
	private String previsao;
	private String cnae;
	private String cod_municipio_ibge;
	private String ibge;
	private String tamanho_calca;
	private String tamanho_blusa;
	private String tamanho_sapato;
	private String corresp_endereco;
	private String corresp_bairro;
	private String corresp_cidade;
	private String corresp_uf;
	private String corresp_cep;	
	private String corresp_complemento;
	private String rg_produtor;
	private String resp1_nome;
	private String resp1_rg;
	private String resp1_profissao;
	private String resp1_estado_civil;
	private String resp1_endereco;
	private String resp1_bairro;
	private String resp1_cidade;
	private String resp1_uf;
	private String resp1_cep;
	private String resp2_nome;
	private String resp2_rg;
	private String resp2_profissao;
	private String resp2_estado_civil;
	private String resp2_endereco;
	private String resp2_bairro;
	private String resp2_cidade;
	private String resp2_uf;
	private String resp2_cep;
	private String foto;
	private String condpgto;
	private String cpais;
	private String dpais;
	private String tipo_ie;
	private String consumidor_final;
	private String id_empresa;

	public Cliente() {
		
	}	

	public Cliente(String codigo, String nome, String apelido, String endereco, String bairro, String cidade, String uf,
			String cep, String complemento, Integer moradia, Integer tipo, Integer situacao, String telefone1,
			String telefone2, String telefone3, String celular, String email, String rg, String cpf, String filiacao,
			String estadocivil, String conjuge, String profissao, String empresa, Double renda, Double limite,
			String ref1, String ref2, String codvendedor, String data_cadastro, String data_ultimacompra, String obs1,
			String obs2, String obs3, String obs4, String obs5, String obs6, String nascimento, String codregiao,
			String codconvenio, String codusuario, String numero, String rg_orgao, String rg_estado, String rg_emissao,
			String sexo, String previsao, String cnae, String cod_municipio_ibge, String ibge, String tamanho_calca,
			String tamanho_blusa, String tamanho_sapato, String corresp_endereco, String corresp_bairro,
			String corresp_cidade, String corresp_uf, String corresp_cep, String corresp_complemento,
			String rg_produtor, String resp1_nome, String resp1_rg, String resp1_profissao, String resp1_estado_civil,
			String resp1_endereco, String resp1_bairro, String resp1_cidade, String resp1_uf, String resp1_cep,
			String resp2_nome, String resp2_rg, String resp2_profissao, String resp2_estado_civil,
			String resp2_endereco, String resp2_bairro, String resp2_cidade, String resp2_uf, String resp2_cep,
			String foto, String condpgto, String cpais, String dpais, String tipo_ie, String consumidor_final,
			String id_empresa) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.apelido = apelido;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.complemento = complemento;
		this.moradia = moradia;
		this.tipo = tipo;
		this.situacao = situacao;
		this.telefone1 = telefone1;
		this.telefone2 = telefone2;
		this.telefone3 = telefone3;
		this.celular = celular;
		this.email = email;
		this.rg = rg;
		this.cpf = cpf;
		this.filiacao = filiacao;
		this.estadocivil = estadocivil;
		this.conjuge = conjuge;
		this.profissao = profissao;
		this.empresa = empresa;
		this.renda = renda;
		this.limite = limite;
		this.ref1 = ref1;
		this.ref2 = ref2;
		this.codvendedor = codvendedor;
		this.data_cadastro = data_cadastro;
		this.data_ultimacompra = data_ultimacompra;
		this.obs1 = obs1;
		this.obs2 = obs2;
		this.obs3 = obs3;
		this.obs4 = obs4;
		this.obs5 = obs5;
		this.obs6 = obs6;
		this.nascimento = nascimento;
		this.codregiao = codregiao;
		this.codconvenio = codconvenio;
		this.codusuario = codusuario;
		this.numero = numero;
		this.rg_orgao = rg_orgao;
		this.rg_estado = rg_estado;
		this.rg_emissao = rg_emissao;
		this.sexo = sexo;
		this.previsao = previsao;
		this.cnae = cnae;
		this.cod_municipio_ibge = cod_municipio_ibge;
		this.ibge = ibge;
		this.tamanho_calca = tamanho_calca;
		this.tamanho_blusa = tamanho_blusa;
		this.tamanho_sapato = tamanho_sapato;
		this.corresp_endereco = corresp_endereco;
		this.corresp_bairro = corresp_bairro;
		this.corresp_cidade = corresp_cidade;
		this.corresp_uf = corresp_uf;
		this.corresp_cep = corresp_cep;
		this.corresp_complemento = corresp_complemento;
		this.rg_produtor = rg_produtor;
		this.resp1_nome = resp1_nome;
		this.resp1_rg = resp1_rg;
		this.resp1_profissao = resp1_profissao;
		this.resp1_estado_civil = resp1_estado_civil;
		this.resp1_endereco = resp1_endereco;
		this.resp1_bairro = resp1_bairro;
		this.resp1_cidade = resp1_cidade;
		this.resp1_uf = resp1_uf;
		this.resp1_cep = resp1_cep;
		this.resp2_nome = resp2_nome;
		this.resp2_rg = resp2_rg;
		this.resp2_profissao = resp2_profissao;
		this.resp2_estado_civil = resp2_estado_civil;
		this.resp2_endereco = resp2_endereco;
		this.resp2_bairro = resp2_bairro;
		this.resp2_cidade = resp2_cidade;
		this.resp2_uf = resp2_uf;
		this.resp2_cep = resp2_cep;
		this.foto = foto;
		this.condpgto = condpgto;
		this.cpais = cpais;
		this.dpais = dpais;
		this.tipo_ie = tipo_ie;
		this.consumidor_final = consumidor_final;
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

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
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

	public Integer getMoradia() {
		return moradia;
	}

	public void setMoradia(Integer moradia) {
		this.moradia = moradia;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Integer getSituacao() {
		return situacao;
	}

	public void setSituacao(Integer situacao) {
		this.situacao = situacao;
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

	public String getTelefone3() {
		return telefone3;
	}

	public void setTelefone3(String telefone3) {
		this.telefone3 = telefone3;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFiliacao() {
		return filiacao;
	}

	public void setFiliacao(String filiacao) {
		this.filiacao = filiacao;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	public String getConjuge() {
		return conjuge;
	}

	public void setConjuge(String conjuge) {
		this.conjuge = conjuge;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	public String getRef1() {
		return ref1;
	}

	public void setRef1(String ref1) {
		this.ref1 = ref1;
	}

	public String getRef2() {
		return ref2;
	}

	public void setRef2(String ref2) {
		this.ref2 = ref2;
	}

	public String getCodvendedor() {
		return codvendedor;
	}

	public void setCodvendedor(String codvendedor) {
		this.codvendedor = codvendedor;
	}

	public String getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public String getData_ultimacompra() {
		return data_ultimacompra;
	}

	public void setData_ultimacompra(String data_ultimacompra) {
		this.data_ultimacompra = data_ultimacompra;
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

	public String getObs4() {
		return obs4;
	}

	public void setObs4(String obs4) {
		this.obs4 = obs4;
	}

	public String getObs5() {
		return obs5;
	}

	public void setObs5(String obs5) {
		this.obs5 = obs5;
	}

	public String getObs6() {
		return obs6;
	}

	public void setObs6(String obs6) {
		this.obs6 = obs6;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getCodregiao() {
		return codregiao;
	}

	public void setCodregiao(String codregiao) {
		this.codregiao = codregiao;
	}

	public String getCodconvenio() {
		return codconvenio;
	}

	public void setCodconvenio(String codconvenio) {
		this.codconvenio = codconvenio;
	}

	public String getCodusuario() {
		return codusuario;
	}

	public void setCodusuario(String codusuario) {
		this.codusuario = codusuario;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRg_orgao() {
		return rg_orgao;
	}

	public void setRg_orgao(String rg_orgao) {
		this.rg_orgao = rg_orgao;
	}

	public String getRg_estado() {
		return rg_estado;
	}

	public void setRg_estado(String rg_estado) {
		this.rg_estado = rg_estado;
	}

	public String getRg_emissao() {
		return rg_emissao;
	}

	public void setRg_emissao(String rg_emissao) {
		this.rg_emissao = rg_emissao;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getPrevisao() {
		return previsao;
	}

	public void setPrevisao(String previsao) {
		this.previsao = previsao;
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

	public String getTamanho_calca() {
		return tamanho_calca;
	}

	public void setTamanho_calca(String tamanho_calca) {
		this.tamanho_calca = tamanho_calca;
	}

	public String getTamanho_blusa() {
		return tamanho_blusa;
	}

	public void setTamanho_blusa(String tamanho_blusa) {
		this.tamanho_blusa = tamanho_blusa;
	}

	public String getTabanho_sapato() {
		return tamanho_sapato;
	}

	public void setTabanho_sapato(String tamanho_sapato) {
		this.tamanho_sapato = tamanho_sapato;
	}

	public String getCorresp_endereco() {
		return corresp_endereco;
	}

	public void setCorresp_endereco(String corresp_endereco) {
		this.corresp_endereco = corresp_endereco;
	}

	public String getCorresp_bairro() {
		return corresp_bairro;
	}

	public void setCorresp_bairro(String corresp_bairro) {
		this.corresp_bairro = corresp_bairro;
	}

	public String getCorresp_cidade() {
		return corresp_cidade;
	}

	public void setCorresp_cidade(String corresp_cidade) {
		this.corresp_cidade = corresp_cidade;
	}

	public String getCorresp_uf() {
		return corresp_uf;
	}

	public void setCorresp_uf(String corresp_uf) {
		this.corresp_uf = corresp_uf;
	}

	public String getTamanho_sapato() {
		return tamanho_sapato;
	}

	public void setTamanho_sapato(String tamanho_sapato) {
		this.tamanho_sapato = tamanho_sapato;
	}

	public String getCorresp_cep() {
		return corresp_cep;
	}

	public void setCorresp_cep(String corresp_cep) {
		this.corresp_cep = corresp_cep;
	}

	public String getCorresp_complemento() {
		return corresp_complemento;
	}

	public void setCorresp_complemento(String corresp_complemento) {
		this.corresp_complemento = corresp_complemento;
	}

	public String getRg_produtor() {
		return rg_produtor;
	}

	public void setRg_produtor(String rg_produtor) {
		this.rg_produtor = rg_produtor;
	}

	public String getResp1_nome() {
		return resp1_nome;
	}

	public void setResp1_nome(String resp1_nome) {
		this.resp1_nome = resp1_nome;
	}

	public String getResp1_rg() {
		return resp1_rg;
	}

	public void setResp1_rg(String resp1_rg) {
		this.resp1_rg = resp1_rg;
	}

	public String getResp1_profissao() {
		return resp1_profissao;
	}

	public void setResp1_profissao(String resp1_profissao) {
		this.resp1_profissao = resp1_profissao;
	}

	public String getResp1_estado_civil() {
		return resp1_estado_civil;
	}

	public void setResp1_estado_civil(String resp1_estado_civil) {
		this.resp1_estado_civil = resp1_estado_civil;
	}

	public String getResp1_endereco() {
		return resp1_endereco;
	}

	public void setResp1_endereco(String resp1_endereco) {
		this.resp1_endereco = resp1_endereco;
	}

	public String getResp1_bairro() {
		return resp1_bairro;
	}

	public void setResp1_bairro(String resp1_bairro) {
		this.resp1_bairro = resp1_bairro;
	}

	public String getResp1_cidade() {
		return resp1_cidade;
	}

	public void setResp1_cidade(String resp1_cidade) {
		this.resp1_cidade = resp1_cidade;
	}

	public String getResp1_uf() {
		return resp1_uf;
	}

	public void setResp1_uf(String resp1_uf) {
		this.resp1_uf = resp1_uf;
	}

	public String getResp1_cep() {
		return resp1_cep;
	}

	public void setResp1_cep(String resp1_cep) {
		this.resp1_cep = resp1_cep;
	}

	public String getResp2_nome() {
		return resp2_nome;
	}

	public void setResp2_nome(String resp2_nome) {
		this.resp2_nome = resp2_nome;
	}

	public String getResp2_rg() {
		return resp2_rg;
	}

	public void setResp2_rg(String resp2_rg) {
		this.resp2_rg = resp2_rg;
	}

	public String getResp2_profissao() {
		return resp2_profissao;
	}

	public void setResp2_profissao(String resp2_profissao) {
		this.resp2_profissao = resp2_profissao;
	}

	public String getResp2_estado_civil() {
		return resp2_estado_civil;
	}

	public void setResp2_estado_civil(String resp2_estado_civil) {
		this.resp2_estado_civil = resp2_estado_civil;
	}

	public String getResp2_endereco() {
		return resp2_endereco;
	}

	public void setResp2_endereco(String resp2_endereco) {
		this.resp2_endereco = resp2_endereco;
	}

	public String getResp2_bairro() {
		return resp2_bairro;
	}

	public void setResp2_bairro(String resp2_bairro) {
		this.resp2_bairro = resp2_bairro;
	}

	public String getResp2_cidade() {
		return resp2_cidade;
	}

	public void setResp2_cidade(String resp2_cidade) {
		this.resp2_cidade = resp2_cidade;
	}

	public String getResp2_uf() {
		return resp2_uf;
	}

	public void setResp2_uf(String resp2_uf) {
		this.resp2_uf = resp2_uf;
	}

	public String getResp2_cep() {
		return resp2_cep;
	}

	public void setResp2_cep(String resp2_cep) {
		this.resp2_cep = resp2_cep;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getCondpgto() {
		return condpgto;
	}

	public void setCondpgto(String condpgto) {
		this.condpgto = condpgto;
	}

	public String getCpais() {
		return cpais;
	}

	public void setCpais(String cpais) {
		this.cpais = cpais;
	}

	public String getDpais() {
		return dpais;
	}

	public void setDpais(String dpais) {
		this.dpais = dpais;
	}

	public String getTipo_ie() {
		return tipo_ie;
	}

	public void setTipo_ie(String tipo_ie) {
		this.tipo_ie = tipo_ie;
	}

	public String getConsumidor_final() {
		return consumidor_final;
	}

	public void setConsumidor_final(String consumidor_final) {
		this.consumidor_final = consumidor_final;
	}

	public String getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(String id_empresa) {
		this.id_empresa = id_empresa;
	}	
	
	
}
