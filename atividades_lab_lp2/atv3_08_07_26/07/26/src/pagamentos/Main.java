package pagamentos;

public class Main {
    public static void main(String[] args) {
        
        Pagamento[] listaPagamentos = new Pagamento[3];

        
        listaPagamentos[0] = new Pix(45.90);
        listaPagamentos[1] = new CartaoCredito(250.00);
        listaPagamentos[2] = new Boleto(120.35);

     
        
        
        for (Pagamento pag : listaPagamentos) {
            pag.processarPagamento(); 
        }
    }
}