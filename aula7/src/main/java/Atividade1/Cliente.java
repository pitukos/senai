package Atividade1;

public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;
    private Pet pet;

    public Cliente(String nome, String endereco, String telefone, Pet pet) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.pet = pet;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public Pet getPet() {
        return pet;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", pet=" + pet +
                '}';
    }
}
