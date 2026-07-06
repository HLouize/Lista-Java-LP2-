package animais;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    @Override
    public String toString() {
        return this.nome;
    }

}
