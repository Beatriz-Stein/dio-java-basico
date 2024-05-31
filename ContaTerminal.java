import java.util.Scanner;

public class ContaTerminal {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 1021;

        System.out.print("Por favor, digite o número de sua agencia :");
        String agencia = sc.next();
        System.out.print("Digite o seu nome :");
        String nomeCliente = sc.next();
        System.out.print("Digite o seu saldo ");
        Double saldo = sc.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        sc.close();
    }
}