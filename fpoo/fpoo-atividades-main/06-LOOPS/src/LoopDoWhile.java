import java.util.Scanner;
public class LoopDoWhile {
	
	/* EXEMPLO DE LOOP DO...WHILE POR CONTADOR*/
	public void loopDo() {
		
		int contador = 11;
		
		
		do {
			
			System.out.println("O VALOR DO CONTADOR DO LOOP DO... WHILE É: " + contador);
			contador++; 
			
		} while (contador <= 10);
	}
	/* EXEMPLO DE LOOP DO...WHILE POR SENTINELA: */
	
	
	
	public void loopDoSentinela() {
		
		String opcao = "";
		Scanner objScanner = new Scanner(System.in);
		
		do {
			
			System.out.println("DO WHILE ");
			System.out.println("DIGITE UM VALOR OU SAIR: ");
			opcao = objScanner.next(); 
			System.out.println("VALOR DIGITADO: " + opcao);
			
		} while (!opcao.equalsIgnoreCase("sair"));
		
		System.out.println("OBRIGADO POR USAR O PROGRAMA");
	}

}
