package br.com.projeto;

import br.com.classes.Atendimento;
import br.com.classes.Cliente;
import br.com.classes.Diarista;

public class App {

	public static void main(String[] args) {
		
		Diarista diarista = new Diarista();
		
		diarista.setNome("Joana");
		diarista.setTelefone("(11) 9002-8922");
		diarista.setEndereço("Av Cajamar, N 111");
		diarista.setChavepix("123");
		
		System.out.println("Nome Diarista: " + diarista.getNome());
		System.out.println("Telefone: " + diarista.getTelefone());
		System.out.println("Endereço: " + diarista.getEndereço());
		System.out.println("Chave Pix Diarista: " + diarista.getChavepix());
		diarista.atender("Daniel");
		
		//valor na conta diarista//
		System.out.println("Saldo Cliente: " + diarista.getSaldo());
		diarista.depositar(30);
		System.out.println("Novo saldo: " + diarista.getSaldo());
		diarista.sacar(10);
		System.out.println("Novo saldo: " + diarista.getSaldo());
		
		System.out.println("=============================================");
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Daniel");
		cliente.setTelefone("(11) 99875-7857");
		cliente.setEndereço("Portal dos Ipes, N 35");
		
		System.out.println("Nome Cliente: " + cliente.getNome());
		System.out.println("Telefone: " + cliente.getTelefone());
		System.out.println("Endereço: " + cliente.getEndereço());
		
		//valor na conta cliente//
		System.out.println("Saldo Cliente: " + cliente.getSaldo());
		cliente.depositar(30);
		System.out.println("Novo saldo: " + cliente.getSaldo());
		cliente.sacar(10);
		System.out.println("Novo saldo: " + cliente.getSaldo());
		
		
		System.out.println("=============================================");
		
		Atendimento atendimento = new Atendimento();
		
		atendimento.setHoras(0);
		System.out.println(atendimento.getHoras());
		
	}
}
