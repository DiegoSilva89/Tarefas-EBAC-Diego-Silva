public class FiatFactory implements CarFactory {
    public Sedan createSedan() {
        return new FiatUnoSedan();
    }

    public Hatchback createHatchback() {
        return new FiatUnoHatchback();
    }
}
