package Questao2;

import java.util.Date;

public class Venda {

    private Date data;
    private Cliente cliente;
    private int quantidade;
    private Produto[] produtos;

    public Venda(Date data) {
        this.data = data;
        this.cliente = new Cliente("Não informado");
    }

    public Venda(Date data, Cliente cliente) {
        this.data = data;
        this.cliente = cliente;
    }

    public Venda(Date data, Cliente cliente, int maxProdutos) {
        this.data = data;
        this.cliente = cliente;
        this.produtos = new Produto[maxProdutos];
        this.quantidade = 0;
    }

    void adicionaProduto(Produto p) {

        if (produtos == null) {
            produtos = new Produto[1];
        }

        if (quantidade == produtos.length) {

            Produto[] novo = new Produto[produtos.length * 2];

            for (int i = 0; i < produtos.length; i++) {
                novo[i] = produtos[i];
            }

            produtos = novo;
        }

        produtos[quantidade] = p;
        quantidade++;
    }

    double getTotal() {

        if (produtos == null) {
            return 0.0;
        }

        double total = 0;

        for (int i = 0; i < quantidade; i++) {
            total += produtos[i].getTotal();
        }

        return total;
    }

    Produto getProduto(int i) {

        if (produtos == null) {
            return null;
        }

        if (i >= 0 && i < quantidade) {
            return produtos[i];
        }

        return null;
    }

    int getNumProdutos() {
        return quantidade;
    }

    String imprimeVenda() {

        String texto = "Data: " + data + "\n";
        texto += "Cliente: " + cliente.getNome() + "\n";

        for (int i = 0; i < quantidade; i++) {
            texto += produtos[i].imprimeProduto() + "\n";
        }

        texto += "Total: R$ " + getTotal();

        return texto;
    }
}