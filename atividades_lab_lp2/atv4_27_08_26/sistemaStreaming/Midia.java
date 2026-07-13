package sistemaStreaming;
import java.util.ArrayList;
import java.util.List;
interface Reproduzivel {
    void play();
    void pause();
    void stop();
}

public abstract class Midia {
	private String titulo;
	private double duracao;
	private int anoDeLancamento;

	
	public Midia(String titulo, double duracao, int anoDeLancamento) {
		this.titulo=titulo;
		this.duracao=duracao;
		this.anoDeLancamento=anoDeLancamento;
	}
	public String getTitulo() {
		return titulo;
		}
    public double getDuracao() {
    	return duracao;
    	}
    public int getAnoDeLancamento() {
    	return anoDeLancamento;
    	}
}
