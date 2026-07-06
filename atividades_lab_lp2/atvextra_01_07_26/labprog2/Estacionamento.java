package labprog2;

public class Estacionamento {
	private Veiculo[] veiculos;
	private int quantidadeVeiculos;

	   public Estacionamento(int tamanhoMaximo) {
	        veiculos = new Veiculo[tamanhoMaximo];
	        quantidadeVeiculos = 0;
	    }

	  
	    public void adicionarVeiculo(Veiculo veiculo) {
	        if (quantidadeVeiculos < veiculos.length) {
	            veiculos[quantidadeVeiculos] = veiculo;
	            quantidadeVeiculos++;
	        } else {
	            System.out.println("Estacionamento cheio!");
	        }
	    }

	  
	    public double calcularFaturamentoTotal() {
	        double total = 0;

	        for (int i = 0; i < quantidadeVeiculos; i++) {
	            total += veiculos[i].calcularValorEstadia();
	        }

	        return total;
	    }
}
