package banco;

public class ContaPoupanca extends ContaCorrente {

    public ContaPoupanca(float saldo) {
        super(saldo);
    }

    public void renderJuros() {
        saldoAnterior += saldoAnterior * 0.01f;
    }
}