import java.util.Scanner;

public class DecimalBinario {
	
	 public static void main(String[] args) {
	        
		 Scanner scanner = new Scanner(System.in); 
		 
		 int numero; 
		 
		 System.out.println("INFORME O NUMERO: ");
			numero = (int)scanner.nextDouble(); 
			
		 
		 System.out.println("RESULTADO =" + Integer.toBinaryString(numero));
			 
	        
	    }

}
