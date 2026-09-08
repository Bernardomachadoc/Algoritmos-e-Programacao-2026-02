import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua renda mensal: R$ ");
        double renda = scanner.nextDouble();

        System.out.print("Digite o valor da prestação mensal: R$ ");
        double prestacao = scanner.nextDouble();

        // Verifica se a prestação ultrapassa 30% da renda
        if (prestacao > renda * 0.30) {
            System.out.println("Financiamento negado por alta prestação");
        }
        // Se a prestação for maior que R$ 3.000, verifica a renda mínima
        else if (prestacao > 3000 && renda < 10000) {
            System.out.println("Financiamento negado por baixa renda");
        }
        else {
            System.out.println("Financiamento aprovado");
        }


    }
}
