package animais;

public class Vaca extends Animal {
    public Vaca(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Muuu");
    }

    @Override
    public String toString() {
        return this.nome;
    }
}