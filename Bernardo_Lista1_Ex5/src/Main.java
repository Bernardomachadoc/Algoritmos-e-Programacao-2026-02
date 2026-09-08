import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double Altura;
        double Peso;

        System.out.println("Informe sua altura:");
        Altura = entrada.nextDouble();

        System.out.println("Informe seu peso");
        Peso = entrada.nextDouble();

        double IMC = (Peso/(Altura*Altura));
        System.out.printf("Seu imc é: %.2f%n" , IMC);

    }
}