/**
 * Created by aluno on 11/01/18.
 */
public class TestaContas {

    public static void main(String[] args) {
        Conta conta = new Conta();

        try {
            conta.setSaldo(90000);
            conta.deposita(-10000);
        } catch (IllegalArgumentException e){
            String s = "Você tentou depositar um valor negativo!";
        }
    }
}
