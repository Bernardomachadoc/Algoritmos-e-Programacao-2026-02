import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.println("Digite 1 para converter para Fahrenheit");
        System.out.println("Digite 2 para converter para Kelvin");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            double fahrenheit = celsius * 1.8 + 32;
            System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        } else if (opcao == 2) {
            double kelvin = celsius + 273.15;
            System.out.println("Temperatura em Kelvin: " + kelvin + " K");
        } else {
            System.out.println("Opção inválida!");
        }

    }
}
