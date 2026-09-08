import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de kWh consumidos: ");
        double kwh = scanner.nextDouble();

        double valor;

        if (kwh <= 100) {
            valor = kwh * 0.50;
        } else if (kwh <= 200) {
            valor = kwh * 0.70;
        } else {
            valor = kwh * 0.90;
        }

        System.out.printf("Valor da conta: R$ %.2f%n", valor);

    }
}
