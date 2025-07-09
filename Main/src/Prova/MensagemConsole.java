package Prova;

public class MensagemConsole implements IMensagem {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[Console] " + mensagem);
    }
}
