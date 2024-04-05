package ru.astondevs.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver = DriverSingleton.getInstance();

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.wildberries.ru/");
    }

 /*   @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    } */
}
