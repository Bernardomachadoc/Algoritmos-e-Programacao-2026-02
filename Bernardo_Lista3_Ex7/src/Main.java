import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota;
        double soma = 0;
        int quantidade = 0;

        System.out.println("Digite as notas dos alunos.");
        System.out.println("Digite um valor negativo para encerrar.");

        System.out.print("Digite uma nota: ");
        nota = scanner.nextDouble();

        // Continua enquanto a nota não for negativa
        while (nota >= 0) {

            // Soma a nota ao acumulador
            soma += nota;

            // Conta a quantidade de notas
            quantidade++;

            System.out.print("Digite outra nota: ");
            nota = scanner.nextDouble();
        }

        // Verifica se foi digitada pelo menos uma nota válida
        if (quantidade > 0) {

            double media = soma / quantidade;

            System.out.println();
            System.out.println("Quantidade de notas válidas: " + quantidade);
            System.out.printf("Média das notas: %.2f%n", media);

        } else {

            System.out.println();
            System.out.println("Nenhuma nota válida foi digitada.");

        }
    }
}
