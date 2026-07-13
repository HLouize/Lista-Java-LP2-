package pagamentos;

class Pix extends Pagamento {
    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via PIX realizado. Valor: R$ " + String.format("%.2f", valor));
    }
}