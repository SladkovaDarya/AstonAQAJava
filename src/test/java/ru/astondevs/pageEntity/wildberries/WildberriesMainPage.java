package ru.astondevs.pageEntity.wildberries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WildberriesMainPage {
    private final WebDriver driver;
    private By cookies = By.xpath("//button[@class='cookies__btn btn-minor-md']");
    private String buttonLocator = "//a[@class='product-card__add-basket j-add-to-basket btn-main']";
    private String prodNameLocator = "//span[@class = 'product-card__name']";
    private By popUp = By.xpath("//div[@class='popup popup-list-of-sizes shown slideUp']");
    private By label = By.xpath("//label[@class='j-quick-order-size-fake sizes-list__button'][1]");

    public WildberriesMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getButtonLocator() {
        return buttonLocator;
    }

    public String getProdNameLocator() {
        return prodNameLocator;
    }

    public WebElement getCookies() {
        return driver.findElement(cookies);
    }

    public WebElement getPopUp() {
        return driver.findElement(popUp);
    }

    public WebElement getLabel() {
        return driver.findElement(label);
    }
}
