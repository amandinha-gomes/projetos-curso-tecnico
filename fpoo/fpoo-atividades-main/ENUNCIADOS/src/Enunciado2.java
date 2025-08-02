
public class Enunciado2 {
	
	public void exibirMaior2(int n1, int n2, int n3) {
		
		
		if(n1 > n2) {
			if(n1 > n3) {
				System.out.println("N1 É MAIOR QUE N2");
				System.out.println("N1 É MAIOR QUE N3");
				System.exit(0);
			 }
		}
		
		if (n2 > n1) {
			if (n2 > n3) {
				System.out.println("N2 É MAIOR QUE N1");
				System.out.println("N2 É MAIOR QUE N3");
				System.exit(0);
		  }
		}
		
		if (n3 > n1) {
    		if (n3 > n2) {
    			System.out.println("N3 É MAIOR QUE N1");
    			System.out.println("N3 É MAIOR QUE N2");
    			System.exit(0);
    		}
    	}
		
}
}
