import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista para carros esportivos
        MarcaCarro<CarroEsportivo> marcaEsportiva = new MarcaCarro<>();
        marcaEsportiva.adicionarCarro(new CarroEsportivo("Ferrari", "458 Italia"));
        marcaEsportiva.adicionarCarro(new CarroEsportivo("Lamborghini", "Aventador"));

        // Criando uma lista para carros SUV
        MarcaCarro<CarroSUV> marcaSUV = new MarcaCarro<>();
        marcaSUV.adicionarCarro(new CarroSUV("Jeep", "Compass"));
        marcaSUV.adicionarCarro(new CarroSUV("Toyota", "RAV4"));

        // Exibindo os carros da marca esportiva
        System.out.println("Carros da marca esportiva:");
        for (CarroEsportivo carro : marcaEsportiva.getCarros()) {
            System.out.println(carro);
        }

        // Exibindo os carros da marca SUV
        System.out.println("\nCarros da marca SUV:");
        for (CarroSUV carro : marcaSUV.getCarros()) {
            System.out.println(carro);
        }
    }
}
