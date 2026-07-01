package Questao2;

public class Loja {
	public static void main(String[] args) {

	    Caixa caixa = new Caixa();

	    Cliente c1 = new Cliente("Héllida", "Rua do limoeiro");
	    Cliente c2 = new Cliente("João");

	    caixa.novaVenda(c1);

	    caixa.adicionaProduto(new Produto("Mouse", 50));
	    caixa.adicionaProduto(new Produto("Teclado", 100));

	    System.out.println("VENDA 1:");
	    System.out.println(caixa.getVendaAtual().imprimeVenda());

	    caixa.novaVenda(c2);

	    caixa.adicionaProduto(new Produto("Monitor", 800));

	    System.out.println("\nVENDA 2:");
	    System.out.println(caixa.getVendaAtual().imprimeVenda());

	    caixa.novaVenda(new Cliente("Não informado"));

	    caixa.adicionaProduto(new Produto("Cabo USB", 20));

	    System.out.println("\nVENDA 3:");
	    System.out.println(caixa.getVendaAtual().imprimeVenda());
	}
}
