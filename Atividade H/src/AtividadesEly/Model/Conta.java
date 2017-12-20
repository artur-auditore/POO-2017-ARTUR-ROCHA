package AtividadesEly.Model;

public class Conta {
    private String nome;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
