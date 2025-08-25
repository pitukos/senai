package relacionamentos;

public class Cliente {
    private String nome;
    private String idade;
    private String endereço;

    public Cliente(String nome, String idade, String endereço) {
        this.nome = nome;
        this.idade = idade;
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getidade() {
        return idade;
    }

    public void setidade(String idade) {
        this.idade = idade;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String email) {
        this.endereço = endereço;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", telefone='" + idade + '\'' +
                ", email='" + endereço + '\'' +
                '}';
    }
}
