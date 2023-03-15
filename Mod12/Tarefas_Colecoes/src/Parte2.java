import java.util.ArrayList;
import java.util.Scanner;

public class Parte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo os nomes separados por vírgula
        System.out.println("Digite os nomes e gêneros separados por vírgula. Ex. Nome-M:");
        String nomesString = scanner.nextLine();

        // Separando os nomes em um array
        String[] nomes = nomesString.split(",");

        // Criando listas para os grupos feminino e masculino
        ArrayList<String> feminino = new ArrayList<>();
        ArrayList<String> masculino = new ArrayList<>();

        // Separando os nomes por grupos feminino e masculino
        for (String nome : nomes) {
            String[] nomeEGenero = nome.split("-");
            String genero = nomeEGenero[1].toUpperCase().trim();
            String nomeSemGenero = nomeEGenero[0].trim();

            if (genero.equals("F")) {
                feminino.add(nomeSemGenero);
            } else if (genero.equals("M")) {
                masculino.add(nomeSemGenero);
            }
        }

        // Exibindo os grupos feminino e masculino
        System.out.println("\nGrupo Feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }

        System.out.println("\nGrupo Masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }
    }
}
