package Model;

import Model.*;

public class Empresas {
    public String nome;
    public String cnpj;
    public int telefone;
    public String endereco;
    public Funcionario[] empregados;

//    static int ct = 0;

    public void adiciona(Funcionario f) {

        for (int i = 0; i < empregados.length; i++) {
            if (empregados[i] == null) {
                empregados[i] = f;
            }
        }
    }

    public void consultaEmpregados(){

        for (int i=0; i < this.empregados.length; i++){
            System.out.println("Funcionario da posição: " + i);
            System.out.println("Nome: " + empregados[i].nome);
            System.out.println("Salário: " + empregados[i].salario);
            System.out.println("Departamento: " + empregados[i].departamento);
        }
    }

    public void contem(Funcionario f){

        for (int i=0; i< this.empregados.length; i++){
            if (f.nome == this.empregados[i].nome){
                return true;
            }else {
                return false;
            }
        }
    }
}