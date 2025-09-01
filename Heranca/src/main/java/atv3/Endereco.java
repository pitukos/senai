package atv3;

public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;

    public Endereco() {
    }

    public Endereco(String logradouro, String numero, String complemento, String cep, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
    }

    // Getters e Setters
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return logradouro + ", " + numero +
                (complemento != null && !complemento.isEmpty() ? " - " + complemento : "") +
                " - CEP: " + cep + " - " + cidade;
    }
}