package Questao6;

public class ContaCorrente extends Conta{

    @Override
    public double debito(double taxa) {
        return getSaldo() - (getSaldo()*taxa);
    }
}
