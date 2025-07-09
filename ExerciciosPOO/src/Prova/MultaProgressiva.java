package Prova;

public class MultaProgressiva implements ICalculadoraDeMulta {
    @Override
    public double calcular(UsuarioBiblioteca usuario) {
        double valorBase = 0.5;
        double multa = 0;

        for (int i = 0; i < usuario.diasAtraso; i++) {
            if (i > 0 && i % 3 == 0) {
                valorBase *= 1.10;
            }
            multa += valorBase;
        }

        return multa;
    }
}

