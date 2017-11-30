package App;

import Model.Funcionario;
import javax.swing.*;

public class Aplicação {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();

        f1.nome = "Artur Rocha";
        f1.departamento = "Administrativo";
        f1.salario = 1200;
        f1.RG = "3.665.557";
        f1.dataDeEntrada = "01/04/2015";
        f1.recebeAumento(250);

        f1.mostra();

        Funcionario f2 = new Funcionario();

        f2.nome = "Lazaro Santos";
        f2.departamento = "Recursos Humanos";
        f2.salario = 1200;
        f2.RG = "1.234.567";
        f2.dataDeEntrada = "01/08/2017";
        f2.ganhoAnual();

        f2.mostra();

        if (f1 == f2){
            JOptionPane.showMessageDialog(null, "São Funcionários Iguais");
        } else{
            JOptionPane.showMessageDialog(null, "São Funcionários Diferentes");
        }
    }
}