import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = 42;
        int[] palpites = new int[100];
        int tentativa = 0;
        int numero;

        do {
            System.out.print("Digite seu palpite: ");
            numero = sc.nextInt();

            if (numero != numeroSecreto) {
                palpites[tentativa] = numero;
                tentativa++;

                if (numero < numeroSecreto) {
                    System.out.println("O numero secreto e maior.");
                } else {
                    System.out.println("O numero secreto e menor.");
                }
            }

        } while (numero != numeroSecreto);

        System.out.println("Parabens! Voce acertou!");
        System.out.println("Tentativas: " + (tentativa + 1));
        System.out.println("Palpites errados:");

        for (int i = 0; i < tentativa; i++) {
            System.out.println(palpites[i]);
        }
    }
}
