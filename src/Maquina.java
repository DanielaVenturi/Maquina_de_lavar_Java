public class Maquina {
          private boolean maquinaLigada;
          private Estado estado;
//        private boolean maquinaDesligada;
//        private boolean iniciarLavagem;
//        private boolean pausarlavagem;
//        private boolean retomarLavagem;
//        private boolean iniciarCentrifuga;
//        private boolean abrirTampa;
        private boolean tampaFechada;

    public Maquina(){
        this.maquinaLigada = false;
        this.tampaFechada = false;
        this.estado = Estado.DESLIGADA;
    }
    public void ligar(){
        if (estado == Estado.DESLIGADA){
            estado = Estado.LIGADA;
            System.out.println("maquina Ligada");
        }else {
            System.out.println("maquina ja esta ligada");
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




