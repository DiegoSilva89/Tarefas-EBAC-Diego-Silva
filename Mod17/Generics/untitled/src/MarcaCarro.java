import java.util.ArrayList;
import java.util.List;

// Classe que representa uma marca de carros usando generics
class MarcaCarro<T extends Carro> {
    private List<T> carros;

    public MarcaCarro() {
        carros = new ArrayList<>();
    }

    public void adicionarCarro(T carro) {
        carros.add(carro);
    }

    public List<T> getCarros() {
        return carros;
    }
}