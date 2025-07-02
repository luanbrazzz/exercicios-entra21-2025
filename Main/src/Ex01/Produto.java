package Ex01;

public class Produto {

    private String nome;
    private Double preço;
    private Integer quantidade;

    Produto(String nome, Double preço, Integer quantidade){
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    public void exibirDetalhes(){
        System.out.println(nome + " R$" + preço + " - " + quantidade + " unidades");
    }

    public void vender(Integer unidades){
        System.out.println("Vendendo " + unidades + " unidades da " + nome);
        quantidade = quantidade - unidades;
    }

    public void repor(Integer unidades) {
        System.out.println("Repondo " + unidades + " unidades da " + nome);
        quantidade = quantidade + unidades;
    }

    public Double getPreço(){
        return preço;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }


}
