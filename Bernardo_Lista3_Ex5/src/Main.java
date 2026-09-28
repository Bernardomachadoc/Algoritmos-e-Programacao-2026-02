import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Cria o Scanner para receber dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita um número ao usuário
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Exibe a tabuada de 1 até 10
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;

            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
