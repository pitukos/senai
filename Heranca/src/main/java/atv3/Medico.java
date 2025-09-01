package atv3;

public class Medico extends Funcionario {
    private String crm;

    public Medico() {
    }

    public Medico(String nome, String email, float salario, Endereco endereco, String crm) {
        super(nome, email, salario, endereco);
        this.crm = crm;
    }

    // Getter e Setter específico
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Médico: " + nome +
                "\nEmail: " + email +
                "\nSalário: R$ " + String.format("%.2f", salario) +
                "\nCRM: " + crm +
                "\nEndereço: " + endereco.toString();
    }
}