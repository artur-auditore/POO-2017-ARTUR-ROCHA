package Model.Capitúlo7Caleum;

public class ContaPoupança extends Conta {

    @Override
    public void atualiza(double taxa) {
        super.atualiza(taxa * 3);
    }
}
