package org.example;

public class Main {
    public static void main(String[] args) {
        //Instanciar a classe.
        Cliente c1 = new Cliente();
        Produto p1 = new Produto();

        // Atribuindo valores.
        // c1.nome = "pitukos";
        // c1.idade = 25;


        c1.setNome("pitukos");
        c1.setIdade(25);

        // Exbindo dados.
        System.out.println("Nome:" + c1.getNome());
        System.out.println("idade" + c1.getIdade());

    }
}