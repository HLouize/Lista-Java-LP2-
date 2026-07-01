package banco;

public class Main {

    public static void main(String[] args) {

        Transacao t1 = new Transacao(
                1200,
                'C',
                "Deposito em cheque");

        Transacao t2 = new Transacao(
                300,
                'D',
                "Pagamento colegio");

        System.out.println(t1);
        System.out.println(t2);

        System.out.println();

        ContaCorrente cc1 = new ContaCorrente(100);

        cc1.credite(30);
        cc1.credite(25);
        cc1.debite(15);
        cc1.debite(10);

        System.out.println("Saldo: " + cc1.getSaldo());

        System.out.println("\nExtrato:");
        System.out.println(cc1.getExtrato());

        System.out.println("Saldo depois do extrato: "
                + cc1.getSaldo());

        ContaCorrente[] contas = {
                new ContaCorrente(100),
                new ContaCorrente(200),
                new ContaEspecial(100, 200),
                new ContaEspecial(300, 100),
                new ContaPoupanca(100),
                new ContaPoupanca(500)
        };

        System.out.println("\nTeste das contas:");

        for (ContaCorrente c : contas) {

            c.credite(50);
            c.debite(20);

            System.out.println(c.getSaldo());
        }

        ContaPoupanca p = new ContaPoupanca(1000);

        p.renderJuros();

        System.out.println("\nPoupanca com rendimento:");
        System.out.println(p.getSaldo());
    }
}
