import java.util.Scanner;

public class Calculad ora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;
        double num1, num2, resultado;
        boolean continuar = true;

        while (continuar) {
            // Exibe o menu de opções
            System.out.println("===== CALCULADORA JAVA =====");
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            // Verifica a opção escolhida
            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            // Solicita os dois números
            System.out.print("Digite o primeiro número: ");
            num1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            num2 = scanner.nextDouble();

            // Realiza a operação escolhida
            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Erro! Divisão por zero.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            // Pergunta se o usuário deseja realizar outra operação
            System.out.print("Deseja realizar outra operação? (s/n): ");
            char resposta = scanner.next().charAt(0);
            if (resposta != 's' && resposta != 'S') {
                continuar = false;
                System.out.println("Saindo...");
            }
        }

        scanner.close();
    }
}
