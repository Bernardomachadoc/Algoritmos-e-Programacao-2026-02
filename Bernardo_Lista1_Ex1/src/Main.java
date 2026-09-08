import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double numero = scanner.nextDouble();

        double dobro = numero * 2;

        System.out.println("O dobro é: " + dobro);

    }
}
