package atividade3;

public class Funcionario {
    private String ID;
    private String nome;
    private String Salario;
    private Setor setor;
    private Sexo sexo;
    private String Idade;

    public Funcionario(String ID, String nome, String salario, Setor setor, Sexo sexo, String idade) {
        this.ID = ID;
        this.nome = nome;
        this.Salario = salario;
        this.setor = setor;
        this.sexo = sexo;
        this.Idade = idade;
    }
    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSalario() {
        return Salario;
    }
    public void setSalario(String salario) {
        Salario = salario;
    }
    public Setor getSetor() {
        return setor;
    }
    public void setSetor(Setor setor) {
        this.setor = setor;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    public String getIdade() {
        return Idade;
    }
    public void setIdade(String idade) {
        Idade = idade;
    }
    @Override
    public String toString() {
        return "Funcionario [ID=" + ID + ", nome=" + nome + ", Salario=" + Salario + ", setor=" + setor + ", sexo=" + sexo + ", Idade=" + Idade + "]";
    }
}
