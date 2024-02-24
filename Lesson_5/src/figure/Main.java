package figure;

public class Main {
    public static void main(String[] args) {
        printCircle();
        printRectangle();
        printTriangle();
    }

    public static void printCircle() {
        Figure circle = new Circle("#CD5C5C", "#ADFF2F", 7);
        System.out.println("Круг " + circle + "\nПериметр - " + circle.perimeterCalculation()
                + " см. Площадь - " + circle.areaCalculation() + " см.\n");
    }

    public static void printRectangle() {
        Figure rectangle = new Rectangle("#8B0000", "#C71585", 9.7, 4);
        System.out.println("Прямоугольник " + rectangle + "\nПериметр - " + rectangle.perimeterCalculation()
                + " см. Площадь - " + rectangle.areaCalculation() + " см.\n");
    }

    public static void printTriangle() {
        Figure triangle = new Triangle("#FF4500", "#48D1CC", 6, 5.5, 8.1);
        System.out.println("Треугольник " + triangle + "\nПериметр - " + triangle.perimeterCalculation()
                + " см. Площадь - " + triangle.areaCalculation() + " см.\n");
    }
}
