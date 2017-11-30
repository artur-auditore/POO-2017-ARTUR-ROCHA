package Model;

import javax.swing.JOptionPane;
public class Funcionario {
    public String nome;
    public String departamento;
    public double salario;
    public String RG;
    public String dataDeEntrada;
    //public Data dataDeEntrada;

    public double recebeAumento(double valor){
        this.salario = salario + valor;
        return salario;
    }

    public double ganhoAnual(){
        return this.salario*12;
    }

    public boolean estaNaEmpresa(){
        return true;
    }

    public void mostra(){
        JOptionPane.showMessageDialog(null,"Nome: " + this.nome + "\n" + "RG: " + this.RG + "\n" + "Departamento: " + this.departamento + "\n" +"Data de Entrada: " + this.dataDeEntrada + "\n" + "Salario: " +this.salario + "\n" + "Ganho Anual: " + this.ganhoAnual());
    }

}
