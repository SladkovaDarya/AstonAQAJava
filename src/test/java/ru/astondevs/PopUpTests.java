package ru.astondevs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.astondevs.pageEntity.PageEntity;

import java.time.Duration;
import java.util.List;

public class PopUpTests extends BaseTest {
    public String spanLocator = "//span[contains(text(),'90.00 BYN')]";
    public String buttonSumLocator = "//button[@class ='colored disabled ng-star-inserted']";
    public String phoneTextLocalor = "//p[@class='header__payment-info']";
    public String slableIconsLocator = "//img[@class='ng-tns-c55-0 ng-star-inserted']";
    public String switchedIconsLocator = "//img[@class='ng-tns-c55-0 ng-trigger ng-trigger-randomCardState ng-star-inserted']";

    @BeforeTest
    public void open() {
        PageEntity mts = PageFactory.initElements(driver, PageEntity.class);
        mts.clickToButtonAgree();
        WebElement phone = mts.getPhone();
        phone.sendKeys("297777777");
        WebElement inputPrice = mts.getInputPrice();
        inputPrice.sendKeys("90");
    }

    @Test(priority = 1)
    public void communicationServices() {
        PageEntity mts = PageFactory.initElements(driver, PageEntity.class);
        WebElement selectOption = mts.getCommunicationServices();
        Assert.assertTrue(selectOption.isEnabled());
    }

    @Test(priority = 2)
    public void homeInternet() {
        PageEntity mts = PageFactory.initElements(driver, PageEntity.class);
        WebElement selectOption = mts.getHomeInternet();
        Assert.assertTrue(selectOption.isEnabled());
    }

    @Test(priority = 3)
    public void installments() {
        PageEntity mts = PageFactory.initElements(driver, PageEntity.class);
        WebElement selectOption = mts.getInstallments();
        Assert.assertTrue(selectOption.isEnabled());
    }

    @Test(priority = 4)
    public void debt() {
        PageEntity mts = PageFactory.initElements(driver, PageEntity.class);
        WebElement selectOption = mts.getDebt();
        Assert.assertTrue(selectOption.isEnabled());
    }

    @Test(priority = 5)
    public void checkSum() {
        PageEntity mts = PageFactory.initElements(driver, PageEntity.class);
        mts.clickButtonContinue();
        WebElement frame = mts.getFrame();
        driver.switchTo().frame(frame);
        WebElement span = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath(spanLocator))));
        String expect = "90.00 BYN";
        Assert.assertEquals(span.getText(), expect);
    }

    @Test(priority = 6)
    public void checkSumButton() {
        WebElement buttonSum = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath(buttonSumLocator))));
        String expect = "Оплатить 90.00 BYN";
        Assert.assertEquals(buttonSum.getText(), expect);
    }

    @Test(priority = 7)
    public void phoneNumber() {
        WebElement phone = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath(phoneTextLocalor))));
        String expect = "Оплата: Услуги связи Номер:375297777777";
        Assert.assertEquals(phone.getText(), expect);
    }

    @Test(priority = 8)
    public void textForm() {
        PageEntity mts = PageFactory.initElements(driver, PageEntity.class);
        List<String> actualText = List.of(mts.getTextCvc().getText(),
                mts.getTextCardHolder().getText(),
                mts.getTextNumberCard().getText(),
                mts.getTextValidityPeriod().getText());
        List<String> expectedText = List.of("CVC", "Имя держателя (как на карте)",
                "Номер карты", "Срок действия");
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(priority = 9)
    public void stableIcons() {
        PageEntity mts = PageFactory.initElements(driver, PageEntity.class);
        List<WebElement> webElements = driver.findElements(By.xpath(slableIconsLocator));
        mts.isStableIconsDisplayed(webElements);
    }

    @Test(priority = 10)
    public void switchableIcons() {
        PageEntity mts = PageFactory.initElements(driver, PageEntity.class);
        List<WebElement> webElements = driver.findElements(By.xpath(switchedIconsLocator));
        mts.isSwitchedIconsDisplayed(webElements);
    }
}


