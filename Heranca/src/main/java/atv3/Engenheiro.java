package atv3;

public class Engenheiro extends Funcionario {
    private String crea;

    public Engenheiro() {
    }

    public Engenheiro(String nome, String email, float salario, Endereco endereco, String crea) {
        super(nome, email, salario, endereco);
        this.crea = crea;
    }

    // Getter e Setter específico
    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "Engenheiro: " + nome +
                "\nEmail: " + email +
                "\nSalário: R$ " + String.format("%.2f", salario) +
                "\nCREA: " + crea +
                "\nEndereço: " + endereco.toString();
    }
}