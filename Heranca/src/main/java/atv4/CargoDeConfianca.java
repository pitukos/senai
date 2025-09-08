public abstract class CargoDeConfianca {
    protected Bonificacao bonificacao;

    public CargoDeConfianca(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    public double getBonificacao() {
        return bonificacao.getValor();
    }

    public Bonificacao getTipoBonificacao() {
        return bonificacao;
    }
}