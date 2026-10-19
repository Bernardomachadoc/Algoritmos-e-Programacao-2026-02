import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] temperatura = new double[5];
        double soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a temperatura do dia "
                    + (i + 1) + ": ");
            temperatura[i] = sc.nextDouble();
            soma += temperatura[i];
        }

        double media = soma / 5;

        System.out.println("Media: " + media);

        for (int i = 0; i < 5; i++) {
            if (temperatura[i] > media) {
                System.out.println("Dia " + (i + 1)
                        + " ficou acima da media.");
            }
        }
    }
}