package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        gato gato = new gato();

        System.out.println(cachorro.emitirsom());
        System.out.println(gato.emitirsom());
    }
}
