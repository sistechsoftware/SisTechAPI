package com.sistechtecnologia.SisTechAPI.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "c000004")
public class Filiais {
	
	@Id
	private String codigo;
	private String filial;
	private Integer notafiscal;
	private String endereco;
	private String cidade;
	private String uf;
	private String cep;
	private String telefone;
	private String cnpj;
	private String ie;
	private Integer seqnf;
	private String fax;	
	private String obs1;
	private String obs2;
	private String contribuinte_ipi;
	private String substituto_tributario;
	private String empresa_estadual;
	private String optante_simples;
	private String optante_super_simples;
	private String ecf;
	private Integer tipo;
	private Double ipi;
	private Double iss;
	private String numero;
	private String responsavel;
	private String complemento;
	private String bairro;
	private String farmacia_resp_tecnico;
	private String farmacia_crf;
	private String farmacia_cpf;
	private String farmcia_data;
	private String farmacia_uf;
	private String farmacia_senha;
	private String farmacia_email;
	private String farmacia_login;
	private String farmacia_envio;
	private Integer conhecimento;
	private String industria;
	private String farmacia_numerolicenca;
	private String cod_municipio_ibge;
	private String ibge;
	private Double pis;
	private Double cofins;
	private String email;
	private String atividade;
	private String contador_cod_municipio_ibge;
	private String contador_nome;
	private String contador_cpf;
	private String contador_crc;
	private String contador_cnpj;
	private String contador_cep;
	private String contador_endereco;
	private String contador_numero;
	private String contador_complemento;
	private String contador_bairro;
	private String contador_fone;
	private String contador_fax;
	private String contador_email;
	private String insc_municipal;
	private String data_abertura;
	private String cnae;
	private String crt;
	private String contador_cidade;
	private String contador_cod_municipio;
	private String contador_uf;
	private Integer permite_credito;
	private String fantasia;
	private Double dfixas;
	private Integer tipocalculo;
	private String serie_cte;
	private String seq_cte;
	private String cod_pais;
	private String pais;
	private String homepage;
	private String aidf;
	private String ninicial;
	private String nfinal;
	private String n_nf_d;
	private String validade;
	private String rntrc;
	private Integer serie_mdfe;
	private Integer numero_mdfe;
	private String mail_server;
	private String mail_porta;
	private String mail_username;
	private String mail_password;
	
	public Filiais() {
		
	}

