public class Maquina {
          private Estado estado;
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

    public void abrirTampa() {
        if(estado == Estado.CENTRIFUGANDO || estado == Estado.LAVANDO) {
            System.out.println("Não é possivel abrir a tampa enquando ela estiver centrifugando ou lavando");
        }else{
            tampaFechada = true;
            System.out.println(" A tampa foi aberta");
        }
    }

    public void fecharTampa(){
        if (!tampaFechada){
            tampaFechada = true;
            System.out.println("A tampa foi fechada");
        }else{
            System.out.println("Atampa ja esta fechada");
        }
    }


// public void pausar{
//        if (estado == Estado.CENTRIFUGANDO){
//            System.out.println("Nao da para parar enquanto a maquina estiver centrifugando");
//        }

    public enum Estado {
        DESLIGADA,
        LIGADA,
        LAVANDO,
        PAUSADA,
        CENTRIFUGANDO,
        FINALIZADA
    }


}





