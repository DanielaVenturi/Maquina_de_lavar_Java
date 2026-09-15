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
        if(estado == Estado.CENTRIFUGANDO || estado == Estado.LAVANDO) {
            System.out.println("Não é possivel desligar enquanto a maquina estiver lavando ou centrifugando");}
        else if ( estado == Estado.LIGADA || estado == Estado.CENTRIFUGACAOCONCLUIDA){
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


     public void pausarLavagem(){
        if(estado == Estado.DESLIGADA){
            System.out.println("Nao é possivel pausar uma maquina desligada");
            return;
        }
            else if (estado == Estado.CENTRIFUGANDO){
                System.out.println("Nao da para pausar enquanto a maquina estiver centrifugando");
                return;
            }else if(estado == Estado.PAUSADA){
                System.out.println("a maquina ja esta pausada");
            }else{
                estado = Estado.PAUSADA;
                System.out.println("A maquina foi pausada");
            }
    }

    public void retomarLavagem(){
        if(estado == Estado.DESLIGADA){
            System.out.println("Uma máquina desligada não pode ser pausada.");
        }else if (estado == Estado.PAUSADA){
            estado = Estado.LAVANDO;
            System.out.println("Retomando a lavagem");
        }else{
            System.out.println("a maquina nao esta pausada");
        }
    }

    public void concluirLavagem(){
        if(estado == Estado.LAVANDO){
            estado = Estado.LAVAGEMCONCLUIDA;
            System.out.println("O ciclo foi finalizado");
        }
    }

    public void iniciarCentrifugacao(){
        if (estado == Estado.DESLIGADA){
            System.out.println("Não é possivel centrifugar com a maquina desligada");
            return;
        }
        else if (!tampaFechada){
            System.out.println("A maquina nao pode ligar com a tampa aberta");
            return;}
        else if( estado == Estado.LAVAGEMCONCLUIDA){
        estado = Estado.CENTRIFUGANDO;
            System.out.println("maquina esta centrifugando");
    }else{
            System.out.println("A centrifugação só ira iniciar quando a lavagem estiver finalizada");
        }
    }

    public void concluirCentrifigacao(){
        if (estado == Estado.CENTRIFUGANDO){
            estado = Estado.CENTRIFUGACAOCONCLUIDA;
            System.out.println("A centrifugação foi concluida");
        }
    }


    public enum Estado {
        DESLIGADA,
        LIGADA,
        LAVANDO,
        PAUSADA,
        CENTRIFUGANDO,
        LAVAGEMCONCLUIDA,
        CENTRIFUGACAOCONCLUIDA
    }


}





