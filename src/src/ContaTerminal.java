import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        String nome;
        String agencia;
        int contaCorrente;
        double saldoDepositado;

        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("Bem-vindo ao Seu Banco Digital!");
        System.out.println("Digite as informações solicitadas para abrir sua conta!");
        System.out.println("******************************");

        System.out.println("Digite seu nome completo:");
        nome = scanner.next();

        System.out.println("Digite o número da sua agência:");
        agencia = scanner.next();

        System.out.println("Digite o número da sua conta corrente:");
        contaCorrente = scanner.nextInt();

        System.out.println("Digite o valor que deseja depositar:");
        saldoDepositado = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar " +
                "uma conta em nosso banco, sua agência é: " + agencia +
                ", sua conta: " + contaCorrente + ", e seu saldo atualizado é de: R$"
                + saldoDepositado + ". O saldo já está disponível para saque!");

    }
}
