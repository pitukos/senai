public class Diretor extends CargoDeConfianca {

    public Diretor() {
        super(Bonificacao.DIRETOR);
    }

    @Override
    public String toString() {
        return "Diretor{bonificacao=" + getBonificacao() + "}";
    }
}