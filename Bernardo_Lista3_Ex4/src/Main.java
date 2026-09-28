import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Cria o Scanner para receber dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita um número inteiro
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        // Repete a mensagem N vezes
        for (int i = 1; i <= n; i++) {
            System.out.println("Praticando lógica de programação!");
        }
    }
}
