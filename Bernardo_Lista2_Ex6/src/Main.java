import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        double precoUnitario;

        // Define o preço de acordo com o código
        if (codigo >= 1 && codigo <= 10) {
            precoUnitario = 10.00;
        } else if (codigo >= 11 && codigo <= 20) {
            precoUnitario = 15.00;
        } else if (codigo >= 21 && codigo <= 30) {
            precoUnitario = 20.00;
        } else if (codigo >= 31 && codigo <= 40) {
            precoUnitario = 30.00;
        } else {
            System.out.println("Código de produto inválido!");
            scanner.close();
            return;
        }

        // Calcula o preço total
        double precoTotal = precoUnitario * quantidade;

        // Calcula o desconto
        double percentualDesconto;

        if (precoTotal <= 250) {
            percentualDesconto = 0.05;
        } else if (precoTotal <= 500) {
            percentualDesconto = 0.10;
        } else {
            percentualDesconto = 0.15;
        }

        double valorDesconto = precoTotal * percentualDesconto;

        // Calcula o preço final
        double precoFinal = precoTotal - valorDesconto;

        // Exibe os resultados
        System.out.printf("Preço unitário: R$ %.2f%n", precoUnitario);
        System.out.printf("Preço total da nota: R$ %.2f%n", precoTotal);
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Preço final da nota: R$ %.2f%n", precoFinal);


    }
}
