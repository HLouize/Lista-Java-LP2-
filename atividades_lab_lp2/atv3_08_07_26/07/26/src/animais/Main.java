package animais;

public class Main {
    public static void main(String[] args) {
    
    	Animal[] animais = new Animal[4];

        animais[0] = new Cachorro("Rex"); 
        animais[1] = new Gato("Mingal");
        animais[2] = new Vaca("Salomé");
        animais[3] = new Galo("Carijó");

        
        for (Animal animal : animais) {
            animal.emitirSom();
            animal.dormir();
        }
    }
}