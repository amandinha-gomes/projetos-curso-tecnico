import java.util.Scanner; 

public class enunciado1 {

	public static void main(String[] args) {
	 
		Scanner scanner = new Scanner(System.in); 
		
		double celsius1, resultado; 
		
		System.out.println("#### BEM VINDO  ####"); 
		
		System.out.println(" DIGITE A TEMPERATURA : "); 
		celsius1 = scanner.nextDouble(); 
		
		resultado = (celsius1 * 1.8 + 32); 
		
		System.out.println(" RESULTADO:" + resultado); 
		System.out.println("#### OBRIGADO ####"); 
	 

	}

}
