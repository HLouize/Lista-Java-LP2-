package funcionarios;

class Tecnico extends Funcionario {
    private double gratificacao;

  
    public Tecnico(String nome, double salario, double gratificacao) {
        super(nome, salario);
        this.gratificacao = gratificacao;
    }

    @Override
    public double calcularBonus() {
        return this.gratificacao;
    }

    @Override
    public String toString() {
        return "Técnico: " + this.nome + 
               " | Salário: R$ " + String.format("%.2f", this.salario) + 
               " | Bônus (Gratificação): R$ " + String.format("%.2f", calcularBonus());
    }
}