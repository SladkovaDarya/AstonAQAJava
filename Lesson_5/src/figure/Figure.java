package figure;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Figure implements GeometricFormulas {
    public String fillColor; //цвет заливки - будем считать, что это RGB код
    public String borderColor; //цвет границ

    public Figure(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double round(double value, int places) {
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public String toString() {
        return "[ цвет заливки: " + fillColor +
                ", цвет границ: " + borderColor + " ]";
    }
}
