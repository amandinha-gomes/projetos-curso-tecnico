package br.com.classes;

import br.com.classes.interfaces.Isaldo;

abstract class Pessoa implements Isaldo{
	
	protected String nome;
	protected String telefone;
	protected String endereço;
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEndereço() {
		return endereço;
	}
	
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
}
