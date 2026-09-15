public class Estado {
    public static void main(String[] args) {
       Maquina maquina = new Maquina();

       maquina.ligar();
       maquina.ligar();
       maquina.desligar();
       maquina.desligar();
       maquina.lavar();
        maquina.ligar();
        maquina.lavar();
        maquina.fecharTampa();
        maquina.lavar();
        maquina.abrirTampa();
        maquina.pausarLavagem();
        maquina.retomarLavagem();
        maquina.desligar();
        maquina.concluirLavagem();
        maquina.iniciarCentrifugacao();
        maquina.pausarLavagem();
maquina.concluirCentrifigacao();
maquina.desligar();
    }
}