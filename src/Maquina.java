public class Maquina {
          private boolean maquinaLigada;
          private boolean maquinaDesligada;
          private Estado estado;
          private boolean iniciarLavagem;
          private boolean tampaFechada;

    public Maquina(){
        this.tampaFechada = false;
        this.estado = Estado.DESLIGADA;
    }
    public void ligar(){
        if (estado == Estado.DESLIGADA){
            estado = Estado.LIGADA;
            System.out.println("maquina foi Ligada");
        }else {
            System.out.println("maquina ja esta ligada");
        }
    }
    public void desligar(){
        if ( estado == Estado.LIGADA){
            estado = Estado.DESLIGADA;
            System.out.println("Maquina foi Desligada");
        }else{
            System.out.println("maquina ja esta desligada");
        }
    }
    public void lavar(){
        if (estado == Estado.DESLIGADA){
            System.out.println("Não é possivel lavar com a maquina desligada");
        }
        else if (!tampaFechada){
            System.out.println("A maquina nao pode ligar com a tampa aberta");
            return;
        } else if (estado == Estado.LAVANDO) {
            System.out.println("A maquina ja esta lavando");
        }else{
            estado = Estado.LAVANDO;
            System.out.println("A maquina comecou a lavar");
        }


    }

    public enum Estado {
        DESLIGADA,
        LIGADA,
        LAVANDO,
        PAUSADA,
        CENTRIFUGANDO,
        FINALIZADA
    }



}




