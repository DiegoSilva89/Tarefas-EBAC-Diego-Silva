import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        // Obtendo a classe da entidade que você deseja verificar
        Class<?> classe = Cliente.class;

        // Verificando se a annotation "Tabela" está presente na classe
        if (classe.isAnnotationPresent(Tabela.class)) {
            // Obtendo a instância da annotation presente na classe
            Tabela tabelaAnnotation = classe.getAnnotation(Tabela.class);

            // Obtendo o valor do atributo "nome" da annotation
            String nomeTabela = tabelaAnnotation.nome();

            // Imprimindo o nome da tabela
            System.out.println("Nome da tabela: " + nomeTabela);
        } else {
            System.out.println("A annotation Tabela não está presente na classe.");
        }
    }
}
