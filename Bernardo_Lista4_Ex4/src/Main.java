import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vendas = new double[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Vendas do dia "
                    + (i + 1) + ": ");
            vendas[i] = sc.nextDouble();
            total += vendas[i];
        }

        double media = total / 5;

        System.out.println("Total de vendas: R$ " + total);
        System.out.println("Media diaria: R$ " + media);

        for (int i = 0; i < 5; i++) {
            if (vendas[i] < media) {
                System.out.println("Dia " + (i + 1)
                        + " ficou abaixo da media.");
            }
        }
    }
}
