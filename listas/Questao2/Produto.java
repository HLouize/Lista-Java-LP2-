package Questao2;

public class Produto {

    private String descricao;
    private double preco;

    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public double getTotal() {
        return preco;
    }

    public String imprimeProduto() {
        return descricao + " que custa R$" + preco;
    }
}

