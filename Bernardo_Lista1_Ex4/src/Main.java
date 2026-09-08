import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor;

        System.out.print("Me diga o valor do produto:RS");
        valor= entrada.nextDouble();

        double desconto =valor *0.90;
        double Valor_Final = valor - desconto;

        System.out.printf("O valor com desconto de 10%% é igual a:RS %.2f" , Valor_Final);

    }
}