package ru.astondevs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.astondevs.pageEntity.PageEntity;

public class PopUpTests extends BaseTest {
    @BeforeTest
    public void sendForm() {
        PageEntity mts = PageFactory.initElements(driver, PageEntity.class);
        mts.clickToButtonAgree();
        WebElement phone = mts.getPhone();
        phone.sendKeys("297777777");
        WebElement inputPrice = mts.getInputPrice();
        inputPrice.sendKeys("90");
    }

    @Test
    public void communicationServices() {
        WebElement selectOption = driver.findElement(By.xpath("//p[contains(text(),'Услуги связи')]"));
        Assert.assertTrue(selectOption.isEnabled());
    }

    @Test
    public void homeInternet() {
        WebElement selectOption = driver.findElement(By.xpath("//p[contains(text(),'Домашний интернет')]"));
        Assert.assertTrue(selectOption.isEnabled());
    }

    @Test
    public void installments() {
        WebElement selectOption = driver.findElement(By.xpath("//p[contains(text(),'Рассрочка')]"));
        Assert.assertTrue(selectOption.isEnabled());
    }

    @Test
    public void debt() {
        WebElement selectOption = driver.findElement(By.xpath("//p[contains(text(),'Задолженность')]"));
        Assert.assertTrue(selectOption.isEnabled());
    }
}


