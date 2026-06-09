package Questao1;

public class Main {
	public static void main(String[] args) {

	    Baralho b1 = new Baralho();

	    System.out.println("Baralho ordenado: ");
	    b1.imprimeBaralho();
	    System.out.println();

	    System.out.println("-------------------------------------");

	    System.out.println("Baralho embaralhado: ");
	    b1.embaralha();
	    b1.imprimeBaralho();
	    System.out.println();

	    System.out.println("-------------------------------------");

	    Carta c = b1.daCarta();

	    System.out.println("Carta distribuída: " + c);
	    System.out.println("-------------------------------------");

	    System.out.println("Baralho depois de distribuir uma carta");
	    System.out.println();

	    b1.imprimeBaralho();

	    System.out.println("-------------------------------------");
	}
}
