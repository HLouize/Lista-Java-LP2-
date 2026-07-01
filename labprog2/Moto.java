package labprog2;

public class Moto extends Veiculo {

    private double percentualDesconto;

    
    public Moto() {
        super();
        this.percentualDesconto = 0;
    }

    
    public Moto(String placa, String modelo, int horas, float valorh, double percentualDesconto) {
        super(placa, modelo, horas, valorh);
        this.percentualDesconto = percentualDesconto;
    }

    
    public double getPercentualDesconto() {
        return percentualDesconto;
    }

   
    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

   
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Percentual de desconto: " + percentualDesconto + "%");
    }

   
    @Override
    public double calcularValorEstadia() {
        double valor = super.calcularValorEstadia();
        return valor - (valor * percentualDesconto / 100);
    }
}