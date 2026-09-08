import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int numero3 = scanner.nextInt();

        int soma = numero1 + numero2 + numero3;
        double media = soma / 3.0;

        System.out.println("A soma dos três números é: " + soma);
        System.out.println("A média aritmética é: " + media);

    }
}
