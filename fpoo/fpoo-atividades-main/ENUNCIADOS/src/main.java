import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner objScanner = new Scanner(System.in);
		Enunciado1 ObjEnunciado1 = new Enunciado1();
		Enunciado1_1 ObjEnunciado1_1 = new Enunciado1_1();
		
		System.out.println("INFROME O PRIMEIRO NUMERO:");
		ObjEnunciado1_1.setN1(objScanner.nextInt());
		
		System.out.println("INFROME O SEGUNDO NUMERO:");
		ObjEnunciado1_1.setN2(objScanner.nextInt());
		
		ObjEnunciado1_1.exibirMaior();
		
		/*
		int n1, n2;
		
		
		System.out.println("INFROME O PRIMEIRO NUMERO:");
		n1 = objScanner.nextInt();
		  
		System.out.println("INFROME O SEGUNDO NUMERO:");
		n2 = objScanner.nextInt();
		
		ObjEnunciado1.exibirMaior(n1, n2);
		*/

	}

}
