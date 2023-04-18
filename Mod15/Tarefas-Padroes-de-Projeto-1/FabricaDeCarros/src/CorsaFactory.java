public class CorsaFactory implements CarFactory {
    public Sedan createSedan() {
        return new CorsaSedan();
    }

    public Hatchback createHatchback() {
        return new CorsaHatchback();
    }
}
