import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // 1. Criar a ferramenta Scanner para ler os dados do terminal
        Scanner scanner = new Scanner(System.in);

        // 2. Pedir e ler as informações do usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Agora, digite o número da Conta:");
        int numero = scanner.nextInt();

        scanner.nextLine(); // Consumindo a quebra de linha que ficou do nextInt

        System.out.println("Por favor, digite o seu Nome Completo:");
        String nomeCliente = scanner.nextLine();// aprendi que nexLine lê a linha inteira, incluindo espaços

        System.out.println("Digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // 3. Exibir a mensagem final com os dados concatenados
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o scanner para liberar recursos
        scanner.close();
    }
}