
public class Porta {
    boolean aberta = false;

    public void abre(){
        if (this.aberta == true){
            System.out.println("Porta aberta.");
        }
    }

    public void fecha(){
        if (this.aberta == false){
            System.out.println("Porta fechada.");
        }
    }
}
