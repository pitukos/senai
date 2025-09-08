public class SistemaSalarios {
    public static void main(String[] args) {
        // Criando funcionários
        Gerente gerente = new Gerente("Pascal Dalácio");
        Diretor diretor = new Diretor();

        // Criando cálculo de salário
        SalarioFinal salarioFinal = new SalarioFinal("Empresa XYZ", "CRI123", "08/09/2025", 5000.0);

        // Exibindo informações
        System.out.println("=== FUNCIONÁRIOS ===");
        System.out.println(gerente);
        System.out.println(diretor);
        System.out.println();

        System.out.println("=== INFORMAÇÕES DO SALÁRIO ===");
        System.out.println(salarioFinal);
        System.out.println();

        // Calculando e exibindo salários finais
        System.out.println("=== CÁLCULOS DE SALÁRIO ===");
        System.out.println("GERENTE:");
        System.out.println(salarioFinal.getDetalhesCalculo(gerente));
        System.out.println();

        System.out.println("DIRETOR:");
        System.out.println(salarioFinal.getDetalhesCalculo(diretor));
    }
}