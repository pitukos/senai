package org.example.ex1;

public class Main {
    public static void main(String[] args) {

        // Instanciar a classe
       Pets p1 = new Pets("totó", 4, "Vira-lata", "Médio", "Ração");


       // Mostrando os valores
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Raça: " + p1.getRaca());
        System.out.println("porte: " + p1.getPorte());
        System.out.println("Alimentação: " + p1.getAlimentacao());

        Pets p2 = new Pets("lobo", 4, "Pastor Alemão", "Médio", "Ração");

        // Mostrando os valores
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Idade: " + p2.getIdade());
        System.out.println("Raça: " + p2.getRaca());
        System.out.println("porte: " + p2.getPorte());
        System.out.println("Alimentação: " + p2.getAlimentacao());


    }
}