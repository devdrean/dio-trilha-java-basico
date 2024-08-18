import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o numero da sua Conta");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o numero da sua Agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o numero da seu Nome");
        String nomecliente = scanner.next();

        System.out.println("Por favor, digite o numero da seu saldo");
        double saldo = scanner.nextDouble();       
        

        
        System.out.println("Ola " + nomecliente + " obrigado por criar uma conta emm nosso banco, sua agência é " + agencia + " conta "
         + numero + " seu saldo " + saldo + " ja esta disponível para saque");

     
    }
}
