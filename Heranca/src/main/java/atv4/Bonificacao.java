public enum Bonificacao {
    GERENTE(1.3),
    DIRETOR(1.4);

    private final double valor;

    Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}