package atv3;

public class Main {
    public static void main(String[] args) {
        // Criando endereços
        Endereco enderecoEngenheiro = new Endereco(
                "Rua das Construções",
                "123",
                "Sala 45",
                "01234-567",
                "São Paulo"
        );

        Endereco enderecoMedico = new Endereco(
                "Avenida da Saúde",
                "456",
                "Conjunto 78",
                "98765-432",
                "Rio de Janeiro"
        );

        // Criando um engenheiro
        Engenheiro engenheiro = new Engenheiro(
                "Carlos Silva",
                "carlos.silva@empresa.com",
                8500.00f,
                enderecoEngenheiro,
                "123456-SP"
        );

        // Criando um médico
        Medico medico = new Medico(
                "Dra. Ana Santos",
                "ana.santos@hospital.com",
                12500.00f,
                enderecoMedico,
                "CRM/SP 78901"
        );

        // Exibindo os dados
        System.out.println("=== DADOS DO ENGENHEIRO ===");
        System.out.println(engenheiro.toString());

        System.out.println("\n=== DADOS DO MÉDICO ===");
        System.out.println(medico.toString());

        // Demonstração de polimorfismo
        System.out.println("\n=== LISTA DE FUNCIONÁRIOS (POLIMORFISMO) ===");
        Funcionario[] funcionarios = {engenheiro, medico};

        for (Funcionario func : funcionarios) {
            System.out.println("-----------------------------");
            System.out.println(func.toString());
        }
    }
}