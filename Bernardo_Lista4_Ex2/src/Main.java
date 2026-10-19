import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, somaSalario = 0;
        double maiorSalario = 0;
        int filhos, somaFilhos = 0;
        int pessoas = 0, ateMinimo = 0;
        int continuar;
        double minimo;

        System.out.print("Salario minimo: ");
        minimo = sc.nextDouble();

        do {
            System.out.print("Digite o salario: ");
            salario = sc.nextDouble();

            System.out.print("Numero de filhos: ");
            filhos = sc.nextInt();

            somaSalario += salario;
            somaFilhos += filhos;
            pessoas++;

            if (pessoas == 1 || salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario <= minimo) {
                ateMinimo++;
            }

            System.out.print("Continuar? 1-Sim 2-Nao: ");
            continuar = sc.nextInt();

        } while (continuar == 1);

        System.out.println("Media salarial: "
                + somaSalario / pessoas);
        System.out.println("Media de filhos: "
                + (double) somaFilhos / pessoas);
        System.out.println("Maior salario: " + maiorSalario);
        System.out.println("Percentual ate o minimo: "
                + (double) ateMinimo / pessoas * 100 + "%");
    }
}