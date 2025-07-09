package Prova;

import java.util.List;

public class Biblioteca {

    private IMensagem mensagem;
    private ICalculadoraDeMulta calculadora;

    public Biblioteca(IMensagem mensagem, ICalculadoraDeMulta calculadora) {
        this.mensagem = mensagem;
        this.calculadora = calculadora;
    }

    public void processarMultas(List<UsuarioBiblioteca> usuarios) {
        for (UsuarioBiblioteca usuario : usuarios) {
            double valor = calculadora.calcular(usuario);
            mensagem.enviar(usuario.nome + ", sua multa é R$ " + String.format("%.2f", valor));
            System.out.println(usuario.getResumo(valor));
        }
    }
}


