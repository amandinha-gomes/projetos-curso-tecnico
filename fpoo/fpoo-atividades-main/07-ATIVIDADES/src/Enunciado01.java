import java.util.Scanner;

public class Enunciado01 {
	
	String[] listarNomes = new String[10];
	Scanner scanner = new Scanner(System.in);
	
	
	public void listarNomes() {
		
		int cont = 0;
		while (cont < 10) {
		
			System.out.println("INFORME O NOME " + (cont + 1));
			listarNomes[cont] = scanner.next();
			cont++;
				
		}
		
		System.out.println(cont);
		cont = 0;
		while (cont < 10) {
			
			System.out.println("NOME: " + cont + " É " + listarNomes[cont]);
			cont++;
				
		}
	}
}


