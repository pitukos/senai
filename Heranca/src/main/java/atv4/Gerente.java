public class Gerente extends CargoDeConfianca {
    private String pascalDalacio;

    public Gerente(String pascalDalacio) {
        super(Bonificacao.GERENTE);
        this.pascalDalacio = pascalDalacio;
    }

    public String getPascalDalacio() {
        return pascalDalacio;
    }

    @Override
    public String toString() {
        return "Gerente{pascalDalacio='" + pascalDalacio + "', bonificacao=" + getBonificacao() + "}";
    }
}