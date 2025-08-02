package spotify;

public class podcast {

	private String nome;
	private int episodios;
	private int tempoEpisodio;
	private double tempoTotal;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getEpisodios() {
		return episodios;
	}
	
	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}
	
	public int getTempoEpisodio() {
		return tempoEpisodio;
	}
	
	public void setTempoEpisodio(int tempoEpisodio) {
		this.tempoEpisodio = tempoEpisodio;
	}
	
	public double getTempoTotal() {
		return tempoTotal;
	}
	
	public void setTempoTotal(double tempoTotal) {
		this.tempoTotal = tempoTotal;
	}

	public void podcast () {
		
		System.out.println("Podcast: " + nome);
		System.out.println("Episódios: " + episodios);
		System.out.println("Tempo por ep (horas): " + tempoEpisodio);
		System.out.println("Tempo total é de: " + episodios * tempoEpisodio);
	}
}