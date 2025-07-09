package Prova;

public class MensagemWhatsAppSimulado implements IMensagem {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[WhatsApp Simulado] " + mensagem);
    }
}
