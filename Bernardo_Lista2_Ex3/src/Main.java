import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            int quadrado = numero * numero;

            System.out.println("O número é par.");
            System.out.println("O quadrado do número é: " + quadrado);
        } else {
            int cubo = numero * numero * numero;

            System.out.println("O número é ímpar.");
            System.out.println("O cubo do número é: " + cubo);
        }

        
    }
}
