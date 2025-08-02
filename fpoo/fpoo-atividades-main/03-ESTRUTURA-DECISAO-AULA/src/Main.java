
public class Main {

	public static void main(String[] args) {
		
		OperadoresRelacionais objRelacionais = new OperadoresRelacionais();
		DecisaoSimples objDecisaoSimples = new DecisaoSimples();
		DecisaoComposta objDecisaoComposta = new DecisaoComposta();
		Textos objTextos = new Textos();
		EstruturaDecisaoTexto objDecisaoTexto = new EstruturaDecisaoTexto();
		//objRelacionais.testesLogicos();
		
		//objDecisaoSimples.testeMenor(50, 40);
		//objDecisaoSimples.testeMenorIgual(60, 50);
		//objDecisaoSimples.testeMaior(50, 10);
		//objDecisaoSimples.testeMaiorIgual(100, 20);
		//objDecisaoSimples.testeIgual(5, 5);
		//objDecisaoSimples.testeDiferente(5, 9);
		
		//objDecisaoComposta.testeMenor(1000, 100);
		
		//objTextos.testesLogicos();
		objDecisaoTexto.testeVazio("SESI/SENAI DESENVOLVIMENTO DE SISTEMAS");
		objDecisaoTexto.testeIgual("SESI", "SENAI");
		objDecisaoTexto.testeIgual("SESI", "SESI");
		objDecisaoTexto.testeIgual("SENAI", "SENAI");
		objDecisaoTexto.contador("amanda1234");
		
		
	}

}
