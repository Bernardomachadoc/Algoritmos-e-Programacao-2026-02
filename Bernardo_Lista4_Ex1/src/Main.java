import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro :");
        int numero = scanner.nextInt();

        int longfatorial = 1;

        for (int i = 1; i <= numero; i++) {
            longfatorial = longfatorial * i;

        }
        System.out.println("O fatorial de " + numero + " é: " + longfatorial);
    }
}