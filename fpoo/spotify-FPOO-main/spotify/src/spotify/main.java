package spotify;

import java.util.Scanner;

public class main {

public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		audio primeiroAudio = new audio();
		
		boolean ativa = true;
		int opcao;
		
		while(ativa == true) {
		System.out.println("Selecione uma opção");
		
		System.out.println("1- Música: Preferida - Kayblack");
		System.out.println("2- Podcast: Podpah");
		System.out.println("3- Sair do programa");
		opcao = scanner.nextInt();
		
		switch (opcao) {
		
		case 1:
			primeiroAudio.setTitulo("Preferida");
			primeiroAudio.setCantor("Kayblack");
			primeiroAudio.setDuracao(2);
			primeiroAudio.setRanking(1);
			primeiroAudio.setAlbum("Contradições");
			primeiroAudio.setGenero("Trap");
			primeiroAudio.imprimeInfo();
			primeiroAudio.curtidos();
		break;

	    
		case 2:
			System.out.println("------------------------------------------------------------------------------");
			
			podcast primeiroPodcast = new podcast();
			
			primeiroPodcast.setNome("Podpah");
			primeiroPodcast.setEpisodios(100);
			primeiroPodcast.setTempoEpisodio(2);
			primeiroPodcast.setTempoTotal(200);
			
			primeiroPodcast.podcast();
		
		break;
		
		case 3:
			System.out.println("Sair do programa");
			ativa = false;
		break;
		
		default:
			System.out.println("Opção Invalida");
			}
		}
	}
}

		
		
		
		
