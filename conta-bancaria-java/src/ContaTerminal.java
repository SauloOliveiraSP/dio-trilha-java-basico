import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário 
        //Obter pela scanner os valores digitados no terminal
        System.out.print("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String numeroAgenciaString = scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeClienteConta = scanner.nextLine();

        System.out.print("Por favor, digite o Saldo: ");
        double saldoConta = scanner.nextDouble();
        scanner.nextLine();

        //Exibir a mensagem conta criada
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.", nomeClienteConta, numeroAgenciaString, numeroConta, saldoConta);
        System.out.println(mensagem);


    }
}
