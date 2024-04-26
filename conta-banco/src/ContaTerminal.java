import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Por favor, digite o número da Agência: ");
    String agencia = scanner.nextLine();

    System.out.println("Digite o número da sua conta: ");
    int numero = scanner.nextInt();

    System.out.println("Digite seu saldo: ");
    double saldo = scanner.nextDouble();
    scanner.nextLine();

    System.out.println("Digite seu nome: ");
    final String nomeCliente = scanner.nextLine();

    System.out.println("Olá " + nomeCliente
        + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
        + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");

    scanner.close();
  }
}