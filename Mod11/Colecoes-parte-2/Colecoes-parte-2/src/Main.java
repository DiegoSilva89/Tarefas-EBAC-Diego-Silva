import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ArrayList para Homens e mulheres
        ArrayList<String> homens = new ArrayList<>();
        ArrayList<String> mulheres = new ArrayList<>();

        //while para verificar o nome e sexo das pessoas, ou para dar fim ao programa
        while (true) {
            System.out.print("Digite o nome da pessoa (ou 'fim' para sair): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            //verificar o sexo da pessoa para posteriormente incluir cada um em seu ArrayList
            System.out.print("Digite o sexo da pessoa (M ou F): ");
            char sexo = scanner.nextLine().toUpperCase().charAt(0);

            if (sexo == 'M') {
                homens.add(nome);
            } else if (sexo == 'F') {
                mulheres.add(nome);
            } else {
                System.out.println("Sexo inválido! Tente novamente.");
            }
        }

        /*Imprimindo as listas com for-each "for (tipo elemento : colecao)", utilizado para percorrer, atribuir o
        elemento a uma variável e imprimir o resultado na tela */
        System.out.println("\nLista de homens:");
        for (String homem : homens) {
            System.out.println(homem);
        }

        System.out.println("\nLista de mulheres:");
        for (String mulher : mulheres) {
            System.out.println(mulher);
        }
    }

}