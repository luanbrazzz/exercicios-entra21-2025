package Ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean executando = true;

        ContaBancaria c1 = new ContaBancaria();
//        c1.titular = "Luan Braz";
//        //c1.numeroConta = "170304";
//        c1.saldo = 150.00;
//        System.out.println();
//
//        c1.mostrarSaldo();
//        c1.depositar(500.00);
//        c1.mostrarSaldo();
//        System.out.println();
//
//        c1.sacar(300.00);
//        c1.mostrarSaldo();
//        System.out.println();
//
//        c1.sacar(1000.00);
//        c1.mostrarSaldo();

        while (executando) {
            System.out.println("Bem vindo a sua conta bancaria!");
            System.out.println("1 - Criação de novas contas;");
            System.out.println("2 - Depósito de valores em uma conta;");
            System.out.println("3 - Saque de valores em uma conta;");
            System.out.println("4 - Listar saldo da conta;");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção:");

            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao){
                case 1:
                        System.out.println("Entre com seu nome: ");
                        c1.titular = scan.nextLine();

                        System.out.println("Entre com o numero da conta: ");
                        c1.numeroConta = scan.nextLine();

                        System.out.println("Entre com o saldo inicial: ");
                        c1.saldo = scan.nextDouble();

                    System.out.println();
                    System.out.println("Conta criada com sucesso!");
                    System.out.println("Titular: " + c1.titular);
                    System.out.println("Número da conta: " + c1.numeroConta);
                    System.out.println("Saldo: " + c1.saldo);
                    System.out.println();
                    break;

                case 2:
                    // escolher conta e depositar
                    break;
                case 3:
                    // escolher conta e sacar
                    break;
                case 4:
                    // mostrar saldo de uma conta
                    break;
                case 5:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");

            }
        }

    }
}
