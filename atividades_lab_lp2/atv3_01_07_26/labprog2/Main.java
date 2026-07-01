package labprog2;

public class Main {

    public static void main(String[] args) {


        Estacionamento estacionamento = new Estacionamento(5);


        Veiculo v1 = new Veiculo("ABC-1234", "Gol", 3, 10);
        Moto m1 = new Moto("DEF-5678", "Honda CG", 5, 8, 10);
        Caminhao c1 = new Caminhao("GHI-9012", "Volvo FH", 6, 20, 50);
        Veiculo v2 = new Veiculo("JKL-3456", "Onix", 2, 12);
        Moto m2 = new Moto("MNO-7890", "Yamaha Fazer", 4, 9, 15);

        
        estacionamento.adicionarVeiculo(v1);
        estacionamento.adicionarVeiculo(m1);
        estacionamento.adicionarVeiculo(c1);
        estacionamento.adicionarVeiculo(v2);
        estacionamento.adicionarVeiculo(m2);


        System.out.println("Faturamento Total: R$ " +
                estacionamento.calcularFaturamentoTotal());

        System.out.println("\nVeículos no estacionamento:");
        System.out.println();

  
        Veiculo[] lista = {v1, m1, c1, v2, m2};


        for (int i = 0; i < lista.length; i++) {
            lista[i].exibirDados();
            System.out.println("Valor da estadia: R$ " +
                    lista[i].calcularValorEstadia());
            System.out.println("---------------------------");
        }
    }
}