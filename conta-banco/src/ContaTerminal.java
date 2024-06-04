import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor,  digite o numero da conta:" );
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o numero da agência:");
        String nuemroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá," + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + nuemroAgencia + ", conta " + numeroConta + " e seu saldo $ " + saldo + " já está disponível para saque.");

        

        scanner.close();

        
    }
}
