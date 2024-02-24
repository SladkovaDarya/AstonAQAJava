package figure;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Figure {
    public static final double PI = 3.14;
    public double radius; //я решила радиус задавать через конструктор,
    // потому что логичнее прописывать его при создании фигуры, чем передавать
    // значение в параметр методу по вычислению периметра или площади,
    // который мы вызываем у уже созданного объекта.


    public Circle(String fillColor, String borderColor, double radius) {
        super(fillColor, borderColor);
        this.radius = radius;
    }

    @Override
    public double perimeterCalculation() {
        double perimeter = 2 * PI * radius;
        return round(perimeter, 2);
    }

    @Override
    public double areaCalculation() {
        double area = PI * radius * radius;
        return round(area, 2);
    }


}
