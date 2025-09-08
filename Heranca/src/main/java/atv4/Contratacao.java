public class Contratacao {

    public double calcularAcrescimo(CargoDeConfianca cargo) {
        if (cargo instanceof Gerente) {
            return 0.3; // 30%
        } else if (cargo instanceof Diretor) {
            return 0.4; // 40%
        }
        return 0.0;
    }

    public String getTipoAcrescimo(CargoDeConfianca cargo) {
        if (cargo instanceof Gerente) {
            return "30%";
        } else if (cargo instanceof Diretor) {
            return "40%";
        }
        return "0%";
    }
}