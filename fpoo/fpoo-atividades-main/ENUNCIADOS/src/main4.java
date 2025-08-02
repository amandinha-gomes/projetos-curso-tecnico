import java.util.Scanner;

public class main4 {

	public static void main(String[] args) {
		
		Scanner objScanner = new Scanner(System.in);
		Enunciado4 ObjEnunciado4 = new Enunciado4();
	
		
		System.out.println ("INFORME O PRIMEIRO NUMERO");
		ObjEnunciado4.setN1(objScanner.nextInt());
		
		ObjEnunciado4.verificaPar();
		
		if(ObjEnunciado4.getResto() == 0) {
			System.out.println("O NUMERO É PAR");
		}else {
			System.out.println("O NUMERO É IMPAR");
			
		}
	}

}
