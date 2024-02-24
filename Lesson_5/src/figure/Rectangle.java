package figure;

public class Rectangle extends Figure {
    public double sideA;
    public double sideB;

    public Rectangle(String fillColor, String borderColor, double sideA, double sideB) {
        super(fillColor, borderColor);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double perimeterCalculation() {
        double perimeter = (sideA * 2) + (sideB * 2);
        return round(perimeter, 2);
    }

    @Override
    public double areaCalculation() {
        double area = sideA * sideB;
        return round(area, 2);
    }
}
