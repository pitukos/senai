package atividade3;

public class Main {
    public static void main(String[] args) {
        Setor setorFuncionario = Setor.FINANCEIRO;
        Sexo sexoFuncionario = Sexo.MASCULINO;

        System.out.println("Setor do funcionário: " + setorFuncionario);
        System.out.println("Sexo do funcionário: " + sexoFuncionario);

        // Simulando a mudança de setor do funcionário
        setorFuncionario = Setor.RH;
        System.out.println("Setor do funcionário: " + setorFuncionario);

        setorFuncionario = Setor.VENDAS;
        System.out.println("Setor do funcionário: " + setorFuncionario);

        setorFuncionario = Setor.MARKETING;
        System.out.println("Setor do funcionário: " + setorFuncionario);
    }
}
