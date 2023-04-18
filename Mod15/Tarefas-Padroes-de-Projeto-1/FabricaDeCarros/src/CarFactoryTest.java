public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = new CorollaFactory();
        Sedan corollaSedan = factory.createSedan();
        corollaSedan.drive();
        Hatchback corollaHatchback = factory.createHatchback();
        corollaHatchback.drive();

        factory = new FiatFactory();
        Sedan fiatUnoSedan = factory.createSedan();
        fiatUnoSedan.drive();
        Hatchback fiatUnoHatchback = factory.createHatchback();
        fiatUnoHatchback.drive();

        factory = new CorsaFactory();
        Sedan corsaSedan = factory.createSedan();
        corsaSedan.drive();
        Hatchback corsaHatchback = factory.createHatchback();
        corsaHatchback.drive();
    }
}
