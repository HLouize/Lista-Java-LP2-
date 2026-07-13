package funcionarios;

public class Main {
    public static void main(String[] args) {
   
        Funcionario prof = new Professor("Luciana", 5000.00);
        Funcionario tech = new Tecnico("Héllida", 3500.00, 450.00);

   
        System.out.println(prof);
        System.out.println(tech);
    }
}