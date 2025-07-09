package Prova;

public abstract class UsuarioBiblioteca {

    protected String nome;
    public String tipo;
    protected int diasAtraso;

    public UsuarioBiblioteca(String nome, int diasAtraso) {
        this.nome = nome;
        this.diasAtraso = diasAtraso;
    }

    public String getResumo(double valorMulta) {
        return nome + " - Dias de atraso: " + diasAtraso + " - Multa: R$ " + String.format("%.2f", valorMulta);
    }
}
