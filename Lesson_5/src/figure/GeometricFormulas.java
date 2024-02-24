package figure;

public interface GeometricFormulas {
    double sideA = 0;
    double sideB = 0;

    //По условию просят дефолтные методы - возьмем формулы расчета прямоугольника
    default double perimeterCalculation() {
        double perimeter = (sideA * 2) + (sideB * 2);
        return round(perimeter, 2);
    }

    default double areaCalculation() {
        double area = sideA * sideB;
        return round(area, 2);
    }

    // доп метод, чтобы округлять значения
    double round(double value, int places);
}
