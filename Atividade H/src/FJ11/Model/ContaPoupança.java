package FJ11.Model;

public class ContaPoupança extends ContaCorrente {

    @Override
    public void atualiza(double taxa) {
        super.atualiza(taxa * 3);
    }
}
