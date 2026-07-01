package Questao2;

public class Caixa {

    private Venda[] vendas;
    private int quantidade;

    private Venda vendaAtual;

    public Caixa() {
        vendas = new Venda[100];
        quantidade = 0;
    }

    public void novaVenda(Cliente c) {
        vendaAtual = new Venda(new java.util.Date(), c);
        vendas[quantidade] = vendaAtual;
        quantidade++;
    }

    public void adicionaProduto(Produto p) {
        if (vendaAtual != null) {
            vendaAtual.adicionaProduto(p);
        }
    }

    public Venda getVendaAtual() {
        return vendaAtual;
    }
}