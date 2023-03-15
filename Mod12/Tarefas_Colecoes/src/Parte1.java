import java.util.Arrays;
import java.util.Scanner;

public class Parte1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Lendo os nomes separados por vírgula
        System.out.println("Digite os nomes separados por vírgula:");
        String nomesString = scanner.nextLine();

        //Separando os nomes em um array
        String[] nomes = nomesString.split(",");

        //Ordenando os nomes em ordem alfabética
        Arrays.sort(nomes);

        // Exibindo os nomes ordenados
        System.out.println("\nNomes ordenados em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }
    }
}