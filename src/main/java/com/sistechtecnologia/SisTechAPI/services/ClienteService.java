package com.sistechtecnologia.SisTechAPI.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sistechtecnologia.SisTechAPI.entities.Cliente;
import com.sistechtecnologia.SisTechAPI.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	public List<Cliente> findAll() {
		return repository.findAll();
	}
	
	public Cliente findById(String codigo) {
		Optional<Cliente> obj = repository.findById(codigo);
		return obj.get();
	}
	
	public void updateCliente(Cliente cliente) {
		
		Optional<Cliente> list = repository.findById(cliente.getCodigo());
		Cliente cli = list.orElseThrow();
		
		if (cliente.getId_empresa() == null) cliente.setId_empresa(cli.getId_empresa());	
		if (cliente.getApelido() == null) cliente.setApelido(cli.getId_empresa());	
		if (cliente.getBairro() == null) cliente.setBairro(cli.getId_empresa());	
		if (cliente.getCelular() == null) cliente.setCelular(cli.getId_empresa());	
		if (cliente.getCep() == null) cliente.setCep(cli.getId_empresa());	
		if (cliente.getCidade() == null) cliente.setCidade(cli.getCidade());	
		if (cliente.getCnae() == null) cliente.setCnae(cli.getCnae());	
		if (cliente.getCod_municipio_ibge() == null) cliente.setCod_municipio_ibge(null);	
		if (cliente.getCodconvenio() == null) cliente.setCodconvenio(cli.getCodconvenio());	
		if (cliente.getCodregiao() == null) cliente.setCodregiao(cli.getCodregiao());	
		if (cliente.getCodusuario() == null) cliente.setCodusuario(cli.getCodusuario());	
		if (cliente.getCodvendedor() == null) cliente.setCodvendedor(cli.getCodvendedor());	
		if (cliente.getComplemento() == null) cliente.setComplemento(cli.getComplemento());	
		if (cliente.getConjuge() == null) cliente.setConjuge(cli.getConjuge());
		if (cliente.getConsumidor_final() == null) cliente.setConsumidor_final(cli.getConsumidor_final());
		if (cliente.getCorresp_bairro() == null) cliente.setCorresp_bairro(cli.getCorresp_bairro());
		if (cliente.getCorresp_cep() == null) cliente.setCorresp_cep(cli.getCorresp_cep());
		if (cliente.getCorresp_cidade() == null) cliente.setCorresp_cidade(cli.getCorresp_cidade());
		if (cliente.getCorresp_complemento() == null) cliente.setCorresp_complemento(cli.getCorresp_complemento());
		if (cliente.getCorresp_endereco() == null) cliente.setCorresp_endereco(cli.getCorresp_endereco());
		if (cliente.getCorresp_uf() == null) cliente.setId_empresa(cli.getId_empresa());
		if (cliente.getCondpgto() == null) cliente.setCondpgto(cli.getCondpgto());
		if (cliente.getCpais() == null) cliente.setCpais(cli.getCpais());
		if (cliente.getCpf() == null) cliente.setCpf(cli.getCpf());
				
		repository.save(cliente);
	}

	public void insertCliente(Cliente cliente) {
		repository.save(cliente);		
	}

}
