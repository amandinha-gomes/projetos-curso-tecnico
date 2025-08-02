import java.util.Scanner;

public class main3 {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);
		Enunciado3 ObjEnunciado3 = new Enunciado3();
		
		//int nota1, nota2, nota3, nota4, media, nota5;
		 
		System.out.println ("INFORME A PRIMEIRA NOTA");
		ObjEnunciado3.setN1(objScanner.nextFloat());
		
		System.out.println("INFROME A SEGUNDA NOTA:");
		ObjEnunciado3.setN2(objScanner.nextFloat());
		
		System.out.println("INFROME A TERCEIRA NOTA :");
		ObjEnunciado3.setN3(objScanner.nextFloat());
		
		System.out.println("INFROME A QUARTA NOTA :");
		ObjEnunciado3.setN4(objScanner.nextFloat()); 
		
		ObjEnunciado3.calcularMedia();
		System.out.println("media" + ObjEnunciado3.getMedia()); 
		
		if(ObjEnunciado3.getMedia() > 7) {
			System.out.println ("APROVADO"); 
		}else {
			
			System.out.println("INFORME A QUINTA NOTA: ");
			ObjEnunciado3.setN5(objScanner.nextFloat()); 
			ObjEnunciado3.calcularMedia2();
			
			if (ObjEnunciado3.getMedia() > 7){
				System.out.println ("APROVADO"); 
			}else {
				
					System.out.println ("REPROVADO");
			}
				
			}
		}
	}
