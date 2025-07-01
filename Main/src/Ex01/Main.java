package Ex01;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Bem vindo a nossa loja de produtos!");

        Produto camiseta = new Produto();

        camiseta.nome = "Regata GG Tommy";
        camiseta.preço = 299.00;
        camiseta.quantidade = 10;
        System.out.println();
        camiseta.exibirDetalhes();
        camiseta.vender(5);
        camiseta.exibirDetalhes();
        camiseta.repor(7);
        camiseta.exibirDetalhes();
        System.out.println();

        Produto calca = new Produto();
        calca.nome = "Calça 44 Levis";
        calca.preço = 272.93;
        calca.quantidade = 7;
        calca.exibirDetalhes();
        calca.vender(5);
        calca.exibirDetalhes();
        calca.repor(10);
        calca.exibirDetalhes();

    }
}