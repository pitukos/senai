package qualquercoisaí;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias das operações
        OperacaoMatematica soma = new Soma();
        OperacaoMatematica subtracao = new Subtracao();
        OperacaoMatematica multiplicacao = new Multiplicacao();
        OperacaoMatematica divisao = new Divisao();
        
        // Valores para teste
        double a = 10.0;
        double b = 5.0;
        
        // Realizando e exibindo as operações
        System.out.println("=== Operações Matemáticas ===");
        System.out.println(a + " + " + b + " = " + soma.calcular(a, b));
        System.out.println(a + " - " + b + " = " + subtracao.calcular(a, b));
        System.out.println(a + " * " + b + " = " + multiplicacao.calcular(a, b));
        System.out.println(a + " / " + b + " = " + divisao.calcular(a, b));
        
        // Testando com outros valores
        System.out.println("\n=== Teste com outros valores ===");
        double x = 15.0;
        double y = 3.0;
        
        System.out.println(x + " + " + y + " = " + soma.calcular(x, y));
        System.out.println(x + " - " + y + " = " + subtracao.calcular(x, y));
        System.out.println(x + " * " + y + " = " + multiplicacao.calcular(x, y));
        System.out.println(x + " / " + y + " = " + divisao.calcular(x, y));
        
        // Testando tratamento de divisão por zero
        System.out.println("\n=== Teste de divisão por zero ===");
        try {
            System.out.println(a + " / 0 = " + divisao.calcular(a, 0));
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
