package App;

import Model.Funcionário;
import Model.Pessoa;
import Model.Professor;

public class TestaTudo {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Artur ");
        p1.setSobrenome("Rocha");
        System.out.println("Pessoa: " + p1.getNomeCompleto());

        Funcionário f1 = new Funcionário();
        f1.setNome("Raimundo ");
        f1.setSobrenome("Soares");
        System.out.println("Funcionário: " + f1.getNomeCompleto());
        f1.setSalário(1590);
        System.out.println("1ª Parcela: " + f1.setSalarioPrimeiraParcela());
        System.out.println("2ª Parcela: " + f1.setSalarioSegundaParcela());

        Professor professor = new Professor();
        professor.setNome("Claúdio ");
        professor.setSobrenome("Marques");
        System.out.println("Professor: " + f1.getNomeCompleto());
        professor.setSalário(3660);
        System.out.println("Salário: " + professor.setSalarioPrimeiraParcela());
    }
}
