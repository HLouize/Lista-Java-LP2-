package lista2;
import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite seu peso: ");
		Float peso = ler.nextFloat();
		System.out.print("Digite sua altura: ");
		Float altura = ler.nextFloat();
		ler.close();
		float imc = peso/(altura*altura);
		if(imc<18.5) {
			System.out.println("Você está abaixo do peso ideal");
			
		}
		else if(imc>=18.5 && imc<25) {
				System.out.println("Parabéns — você está em seu peso normal!");
			}
		else if(imc>=25 && imc<30) {
				System.out.println("Você está acima de seu peso (sobrepeso)");
				}
		else if(imc>=30 && imc<35) {
			System.out.println("Obesidade grau I ");
				}
		else if(imc>=35 && imc<40) {
			System.out.println("Obesidade grau II ");
				}
		else if(imc>=40) {
			System.out.println("Obesidade grau III ");
				}
			}
			
		}







