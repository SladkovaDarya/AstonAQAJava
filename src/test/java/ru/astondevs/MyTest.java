package ru.astondevs;

import java.math.BigInteger;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static ru.astondevs.Factorial.factorialResult;
import static ru.astondevs.Factorial.isSuitableNumber;

public class MyTest {

    @Test(description = "Positive test")
    public void positiveNumber() {
        // Другой тестовый случай
        int param = 5;
        BigInteger expect = BigInteger.valueOf(120);
        BigInteger result = factorialResult(param);
        assertEquals(expect, result);
    }

    @Test(description = "Negative test")
    public void negativeNumber() {
        int param = -1;
        boolean expect = false;
        boolean result = isSuitableNumber(param);
        assertEquals(expect, result);
    }

    @Test(description = "Negative test")
    public void zeroNumber() {
        int param = 0;
        boolean expect = false;
        boolean result = isSuitableNumber(param);
        assertEquals(expect, result);
    }

    @Test(description = "Negative test")
    public void aboveLimitNumber() {
        int param = 100;
        boolean expect = false;
        boolean result = isSuitableNumber(param);
        assertEquals(expect, result);
    }
}