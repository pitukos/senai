package atv2;

public class Main {
    public static void main(String[] args) {
        // Testando a classe Física
        Fisica pessoaFisica = new Fisica(
                "João Silva",
                "(11) 99999-9999",
                "123.456.789-00",
                "12.345.678-9",
                "15/05/1990"
        );

        System.out.println("=== PESSOA FÍSICA ===");
        System.out.println(pessoaFisica.toString());
        System.out.println();

        // Testando a classe Jurídica
        Juridica pessoaJuridica = new Juridica(
                "Empresa XYZ Ltda",
                "(11) 3333-3333",
                "12.345.678/0001-90",
                "123.456.789.123"
        );

        System.out.println("=== PESSOA JURÍDICA ===");
        System.out.println(pessoaJuridica.toString());
    }
}
