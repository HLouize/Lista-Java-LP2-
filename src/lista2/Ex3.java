package lista2;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		System.out.println("Vamos calcular uma equação de segundo grau?");
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o coeficiente a: ");
		int a = ler.nextInt();
		
		System.out.println("Digite o coeficiente b: ");
		int b = ler.nextInt();
		
		System.out.println("Digite o coeficiente c: ");
		int c = ler.nextInt();
		
		ler.close();
		
		double delta = ((b*b)-(4*a*c));
		if (a==0) {
			System.out.println((c*-1)/b);
		}
		
		else if (delta==0) {
			System.out.println(-b/(2.0*a));
		}
		
		else if (delta<0) {
			System.out.println(-b/(2.0*a) + "+" + (Math.sqrt(-delta))/(2.0*a) + "i");
			System.out.println(-b/(2.0*a) + "-" + (Math.sqrt(-delta))/(2.0*a) + "i");
		}
		
		else if (delta>0) {
			System.out.println((-b+Math.sqrt(delta))/(2.0*a));
			System.out.println((-b-Math.sqrt(delta))/(2.0*a));
		}
		
		//baskara = (-b+- Math.sqrt((b*b)-(4*a*c)))/2*a
		
	}
	}
	
