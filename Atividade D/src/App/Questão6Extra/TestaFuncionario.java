package App.Questão6Extra;

import Model.Questão6Extra.Funcionario;
import Model.Questão6Extra.Gerente;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario gerente =  new Gerente();
        gerente.setSalário(1000);
        System.out.println(gerente.getBonificação());

        //Saída: 150.0 (bonificação de um gerente);
        //Trata-se de polimorfismo, pois o objeto "gerente" é tanto do tipo Gerente como funcionário.
    }
}
