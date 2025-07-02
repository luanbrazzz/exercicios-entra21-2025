package Ex01;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Bem vindo a nossa loja de produtos!");

        Produto camiseta = new Produto(
                "Regata GG Tommy",
                299.00,
                10);

        System.out.println();
        camiseta.exibirDetalhes();
        camiseta.vender(5);
        camiseta.exibirDetalhes();
        camiseta.repor(7);
        camiseta.exibirDetalhes();
        System.out.println();


        Produto calca = new Produto(
                "Calça 44 Levis",
                272.93,
                7);

        calca.exibirDetalhes();
        calca.vender(5);
        calca.exibirDetalhes();
        calca.repor(10);
        calca.exibirDetalhes();

    }
}