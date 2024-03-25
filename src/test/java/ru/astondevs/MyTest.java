package ru.astondevs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static ru.astondevs.Factorial.factorialResult;
import static ru.astondevs.Factorial.isSuitableNumber;

public class MyTest {

    @Test
    public void positiveNumber() {
        // Другой тестовый случай
        int param = 5;
        BigInteger expect = BigInteger.valueOf(120);
        BigInteger result = factorialResult(param);
        Assertions.assertEquals(expect, result);
    }

    @Test
    public void negativeNumber() {
        int param = -1;
        boolean expect = false;
        boolean result = isSuitableNumber(param);
        Assertions.assertEquals(expect, result);
    }

    @Test
    public void zeroNumber() {
        int param = 0;
        boolean expect = false;
        boolean result = isSuitableNumber(param);
        Assertions.assertEquals(expect, result);
    }

    @Test
    public void aboveLimitNumber() {
        int param = 100;
        boolean expect = false;
        boolean result = isSuitableNumber(param);
        Assertions.assertEquals(expect, result);
    }
}