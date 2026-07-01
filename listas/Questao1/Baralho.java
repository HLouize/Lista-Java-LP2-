package Questao1;

public class Baralho {
	private Carta[] cartas;
	private int topo;

	public Baralho() {
	    this.cartas = new Carta[56];
	    this.topo = 0;

	    String[] naipes = {"Copas", "Ouros", "Espadas", "Paus"};
	    String[] nomes = {
	        "Ás", "2", "3", "4", "5", "6", "7",
	        "8", "9", "10", "Valete", "Rainha", "Rei"
	    };

	    int index = 0;

	    for (int i = 0; i < naipes.length; i++) {
	        for (int j = 0; j < nomes.length; j++) {
	            String nomeAtual = nomes[j];
	            String naipeAtual = naipes[i];

	            cartas[index] = new Carta(nomeAtual, naipeAtual);
	            index++;
	        }
	    }

	    for (int i = 0; i < 4; i++) {
	        cartas[index] = new Carta("coringa", "coringa");
	        index++;
	    }
	}

	public void embaralha() {
	    for (int i = 0; i < 236; i++) {
	        int c1 = (int) (Math.random() * cartas.length);
	        int c2 = (int) (Math.random() * cartas.length);

	        Carta aux = cartas[c1];
	        cartas[c1] = cartas[c2];
	        cartas[c2] = aux;
	    }
	}

	public boolean temCarta() {
	    return topo < cartas.length;
	}

	public Carta daCarta() {
	    if (temCarta()) {
	        Carta devolvida = cartas[topo];
	        topo++;
	        return devolvida;
	    }

	    return null;
	}

	public void imprimeBaralho() {
	    for (int i = topo; i < cartas.length; i++) {
	        System.out.print(cartas[i] + " , ");
	    }
	}
}