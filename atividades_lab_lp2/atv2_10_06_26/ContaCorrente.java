package banco;

public class ContaCorrente {

    protected String cliente;
    protected Transacao[] transacoes;
    protected float saldoAnterior;

    public static final int MAX_TRANSACOES = 100;

    protected int quantidade;

    public ContaCorrente(float saldo) {
        saldoAnterior = saldo;
        transacoes = new Transacao[MAX_TRANSACOES];
        quantidade = 0;
    }

    public ContaCorrente(float saldo, String cliente) {
        this(saldo);
        this.cliente = cliente;
    }

    public void credite(float valor, String descricao) {

        if (quantidade < MAX_TRANSACOES) {

            transacoes[quantidade] =
                    new Transacao(valor, 'C', descricao);

            quantidade++;
        }
    }

    public void credite(float valor) {
        credite(valor, "Credito");
    }

    public void debite(float valor, String descricao) {

        if (quantidade < MAX_TRANSACOES) {

            transacoes[quantidade] =
                    new Transacao(valor, 'D', descricao);

            quantidade++;
        }
    }

    public void debite(float valor) {
        debite(valor, "Debito");
    }

    public float getSaldo() {

        float saldo = saldoAnterior;

        for (int i = 0; i < quantidade; i++) {

            if (transacoes[i].getTipo() == 'C') {
                saldo += transacoes[i].getValor();
            } else {
                saldo -= transacoes[i].getValor();
            }
        }

        return saldo;
    }

    public String getExtrato() {

        String texto = "";

        for (int i = 0; i < quantidade; i++) {
            texto += transacoes[i] + "\n";
        }

        saldoAnterior = getSaldo();

        quantidade = 0;

        return texto;
    }
}