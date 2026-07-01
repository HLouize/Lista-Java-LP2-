package lista2;
import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	System.out.println("Digite o seu conceito final");
	String conceito = ler.nextLine();
	ler.close();
	if (conceito.equals("A")||conceito.equals("a")) {
		System.out.println("Desempenho excepcional");
	}
	else if (conceito.equals("B")||conceito.equals("b")) {
		System.out.println("Bom desempenho");
	}
	else if (conceito.equals("C")||conceito.equals("c")) {
		System.out.println("Desempenho adequado");
	}
	else if (conceito.equals("D")||conceito.equals("d")) {
		System.out.println("Aproveitamento mínimo");
	}
	else if (conceito.equals("F")||conceito.equals("f")) {
		System.out.println("Reprovado");
	}
	else if (conceito.equals("O")||conceito.equals("o")) {
		System.out.println("Reprovado por falta");
	}
	else if (conceito.equals("I")||conceito.equals("i")) {
		System.out.println("Incompleto");
	}
	}
}
