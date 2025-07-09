package Prova;

public class MultaFixaPorTipo implements ICalculadoraDeMulta {
    @Override
    public double calcular(UsuarioBiblioteca usuario) {
        if (usuario.tipo.equals("Aluno")) {
            return usuario.diasAtraso * 0.5;
        } else if (usuario.tipo.equals("Professor")) {
            return usuario.diasAtraso * 0.25;
        } else if (usuario.tipo.equals("Visitante")) {
            return usuario.diasAtraso * 1.0;
        } else {
            return 0;
        }

    }
}

