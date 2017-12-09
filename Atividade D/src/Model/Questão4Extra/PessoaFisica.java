package Model.Questão4Extra;

public class PessoaFisica {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

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
