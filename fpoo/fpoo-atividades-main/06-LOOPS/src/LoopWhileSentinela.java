import java.util.Scanner;

public class LoopWhileSentinela {
	
	public void loopWhile() {
		
		String sentinela = "";
		Scanner objScanner = new Scanner(System.in);
		
		while (!sentinela.equalsIgnoreCase("sair")) {
			
			System.out.println("WHILE: ");
			System.out.println("DIGITE UM VALOR OU SAIR: ");
			sentinela = objScanner.next();
			System.out.println("VALOR DIGITADO: " + sentinela);
			
		}
		
		System.out.println("OBRIGADO POR USAR O PROGRAMA");
		
	}

}
