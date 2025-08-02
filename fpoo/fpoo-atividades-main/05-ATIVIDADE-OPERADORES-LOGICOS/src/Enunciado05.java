import java.util.Scanner;

public class Enunciado05 {
	
	public void atividade05() {
		Scanner objScanner = new Scanner(System.in);
		
		int Lado1, Lado2, Lado3;
		boolean resultado;
       
		
		System.out.println("INFROME O PRIMEIRO NUMERO:");
		Lado1 = objScanner.nextInt();
		
		System.out.println("INFROME O SEGUNDO NUMERO:");
		Lado2 = objScanner.nextInt();
		
		System.out.println("INFROME O TERCEIRO NUMERO:");
		Lado3 = objScanner.nextInt();
		
		
		if((Lado1 == Lado2) && (Lado2 == Lado3)) {
			System.out.println("É UM TRIÂNGULO EQUILÁTERO");
			System.exit(0);
		}
		
		 if((Lado1 == Lado2) && (Lado2 != Lado3)) {
				System.out.println("É UM TRIÂNGULO ISÓSCELES");
				System.exit(0);
			}
				 
		 if((Lado1 != Lado2) && (Lado2 != Lado3)) {
				System.out.println("É UM TRIÂNGULO ESCALENO");
				System.exit(0);
			}
		 
	}

}
