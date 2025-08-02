package br.com.classes;

public class Diarista extends Pessoa {
	
	protected String chavepix;
	
	public String getChavepix() {
		return chavepix;
	}

	public void setChavepix(String chavepix) {
		this.chavepix = chavepix;
	}

	public void atender(String nomeCliente) {
		
		System.out.println("Realizando atendimento ao cliente: " + nomeCliente);
		
	}

	@Override
	public void sacar(int valor) {
		
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual - valor;
		this.setSaldo(novoSaldo);
		
	}

	@Override
	public void depositar(int valor) {
		
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual + valor;
		this.setSaldo(novoSaldo);
	}

}
