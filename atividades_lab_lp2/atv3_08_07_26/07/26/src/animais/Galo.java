package animais;

public class Galo extends Animal {
	    public Galo(String nome) {
	        super(nome);
	    }

	    @Override
	    public void emitirSom() {
	        System.out.println("Cocoricó");
	    }

	    @Override
	    public String toString() {
	        return this.nome;
	    }
}
