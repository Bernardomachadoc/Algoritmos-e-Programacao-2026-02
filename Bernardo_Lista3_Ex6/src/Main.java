import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Senha pré-definida como String
        String senhaCorreta = "2026";

        String senhaDigitada;

        int tentativas = 0;

        System.out.print("Digite a senha de 4 dígitos: ");
        senhaDigitada = scanner.nextLine();

        while (!senhaDigitada.equals(senhaCorreta)) {

            System.out.println("Senha Incorreta! Tente novamente");

            tentativas++;

            System.out.print("Digite a senha de 4 dígitos: ");
            senhaDigitada = scanner.nextLine();
        }

        tentativas++;

        System.out.println("Acesso Autorizado!");
        System.out.println("Total de tentativas: " + tentativas);
    }
}
