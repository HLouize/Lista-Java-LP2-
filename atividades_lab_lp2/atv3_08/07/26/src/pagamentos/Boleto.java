package pagamentos;

class Boleto extends Pagamento {
    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via boleto registrado. Valor: R$ " + String.format("%.2f", valor));
    }
}