package App;

import Model.Empresas;
import Model.Funcionario;

public class TestaEmpresa {
    public static void main(String[] args) {
        Empresas empresa = new Empresas();
        empresa.nome = "S.O.S Construções";
        empresa.cnpj = "109.230.0001/23";
        empresa.endereco = "Rua dos Bois Nº 262";

        empresa.empregados = new Funcionario[2];

        Funcionario f1 = new Funcionario();
        empresa.adiciona(f1);
        f1.salario = 2000;
        f1.nome = "Rogerio de Sousa";
        f1.departamento = "Construção";

        Funcionario f2 = new Funcionario();
        empresa.adiciona(f2);
        f2.salario = 2100;
        f2.nome = "Francisco do Bofim";
        f2.departamento = "Construção";

        empresa.consultaEmpregados();


   //     for (int i=0; i<5; i++){
   //         Funcionario f = new Funcionario();
   //         f.salario = 1000 + i * 100;
   //         empresa.adiciona(f);
   //     }

    }
}