package funcionarios;

class Professor extends Funcionario {

    public Professor(String nome, double salario) {
        super(nome, salario);
    }


    @Override
    public double calcularBonus() {
        return this.salario * 0.15;
    }

  
    @Override
    public String toString() {
        return "Professor: " + this.nome + 
               " | Salário: R$ " + String.format("%.2f", this.salario) + 
               " | Bônus: R$ " + String.format("%.2f", calcularBonus());
    }
}