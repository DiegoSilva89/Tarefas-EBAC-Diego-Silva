public class CorollaFactory implements CarFactory {
    public Sedan createSedan() {
        return new CorollaSedan();
    }

    public Hatchback createHatchback() {
        return new CorollaHatchback();
    }
}