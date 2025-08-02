package spotify;

public class infrormacoes {

	//ATRIBUTOS
	private String titulo;
	private String cantor;
	private String album;
	private String genero;
	private double duracao;
	private int totalReproducao;
	private double curtidas;
	private int ranking;
	
	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCantor() {
		return cantor;
	}

	public void setCantor(String cantor) {
		this.cantor = cantor;
	}

	public double getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(double curtidas) {
		this.curtidas = curtidas;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public double getDuracao() {
		return duracao;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public int getTotalReproducao() {
		return totalReproducao;
	}
	
	public void setTotalReproducao(int totalReproducao) {
		this.totalReproducao = totalReproducao;
	}
	
		//METODOS
		public void imprimeInfo () {
			
		System.out.println("A musica é: " + titulo);
		System.out.println("O cantor é: " + cantor);
		System.out.println("O album é: " + album);
		System.out.println("O genero é: " + genero);
		System.out.println("A duração em minutos é de: " + duracao);
		System.out.println("Total de curtidas: " + curtidas);
		System.out.println("Posição no ranking: " + ranking);
	}
		
	public void curtidos() {
			
		if (curtidas <=0) {
			System.out.println("A música foi curtida ♥");
				
		} else {
			System.out.println("A música não foi curtida ");
		}
	}
}
			
		