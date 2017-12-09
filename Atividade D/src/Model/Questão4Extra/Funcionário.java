package Model.Questão4Extra;

public class Funcionário extends PessoaFisica {

    public boolean isCPFValido() {
        boolean retorno;
        if (getCpf() == "000.000.000-00") {
            retorno = false;
        } else {
            retorno = true;
        }
        return retorno;
    }
}
