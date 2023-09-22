import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá usuário, por favor me diga o nome do titular da conta: ");
            String nomeCliente = teclado.nextLine();
        
        System.out.println("Agora me diga a agência:");
            String agencia = teclado.nextLine();
        
        System.out.println("Pronto, agora fale o numero dela:");
            int numero = teclado.nextInt();
        
        System.out.println("Agora digite o quanto que você deseja depositar:");
            Double saldo = teclado.nextDouble(); 
    
        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero + " e seu saldo R$"+ saldo + " já está disponível para saque.");

    }
}
