import java.util.Scanner;

public class Enunciado02 {
	
	int[] valor1 = new int[10];
	int[] valor2 = new int [10];
	Scanner scanner = new Scanner(System.in);
	
	public void armazem() {
		
		//System.out.println("AAAAAA");
		
		int cont = 0;
		while (cont < valor1.length) {
			
			System.out.println("INFORME OS VALORES " + (cont + 1));
			valor1[cont] = scanner.nextInt();
			cont++;
			
			}
			
			cont = 0;
			while(cont < valor2.length) {
				
				valor2 [cont] = valor1 [cont] * 3;
				cont++;
			
			}
		
			cont = 0;
			while (cont < valor1.length) {
				System.out.println((cont + 1) + "º INDICE DO ARRAY VALOR1: " + valor1[cont]);
				System.out.println((cont + 1) + "º INDICE DO ARRAY VALOR2: " + valor2[cont]);
				cont++;
				
		}
	}
	
}



