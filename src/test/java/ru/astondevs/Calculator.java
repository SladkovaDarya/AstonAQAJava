package ru.astondevs;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class Calculator {
    private AppiumDriver<AndroidElement> driver;
    private By zeroButton = By.xpath("//android.widget.ImageButton[@content-desc='0']");
    private By oneButton = By.xpath("//android.widget.ImageButton[@content-desc='1']");
    private By twoButton = By.xpath("//android.widget.ImageButton[@content-desc='2']");
    private By threeButton = By.xpath("//android.widget.ImageButton[@content-desc='3']");
    private By fourButton = By.xpath("//android.widget.ImageButton[@content-desc='4']");
    private By fiveButton = By.xpath("//android.widget.ImageButton[@content-desc='5']");
    private By sixButton = By.xpath("//android.widget.ImageButton[@content-desc='6']");
    private By sevenButton = By.xpath("//android.widget.ImageButton[@content-desc='7']");
    private By eightButton = By.xpath("//android.widget.ImageButton[@content-desc='8']");
    private By plusButton = By.xpath("//android.widget.ImageButton[@content-desc='plus']");
    private By multiplyButton = By.xpath("//android.widget.ImageButton[@content-desc='multiply']");
    private By minusButton = By.xpath("//android.widget.ImageButton[@content-desc='minus']");
    private By divisionButton = By.xpath("//android.widget.ImageButton[@content-desc='divide']");
    private By equalsButton = By.xpath("//android.widget.ImageButton[@content-desc='equals']");

    public Calculator(AppiumDriver<AndroidElement> driver) {
        this.driver = driver;
    }

    @Step
    public String addition() {
        driver.findElement(twoButton).click();
        driver.findElement(plusButton).click();
        driver.findElement(threeButton).click();
        driver.findElement(equalsButton).click();
        return result();
    }
    @Step
    public String multiplication() {
        driver.findElement(fourButton).click();
        driver.findElement(multiplyButton).click();
        driver.findElement(fiveButton).click();
        driver.findElement(equalsButton).click();
        return result();
    }
    @Step
    public String subtraction() {
        driver.findElement(sevenButton).click();
        driver.findElement(minusButton).click();
        driver.findElement(oneButton).click();
        driver.findElement(equalsButton).click();
        return result();
    }
    @Step
    public String division() {
        driver.findElement(sixButton).click();
        driver.findElement(divisionButton).click();
        driver.findElement(threeButton).click();
        driver.findElement(equalsButton).click();
        return result();
    }
    @Step
    public String divisionByZero() {
        driver.findElement(eightButton).click();
        driver.findElement(divisionButton).click();
        driver.findElement(zeroButton).click();
        driver.findElement(equalsButton).click();
        return result();
    }

    private String result() {
        return driver.findElement(By.className("android.widget.TextView")).getText();
    }
}
