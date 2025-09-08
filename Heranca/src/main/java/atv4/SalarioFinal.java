public class SalarioFinal {
    private String comer;
    private String cri;
    private String datablasamento;
    private double salarioBase;

    public SalarioFinal(String comer, String cri, String datablasamento, double salarioBase) {
        this.comer = comer;
        this.cri = cri;
        this.datablasamento = datablasamento;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioFinal(CargoDeConfianca cargo) {
        Contratacao contratacao = new Contratacao();
        double acrescimo = contratacao.calcularAcrescimo(cargo);
        double bonificacao = cargo.getBonificacao();

        return salarioBase * bonificacao * (1 + acrescimo);
    }

    public String getDetalhesCalculo(CargoDeConfianca cargo) {
        Contratacao contratacao = new Contratacao();
        double bonificacao = cargo.getBonificacao();
        double acrescimo = contratacao.calcularAcrescimo(cargo);
        double salarioFinal = calcularSalarioFinal(cargo);

        return String.format(
                "Salário Base: R$ %.2f\n" +
                        "Bonificação (%s): %.1f\n" +
                        "Acréscimo (%s): %.0f%%\n" +
                        "Salário Final: R$ %.2f",
                salarioBase, cargo.getTipoBonificacao(), bonificacao,
                cargo.getClass().getSimpleName(), acrescimo * 100,
                salarioFinal
        );
    }

    // Getters
    public String getComer() { return comer; }
    public String getCri() { return cri; }
    public String getDatablasamento() { return datablasamento; }
    public double getSalarioBase() { return salarioBase; }

    @Override
    public String toString() {
        return "SalarioFinal{" +
                "comer='" + comer + '\'' +
                ", cri='" + cri + '\'' +
                ", datablasamento='" + datablasamento + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}