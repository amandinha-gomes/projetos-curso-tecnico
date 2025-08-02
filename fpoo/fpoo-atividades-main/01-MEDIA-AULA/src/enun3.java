import java.util.Scanner;

public class enun3 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in); 
         
		double Tempo, Velocidade, Distancia, resultado; 

		System.out.println("#### BEM VINDO A LITERS CALCULATOR ####"); 
		
		System.out.println(" COLOQUE A QUANTIDADE DE TEMPO: "); 
		 Tempo = scanner.nextDouble(); 
		
		 System.out.println(" COLOQUE A QUANTIDADE DA VELOCIDADE: "); 
		 Velocidade = scanner.nextDouble(); 
		 
		resultado = (Tempo * Velocidade) /12 ; 
		
		System.out.println(" RESULTADO:" + resultado); 
		
		System.out.println("#### OBRIGADO ####"); 

	}

}
