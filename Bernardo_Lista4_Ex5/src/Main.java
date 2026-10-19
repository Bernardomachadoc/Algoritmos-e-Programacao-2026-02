import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] pesos = new double[6];
        int contador = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Peso da caixa "
                    + (i + 1) + ": ");
            pesos[i] = sc.nextDouble();
        }

        System.out.print("Peso para pesquisar: ");
        double pesquisa = sc.nextDouble();

        for (int i = 0; i < 6; i++) {
            if (pesos[i] == pesquisa) {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("Encontrado "
                    + contador + " vez(es).");
        } else {
            System.out.println(
                    "Valor nao localizado na amostragem");
        }
    }
}