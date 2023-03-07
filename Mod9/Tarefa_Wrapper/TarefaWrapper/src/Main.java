public class Main {
    public static void main(String[] args) {

        // Declara uma variável primitiva do tipo inteiro
        int minhaVariavel = 10;

        // Converte a variável primitiva para o tipo wrapper Integer
        Integer minhaVariavelWrapper = Integer.valueOf(minhaVariavel);

        // Imprime as duas variáveis na tela
        System.out.println("Variável primitiva: " + minhaVariavel);
        System.out.println("Variável wrapper: " + minhaVariavelWrapper);
    }
}