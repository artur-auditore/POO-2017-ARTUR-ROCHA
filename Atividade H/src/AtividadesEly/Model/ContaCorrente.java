package AtividadesEly.Model;

public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public double calculaTributo() {
        return getSaldo() * 0.10;
    }

}
