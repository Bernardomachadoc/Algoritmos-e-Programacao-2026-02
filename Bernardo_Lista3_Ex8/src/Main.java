import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de doações
        System.out.print("Digite a quantidade de doações recebidas: ");
        int quantidade = scanner.nextInt();

        // Variáveis para armazenar os valores
        double total = 0;
        double maior = 0;
        double menor = 0;

        // Laço para ler todas as doações
        for (int i = 1; i <= quantidade; i++) {

            System.out.print("Digite o valor da doação " + i + ": R$ ");
            double doacao = scanner.nextDouble();

            // Soma o valor ao total
            total += doacao;

            // Na primeira doação, inicializa maior e menor
            if (i == 1) {
                maior = doacao;
                menor = doacao;
            } else {

                // Verifica se a doação é maior que o maior valor atual
                if (doacao > maior) {
                    maior = doacao;
                }

                // Verifica se a doação é menor que o menor valor atual
                if (doacao < menor) {
                    menor = doacao;
                }
            }
        }

        // Exibe os resultados
        System.out.println();
        System.out.printf("Valor total arrecadado: R$ %.2f%n", total);
        System.out.printf("Maior doação: R$ %.2f%n", maior);
        System.out.printf("Menor doação: R$ %.2f%n", menor);
    }
}
