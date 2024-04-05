package ru.astondevs.pageEntity.wildberries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WildberriesBasketPage {
    private final WebDriver driver;
    private String namesOfProducts = "//span[@class='good-info__good-name']";
    private By numCnt = By.xpath("//div[@class='b-top__count line']//span[1]");
    private By prices = By.xpath("//div[@class='list-item__price-new wallet']");
    private By commonSum = By.xpath("//span[starts-with(@data-link,'{formatMoneyAnim' )]");

    public WildberriesBasketPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getNumCnt() {
        return driver.findElement(numCnt);
    }

    public List<WebElement> getNameOfProductsWebElements() {
        return driver.findElements(By.xpath(namesOfProducts));
    }

    public List<WebElement> getPrices() {
        return driver.findElements(prices);
    }

    public WebElement getCommonSum() {
        return driver.findElement(commonSum);
    }
}
