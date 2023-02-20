import java.util.Scanner;

public class CalculoMedia {

    Scanner read = new Scanner(System.in);

    public void Media() {

        System.out.println("Digite o primeiro número: ");
        double num1 = read.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = read.nextDouble();

        System.out.println("Digite o terceiro número: ");
        double num3 = read.nextDouble();

        System.out.println("Digite o quarto número: ");
        double num4 = read.nextDouble();

        double media = (num1 + num2 + num3 + num4) / 4 ;

        System.out.printf("A média dos números é: %.2f", media);
    }

}
