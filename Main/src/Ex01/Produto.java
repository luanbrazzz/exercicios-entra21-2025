package Ex01;

public class Produto {

    String nome;
    Double preço;
    Integer quantidade;

    void exibirDetalhes(){
        System.out.println(nome + " R$" + preço + " - " + quantidade + " unidades");
    }

    void vender(Integer unidades){
        System.out.println("Vendendo " + unidades + " unidades da " + nome);
        quantidade = quantidade - unidades;
    }

    void repor(Integer unidades){
        System.out.println("Repondo " + unidades + " unidades da " + nome);
        quantidade = quantidade + unidades;
    }
}
