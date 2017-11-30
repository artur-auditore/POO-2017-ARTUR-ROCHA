public class Casa {
    String cor;
    int totalDePortas;
//    Porta[] portas;
//    portas = new Porta[5];

    Porta p1 = new Porta();
    Porta p2 = new Porta();
    Porta p3 = new Porta();
    Porta p4 = new Porta();
    Porta p5 = new Porta();

    public String pinta(String s){
        this.cor = s;
        return s;
    }

    public String quantasPortasEstaoAbertas(){
        int ct = 0;

        if (this.p1.aberta){
            ct++;
        }
        if (this.p2.aberta){
            ct++;
        }
        if (this.p3.aberta){
            ct++;
        }
        if (this.p4.aberta){
            ct++;
        }
        if (this.p5.aberta){
            ct++;
        }

        return "Portas abertas: " + ct;
    }

    public void adicionaPorta(Porta p) {


    }

}