	public Filiais(String codigo, String filial, Integer notafiscal, String endereco, String cidade, String uf,
			String cep, String telefone, String cnpj, String ie, Integer seqnf, String fax, String obs1, String obs2,
			String contribuinte_ipi, String substituto_tributario, String empresa_estadual, String optante_simples,
			String optante_super_simples, String ecf, Integer tipo, Double ipi, Double iss, String numero,
			String responsavel, String complemento, String bairro, String farmacia_resp_tecnico, String farmacia_crf,
			String farmacia_cpf, String farmcia_data, String farmacia_uf, String farmacia_senha, String farmacia_email,
			String farmacia_login, String farmacia_envio, Integer conhecimento, String industria,
			String farmacia_numerolicenca, String cod_municipio_ibge, String ibge, Double pis, Double cofins,
			String email, String atividade, String contador_cod_municipio_ibge, String contador_nome,
			String contador_cpf, String contador_crc, String contador_cnpj, String contador_cep,
			String contador_endereco, String contador_numero, String contador_complemento, String contador_bairro,
			String contador_fone, String contador_fax, String contador_email, String insc_municipal,
			String data_abertura, String cnae, String crt, String contador_cidade, String contador_cod_municipio,
			String contador_uf, Integer permite_credito, String fantasia, Double dfixas, Integer tipocalculo,
			String serie_cte, String seq_cte, String cod_pais, String pais, String homepage, String aidf,
			String ninicial, String nfinal, String n_nf_d, String validade, String rntrc, Integer serie_mdfe,
			Integer numero_mdfe, String mail_server, String mail_porta, String mail_username, String mail_password) {
		super();
		this.codigo = codigo;
		this.filial = filial;
		this.notafiscal = notafiscal;
		this.endereco = endereco;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.telefone = telefone;
		this.cnpj = cnpj;
		this.ie = ie;
		this.seqnf = seqnf;
		this.fax = fax;
		this.obs1 = obs1;
		this.obs2 = obs2;
		this.contribuinte_ipi = contribuinte_ipi;
		this.substituto_tributario = substituto_tributario;
		this.empresa_estadual = empresa_estadual;
		this.optante_simples = optante_simples;
		this.optante_super_simples = optante_super_simples;
		this.ecf = ecf;
		this.tipo = tipo;
		this.ipi = ipi;
		this.iss = iss;
		this.numero = numero;
		this.responsavel = responsavel;
		this.complemento = complemento;
		this.bairro = bairro;
		this.farmacia_resp_tecnico = farmacia_resp_tecnico;
		this.farmacia_crf = farmacia_crf;
		this.farmacia_cpf = farmacia_cpf;
		this.farmcia_data = farmcia_data;
		this.farmacia_uf = farmacia_uf;
		this.farmacia_senha = farmacia_senha;
		this.farmacia_email = farmacia_email;
		this.farmacia_login = farmacia_login;
		this.farmacia_envio = farmacia_envio;
		this.conhecimento = conhecimento;
		this.industria = industria;
		this.farmacia_numerolicenca = farmacia_numerolicenca;
		this.cod_municipio_ibge = cod_municipio_ibge;
		this.ibge = ibge;
		this.pis = pis;
		this.cofins = cofins;
		this.email = email;
		this.atividade = atividade;
		this.contador_cod_municipio_ibge = contador_cod_municipio_ibge;
		this.contador_nome = contador_nome;
		this.contador_cpf = contador_cpf;
		this.contador_crc = contador_crc;
		this.contador_cnpj = contador_cnpj;
		this.contador_cep = contador_cep;
		this.contador_endereco = contador_endereco;
		this.contador_numero = contador_numero;
		this.contador_complemento = contador_complemento;
		this.contador_bairro = contador_bairro;
		this.contador_fone = contador_fone;
		this.contador_fax = contador_fax;
		this.contador_email = contador_email;
		this.insc_municipal = insc_municipal;
		this.data_abertura = data_abertura;
		this.cnae = cnae;
		this.crt = crt;
		this.contador_cidade = contador_cidade;
		this.contador_cod_municipio = contador_cod_municipio;
		this.contador_uf = contador_uf;
		this.permite_credito = permite_credito;
		this.fantasia = fantasia;
		this.dfixas = dfixas;
		this.tipocalculo = tipocalculo;
		this.serie_cte = serie_cte;
		this.seq_cte = seq_cte;
		this.cod_pais = cod_pais;
		this.pais = pais;
		this.homepage = homepage;
		this.aidf = aidf;
		this.ninicial = ninicial;
		this.nfinal = nfinal;
		this.n_nf_d = n_nf_d;
		this.validade = validade;
		this.rntrc = rntrc;
		this.serie_mdfe = serie_mdfe;
		this.numero_mdfe = numero_mdfe;
		this.mail_server = mail_server;
		this.mail_porta = mail_porta;
		this.mail_username = mail_username;
		this.mail_password = mail_password;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFilial() {
		return filial;
	}

	public void setFilial(String filial) {
		this.filial = filial;
	}

	public Integer getNotafiscal() {
		return notafiscal;
	}

	public void setNotafiscal(Integer notafiscal) {
		this.notafiscal = notafiscal;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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

	public Integer getSeqnf() {
		return seqnf;
	}

	public void setSeqnf(Integer seqnf) {
		this.seqnf = seqnf;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
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

	public String getContribuinte_ipi() {
		return contribuinte_ipi;
	}

	public void setContribuinte_ipi(String contribuinte_ipi) {
		this.contribuinte_ipi = contribuinte_ipi;
	}

	public String getSubstituto_tributario() {
		return substituto_tributario;
	}

	public void setSubstituto_tributario(String substituto_tributario) {
		this.substituto_tributario = substituto_tributario;
	}

	public String getEmpresa_estadual() {
		return empresa_estadual;
	}

	public void setEmpresa_estadual(String empresa_estadual) {
		this.empresa_estadual = empresa_estadual;
	}

	public String getOptante_simples() {
		return optante_simples;
	}

	public void setOptante_simples(String optante_simples) {
		this.optante_simples = optante_simples;
	}

	public String getOptante_super_simples() {
		return optante_super_simples;
	}

	public void setOptante_super_simples(String optante_super_simples) {
		this.optante_super_simples = optante_super_simples;
	}

	public String getEcf() {
		return ecf;
	}

	public void setEcf(String ecf) {
		this.ecf = ecf;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Double getIpi() {
		return ipi;
	}

	public void setIpi(Double ipi) {
		this.ipi = ipi;
	}

	public Double getIss() {
		return iss;
	}

	public void setIss(Double iss) {
		this.iss = iss;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getFarmacia_resp_tecnico() {
		return farmacia_resp_tecnico;
	}

	public void setFarmacia_resp_tecnico(String farmacia_resp_tecnico) {
		this.farmacia_resp_tecnico = farmacia_resp_tecnico;
	}

	public String getFarmacia_crf() {
		return farmacia_crf;
	}

	public void setFarmacia_crf(String farmacia_crf) {
		this.farmacia_crf = farmacia_crf;
	}

	public String getFarmacia_cpf() {
		return farmacia_cpf;
	}

	public void setFarmacia_cpf(String farmacia_cpf) {
		this.farmacia_cpf = farmacia_cpf;
	}

	public String getFarmacia_data() {
		return farmcia_data;
	}

	public void setFarmacia_data(String farmcia_data) {
		this.farmcia_data = farmcia_data;
	}

	public String getFarmacia_uf() {
		return farmacia_uf;
	}

	public void setFarmacia_uf(String farmacia_uf) {
		this.farmacia_uf = farmacia_uf;
	}

	public String getFarmacia_senha() {
		return farmacia_senha;
	}

	public void setFarmacia_senha(String farmacia_senha) {
		this.farmacia_senha = farmacia_senha;
	}

	public String getFarmacia_email() {
		return farmacia_email;
	}

	public void setFarmacia_email(String farmacia_email) {
		this.farmacia_email = farmacia_email;
	}

	public String getFarmacia_login() {
		return farmacia_login;
	}

	public void setFarmacia_login(String farmacia_login) {
		this.farmacia_login = farmacia_login;
	}

	public String getFarmacia_envio() {
		return farmacia_envio;
	}

	public void setFarmacia_envio(String farmacia_envio) {
		this.farmacia_envio = farmacia_envio;
	}

	public Integer getConhecimento() {
		return conhecimento;
	}

	public void setConhecimento(Integer conhecimento) {
		this.conhecimento = conhecimento;
	}

	public String getIndustria() {
		return industria;
	}

	public void setIndustria(String industria) {
		this.industria = industria;
	}

	public String getFarmacia_numerolicenca() {
		return farmacia_numerolicenca;
	}

	public void setFarmacia_numerolicenca(String farmacia_numerolicenca) {
		this.farmacia_numerolicenca = farmacia_numerolicenca;
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

	public Double getPis() {
		return pis;
	}

	public void setPis(Double pis) {
		this.pis = pis;
	}

	public Double getCofins() {
		return cofins;
	}

	public void setCofins(Double cofins) {
		this.cofins = cofins;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}

	public String getContador_cod_municipio_ibge() {
		return contador_cod_municipio_ibge;
	}

	public void setContador_cod_municipio_ibge(String contador_cod_municipio_ibge) {
		this.contador_cod_municipio_ibge = contador_cod_municipio_ibge;
	}

	public String getContador_nome() {
		return contador_nome;
	}

	public void setContador_nome(String contador_nome) {
		this.contador_nome = contador_nome;
	}

	public String getContador_cpf() {
		return contador_cpf;
	}

	public void setContador_cpf(String contador_cpf) {
		this.contador_cpf = contador_cpf;
	}

	public String getContador_crc() {
		return contador_crc;
	}

	public void setContador_crc(String contador_crc) {
		this.contador_crc = contador_crc;
	}

	public String getContador_cnpj() {
		return contador_cnpj;
	}

	public void setContador_cnpj(String contador_cnpj) {
		this.contador_cnpj = contador_cnpj;
	}

	public String getContador_cep() {
		return contador_cep;
	}

	public void setContador_cep(String contador_cep) {
		this.contador_cep = contador_cep;
	}

	public String getContador_endereco() {
		return contador_endereco;
	}

	public void setContador_endereco(String contador_endereco) {
		this.contador_endereco = contador_endereco;
	}

	public String getContador_numero() {
		return contador_numero;
	}

	public void setContador_numero(String contador_numero) {
		this.contador_numero = contador_numero;
	}

	public String getContador_complemento() {
		return contador_complemento;
	}

	public void setContador_complemento(String contador_complemento) {
		this.contador_complemento = contador_complemento;
	}

	public String getContador_bairro() {
		return contador_bairro;
	}

	public void setContador_bairro(String contador_bairro) {
		this.contador_bairro = contador_bairro;
	}

	public String getContador_fone() {
		return contador_fone;
	}

	public void setContador_fone(String contador_fone) {
		this.contador_fone = contador_fone;
	}

	public String getContador_fax() {
		return contador_fax;
	}

	public void setContador_fax(String contador_fax) {
		this.contador_fax = contador_fax;
	}

	public String getContador_email() {
		return contador_email;
	}

	public void setContador_email(String contador_email) {
		this.contador_email = contador_email;
	}

	public String getInsc_municipal() {
		return insc_municipal;
	}

	public void setInsc_municipal(String insc_municipal) {
		this.insc_municipal = insc_municipal;
	}

	public String getData_abertura() {
		return data_abertura;
	}

	public void setData_abertura(String data_abertura) {
		this.data_abertura = data_abertura;
	}

	public String getCnae() {
		return cnae;
	}

	public void setCnae(String cnae) {
		this.cnae = cnae;
	}

	public String getCrt() {
		return crt;
	}

	public void setCrt(String crt) {
		this.crt = crt;
	}

	public String getContador_cidade() {
		return contador_cidade;
	}

	public void setContador_cidade(String contador_cidade) {
		this.contador_cidade = contador_cidade;
	}

	public String getContador_cod_municipio() {
		return contador_cod_municipio;
	}

	public void setContador_cod_municipio(String contador_cod_municipio) {
		this.contador_cod_municipio = contador_cod_municipio;
	}

	public String getContador_uf() {
		return contador_uf;
	}

	public void setContador_uf(String contador_uf) {
		this.contador_uf = contador_uf;
	}

	public Integer getPermite_credito() {
		return permite_credito;
	}

	public void setPermite_credito(Integer permite_credito) {
		this.permite_credito = permite_credito;
	}

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	public Double getDfixas() {
		return dfixas;
	}

	public void setDfixas(Double dfixas) {
		this.dfixas = dfixas;
	}

	public Integer getTipocalculo() {
		return tipocalculo;
	}

	public void setTipocalculo(Integer tipocalculo) {
		this.tipocalculo = tipocalculo;
	}

	public String getSerie_cte() {
		return serie_cte;
	}

	public void setSerie_cte(String serie_cte) {
		this.serie_cte = serie_cte;
	}

	public String getSeq_cte() {
		return seq_cte;
	}

	public void setSeq_cte(String seq_cte) {
		this.seq_cte = seq_cte;
	}

	public String getCod_pais() {
		return cod_pais;
	}

	public void setCod_pais(String cod_pais) {
		this.cod_pais = cod_pais;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getAidf() {
		return aidf;
	}

	public void setAidf(String aidf) {
		this.aidf = aidf;
	}

	public String getNinicial() {
		return ninicial;
	}

	public void setNinicial(String ninicial) {
		this.ninicial = ninicial;
	}

	public String getNfinal() {
		return nfinal;
	}

	public void setNfinal(String nfinal) {
		this.nfinal = nfinal;
	}

	public String getN_nf_d() {
		return n_nf_d;
	}

	public void setN_nf_d(String n_nf_d) {
		this.n_nf_d = n_nf_d;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getRntrc() {
		return rntrc;
	}

	public void setRntrc(String rntrc) {
		this.rntrc = rntrc;
	}

	public Integer getSerie_mdfe() {
		return serie_mdfe;
	}

	public void setSerie_mdfe(Integer serie_mdfe) {
		this.serie_mdfe = serie_mdfe;
	}

	public Integer getNumero_mdfe() {
		return numero_mdfe;
	}

	public void setNumero_mdfe(Integer numero_mdfe) {
		this.numero_mdfe = numero_mdfe;
	}

	public String getMail_server() {
		return mail_server;
	}

	public void setMail_server(String mail_server) {
		this.mail_server = mail_server;
	}

	public String getMail_porta() {
		return mail_porta;
	}

	public void setMail_porta(String mail_porta) {
		this.mail_porta = mail_porta;
	}

	public String getMail_username() {
		return mail_username;
	}

	public void setMail_username(String mail_username) {
		this.mail_username = mail_username;
	}

	public String getMail_password() {
		return mail_password;
	}

	public void setMail_password(String mail_password) {
		this.mail_password = mail_password;
	}
}
