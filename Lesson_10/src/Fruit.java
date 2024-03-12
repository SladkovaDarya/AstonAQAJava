public class Fruit {
    private final double WEIGHT = 1.0f;
    private String brandOfFruit;

    public Fruit(String brandOfFruit) {
        this.brandOfFruit = brandOfFruit;
    }

    public double getWEIGHT() {
        return WEIGHT;
    }

    @Override
    public String toString() {
        return "[ " + brandOfFruit + " ] вес = " + WEIGHT;
    }
}
