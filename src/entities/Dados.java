package entities;

import java.util.ArrayList;
import java.util.List;

public class Dados {

	private String nome;
	private String Sobrenome;
	private Integer cpf;
	private Double valor;
	
	private List<String> listaPais = new ArrayList<>();
	
	public Dados () {
	}

	public Dados(String nome, String sobrenome, Integer cpf, Double valor) {
		this.nome = nome;
		Sobrenome = sobrenome;
		this.cpf = cpf;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public List<String> getListPais() {
		return listaPais;
	}


	public void addLista(String nomePai) {
		listaPais.add(nomePai);
	}
	public void removerLista(ListaPais pais) {
		listaPais.remove(pais);
	}

	public void addLista(String nomePai) {
		listaPais.add(nomePai);
		
	}
	
}
