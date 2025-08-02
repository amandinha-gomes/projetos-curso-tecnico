import java.util.Scanner; 

public class enunci2 {

	public static void main(String[] args) {
	 
		Scanner scanner = new Scanner(System.in); 
		
		double fahrenheit, resultado; 
		
		System.out.println("#### BEM VINDO ####"); 
		
		System.out.println(" DIGITE A TEMPERATURA: "); 
		fahrenheit = scanner.nextDouble(); 
		
		resultado = (fahrenheit - 32) / 1.8; 
		
		System.out.println(" RESULTADO:" + resultado); 
		System.out.println("#### OBRIGADO ####"); 
	 
		

	}

}
