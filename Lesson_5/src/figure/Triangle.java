package figure;

public class Triangle extends Figure {
    public double sideA;
    public double sideB;
    public double sideC;

    public Triangle(String fillColor, String borderColor, double sideA, double sideB, double sideC) {
        super(fillColor, borderColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double perimeterCalculation() {
        double perimeter = sideA + sideB + sideC;
        return round(perimeter, 2);
    }

    //Будем считать, что у нас прямоугольный треугольник
    @Override
    public double areaCalculation() {
        double area = (sideA * sideB) / 2;
        return round(area, 2);
    }
}
