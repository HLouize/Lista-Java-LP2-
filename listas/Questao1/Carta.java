package Questao1;

public class Carta {
	private String nome;
	private String naipe;
	
	public Carta(String nome, String naipe) {
		this.nome=nome;
		this.naipe=naipe;

	}

	public String getnome() {
		return nome;
	}

	public String getnaipe() {
		return naipe;
	}

	@Override

	public String toString() {
	    if (naipe.equals("coringa")) {
	        return "Coringa";
	    }
	    return  nome + " de " + naipe ;

	}
}
