package App.Questao4Extra;

import Model.Questão4Extra.Funcionário;
import Model.Questão4Extra.PessoaFisica;

public class TestaFuncionario {
    public static void main(String[] args) {

        PessoaFisica pf1 = new Funcionário();
        pf1.setCpf("000.000.000-00");
        System.out.println(pf1.isCPFValido());

    }
}
