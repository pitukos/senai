package Atividade2;

public class Main {
    public static void main(String[] args) {
        Funcionário funcionario = new Funcionário("Alice", "Gerente", 5000.0);
        ContaBancaria conta = new ContaBancaria("12345-6", 1000.0, funcionario);

        System.out.println("Detalhes da Conta Bancária:");
        System.out.println(conta);

        System.out.println("\nDepositando R$ 500,00...");
        conta.depositar(500.0);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        System.out.println("\nSacando R$ 300,00...");
        if (conta.sacar(300.0)) {
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }
}
