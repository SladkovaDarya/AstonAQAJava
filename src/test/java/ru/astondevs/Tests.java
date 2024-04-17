package ru.astondevs;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseTest {

    @Test(priority = 1)
    @Description("сложение: 2+3")
    @Feature("Калькулятор")
    @Story("Сложение")
    public void additionTest() {
        String result = calculator.addition();
        Assert.assertEquals(result, "5");
    }

    @Test(priority = 2)
    @Description("умножение: 4*5")
    @Feature("Калькулятор")
    @Story("Умножение")
    public void multiplicationTest() {
        String result = calculator.multiplication();
        Assert.assertEquals(result, "20");
    }

    @Test(priority = 3)
    @Description("вычитание: 7-1")
    @Feature("Калькулятор")
    @Story("Вычитание")
    public void subtractionTest() {
        String result = calculator.subtraction();
        Assert.assertEquals(result, "6");
    }

    @Test(priority = 4)
    @Description("деление: 6/3")
    @Feature("Калькулятор")
    @Story("Деление")
    public void divisionTest() {
        String result = calculator.division();
        Assert.assertEquals(result, "2");
    }

    @Test(priority = 5)
    @Description("деление на ноль")
    @Feature("Калькулятор")
    @Story("Деление")
    public void divisionByZeroTest() {
        Calculator calculator = new Calculator(driver);
        String result = calculator.divisionByZero();
        Assert.assertEquals(result, "Can't divide by 0");
    }
}
