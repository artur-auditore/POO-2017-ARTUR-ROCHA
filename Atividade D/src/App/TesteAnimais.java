package App;

import Model.Animal;
import Model.Bovino;
import Model.Peixe;

public class TesteAnimais {
    public static void main(String[] args) {

        /*A classe Animal não herda da classe Bovino.
        Solução:*/

        Bovino vaca = new Bovino();
        Bovino touro = new Bovino();
        Bovino bode = new Bovino();
        vaca.setProduçãoDeLeite(5);

        /*Classes não compatíveis
        Solução:*/

        Peixe peixe = new Peixe();

        Animal[] animais = new Animal[7];
        Animal gato = new Animal();
        animais[0] = gato;
        Animal rato = new Animal();
        animais[1] = rato;
        animais[2] = vaca;
        animais[3] = touro;
        animais[4] = bode;
        animais[5] = peixe;
        Peixe baiacu = new Peixe();
        animais[6] = baiacu;

        //A classe Animal aceita seus descendentes por que as duas classes peixe e animal herdam de Animal.

        for (int i=0; i<animais.length; i++){
            if (animais[i] instanceof Animal){
                System.out.println("Animal");
            }
            if (animais[i] instanceof Bovino){
                System.out.println("Bovino");
            }
            if (animais[i] instanceof Peixe){
                System.out.println("Peixe");
            }
        }
    }
}
