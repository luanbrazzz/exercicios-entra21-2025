package Prova;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<UsuarioBiblioteca> usuarios = new ArrayList<>();
        usuarios.add(new Aluno("Luan", 5));
        usuarios.add(new Professor("Catarina", 3));
        usuarios.add(new Visitante("Arthur", 2));

        IMensagem mensagem = new MensagemConsole();
        ICalculadoraDeMulta calculadora = new MultaProgressiva();

        Biblioteca biblioteca = new Biblioteca(mensagem, calculadora);
        biblioteca.processarMultas(usuarios);
    }
}
