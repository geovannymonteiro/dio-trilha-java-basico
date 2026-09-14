import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Conta!");
        numeroConta = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        agencia = sc.next();

        System.out.println("Por favor, digite o nome do Cliente!");
        sc.nextLine(); // Limpar o buffer
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo da Conta!");
        saldo = sc.nextDouble();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        sc.close();
    
    }

}
