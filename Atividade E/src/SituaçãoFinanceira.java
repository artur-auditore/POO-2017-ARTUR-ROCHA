public class SituaçãoFinanceira {
    private double valorCreditos;
    private double valorDébitos;

    SituaçãoFinanceira(double valorDébitos, double valorCreditos){
        this.valorDébitos = valorDébitos;
        this.valorCreditos = valorCreditos;
    }

    public double saldo(){
        return valorCreditos - valorDébitos;
    }
}

class TestaSituaçaoFinanceira{
    public static void main(String[] args) {
        SituaçãoFinanceira boa = new SituaçãoFinanceira(400, 600);
        System.out.println(boa.saldo());
    }
}
