package ru.astondevs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseTest {

    @Test(description = "сложение: 2+3", priority = 1)
    public void additionTest() {
        String result = calculator.addition();
        Assert.assertEquals(result, "5");
    }

    @Test(description = "умножение: 4*5", priority = 2)
    public void multiplicationTest() {
        String result = calculator.multiplication();
        Assert.assertEquals(result, "20");
    }

    @Test(description = "вычитание: 7-1", priority = 3)
    public void subtractionTest() {
        String result = calculator.subtraction();
        Assert.assertEquals(result, "6");
    }

    @Test(description = "деление: 6/3", priority = 4)

    public void divisionTest() {
        String result = calculator.division();
        Assert.assertEquals(result, "2");
    }

    @Test(description = "деление на ноль", priority = 5)
    public void divisionByZeroTest() {
        Calculator calculator = new Calculator(driver);
        String result = calculator.divisionByZero();
        Assert.assertEquals(result, "Can't divide by 0");
    }
}
