//Questão 1, capítulo 4
class Funcionario {

	String nome;
	String departamento;
	double salario;
	String dataDeEntrada;
	String RG;
	double ganhoAnual;
	double novoSalario;
	public String calculaGanhoAnual;
	
	void recebeAumento(double valor) {
		novoSalario = this.salario + valor;
		this.salario = novoSalario;
	}
	
	void calculaGanhoAnual() {
		double ganhoAnual;
		this.ganhoAnual = this.salario *12;
		
	}
	
	void mostra() {
		
		System.out.println("Nome: " + this.nome);
		System.out.println("RG: " + this.RG);
		System.out.println("Data de entrada: " + this.dataDeEntrada);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario Atual: " + this.salario);
		System.out.println("Ganho Anual: " + this.ganhoAnual);
		
		System.out.println("Salário Com Aumento: " + this.novoSalario);
	}
	
}	

class TesteMetodos{
	public static void main(String[] args) {
		
		//novo funcionario
		Funcionario novoFuncionario;
		novoFuncionario = new Funcionario();
		
		
		//altera valores do novo funcionario
		novoFuncionario.nome = "Rogério Silva";
		novoFuncionario.salario = 9000;
		novoFuncionario.departamento = "Docente";
		novoFuncionario.RG = "2.985.111";
		novoFuncionario.dataDeEntrada = "19/08/2000";
		
		//ganho anual
		novoFuncionario.calculaGanhoAnual();
		novoFuncionario.mostra();
		
		//recebe aumento
		novoFuncionario.recebeAumento(1500);
		
		//ganho anual, com aumento
		novoFuncionario.calculaGanhoAnual();
	}
}