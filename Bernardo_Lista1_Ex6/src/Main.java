import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario;
        System.out.println("Digite seu Salario:");
        salario = entrada.nextDouble();

        double aumento =0.07;


        double aumento_salarario = salario + aumento;
        System.out.println("o aumento foi R$:" + aumento_salarario);

        double novo_salario = aumento_salarario + salario;
        System.out.println("O novo salario é:" + novo_salario );



    }
}