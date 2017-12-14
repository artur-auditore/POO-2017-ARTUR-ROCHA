package Questao6;

public class ContaPoupança extends ContaCorrente {

    @Override
    public void atualiza(double taxa) {
        super.atualiza(taxa * 3);
    }
}
