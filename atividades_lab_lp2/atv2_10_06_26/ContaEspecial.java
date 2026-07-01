package banco;

public class ContaEspecial extends ContaCorrente {

    private float limite;

    public ContaEspecial(float saldo, float limite) {
        super(saldo);
        this.limite = limite;
    }

    @Override
    public void debite(float valor, String descricao) {

        if (getSaldo() + limite >= valor) {

            if (quantidade < MAX_TRANSACOES) {

                transacoes[quantidade] =
                        new Transacao(valor, 'D', descricao);

                quantidade++;
            }
        }
    }

    @Override
    public void debite(float valor) {
        debite(valor, "Debito");
    }
}