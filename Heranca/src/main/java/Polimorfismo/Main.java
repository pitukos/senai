package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Animal[] animais = {
            new Cachorro(),
            new Gato(),
            new Galo(),
            new Pato()
        };
        
        System.out.println("=== Sons dos Animais ===");
        for (Animal animal : animais) {
            System.out.println(animal.getClass().getSimpleName() + ": " + animal.emitirSom());
        }
        
        System.out.println("\n=== Alimentação dos Animais ===");
        for (Animal animal : animais) {
            System.out.println(animal.getClass().getSimpleName() + ": " + animal.comer());
        }
    }
}
