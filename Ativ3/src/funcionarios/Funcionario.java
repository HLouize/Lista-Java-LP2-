package funcionarios;

public abstract class Funcionario {
	protected String nome;
	protected double salario;
	public Funcionario(String nome, double salario) {
	this.nome = nome;
	this.salario = salario;
	}
	public void exibirDados() {
	System.out.println(nome);
	}
	public abstract double calcularBonus();
}
