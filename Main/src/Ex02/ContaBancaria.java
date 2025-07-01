package Ex02;

public class ContaBancaria {
    String titular;
    String numeroConta;
    Double saldo;

    void mostrarSaldo(){
        System.out.println("Saldo: " + saldo);
    }

    void depositar(Double valor){
        saldo = saldo + valor;
        System.out.println("Foi depositado o valor de " + valor + " em sua conta!");
    }

    void sacar(Double valor){
        if (saldo >= 0 && saldo >= valor){
            System.out.println("Foi sacado o valor de " + valor + " da sua conta!");
            saldo = saldo - valor;
        } else {
            System.out.println("Não há saldo suficiente!");
        }
    }
}
