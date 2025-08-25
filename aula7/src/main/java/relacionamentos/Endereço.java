package relacionamentos;

public class Endereço {
    private String logradouro;
    private String numero;
    private String cidade;

    public Endereço(String logradouro, String numero, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }
}

