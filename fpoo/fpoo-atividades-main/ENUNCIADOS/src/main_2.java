import java.util.Scanner;

public class main_2 {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);
		Enunciado2 ObjEnunciado2 = new Enunciado2();
		
int n1, n2, n3;
		
		
		System.out.println("INFROME O PRIMEIRO NUMERO:");
		n1 = objScanner.nextInt();
		
		System.out.println("INFROME O SEGUNDO NUMERO:");
		n2 = objScanner.nextInt();
		
		System.out.println("INFROME O TERCEIRO NUMERO:");
		n3 = objScanner.nextInt();
		
		ObjEnunciado2.exibirMaior2(n1, n2, n3);

	}

}
