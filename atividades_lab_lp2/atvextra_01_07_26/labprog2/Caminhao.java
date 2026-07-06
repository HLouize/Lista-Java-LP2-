package labprog2;

public class Caminhao extends Veiculo {

    private double taxaCarga;

   
    public Caminhao() {
        super();
        this.taxaCarga = 0;
    }

    
    public Caminhao(String placa, String modelo, int horas, float valorh, double taxaCarga) {
        super(placa, modelo, horas, valorh);
        this.taxaCarga = taxaCarga;
    }

 
    public double getTaxaCarga() {
        return taxaCarga;
    }


    public void setTaxaCarga(double taxaCarga) {
        this.taxaCarga = taxaCarga;
    }

  
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Taxa de carga: R$ " + taxaCarga);
    }

   
    @Override
    public double calcularValorEstadia() {
        return super.calcularValorEstadia() + taxaCarga;
    }
}