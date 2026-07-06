package pagamentos;

class CartaoCredito extends Pagamento {
    public CartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via cartão realizado. Valor: R$ " + String.format("%.2f", valor));
    }
}