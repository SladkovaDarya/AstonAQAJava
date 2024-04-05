package ru.astondevs.pageEntity.wildberries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.astondevs.tests.DriverSingleton;

import java.time.Duration;
import java.util.*;

public class WildberriesMain {
    private WebDriver driver = DriverSingleton.getInstance();
    private WildberriesMainPage wildberriesMainPage = new WildberriesMainPage(driver);
    private int cntProductsOnMain;

    public int getCntProductsOnMain() {
        return cntProductsOnMain;
    }

    public void clickCookies() {
        wildberriesMainPage.getCookies().click();
    }

    private Set<String> clickButtonAndGetNameOfProd() {
        Set<String> namesOfProd = new HashSet<>();
        int cntProdCards = 2;
        String buttonLocator = wildberriesMainPage.getButtonLocator();
        String prodNameLocator = wildberriesMainPage.getProdNameLocator();
        for (int i = 0; i < cntProdCards; i++) {
            String articleLocator = "//article[@data-card-index='" + i + "']";
            WebElement prodName = driver.findElement(By.xpath(articleLocator + prodNameLocator));
            namesOfProd.add(prodName.getText());

            WebElement button = (new WebDriverWait(driver, Duration.ofSeconds(3)))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(articleLocator + buttonLocator)));
            button.click();

            cntProductsOnMain++;
        }
        //popUpEnable();
        return namesOfProd;
    }

    public Set<String> handlingNames() {
        Set<String> namesOfProd = clickButtonAndGetNameOfProd();
        Set<String> handleNames = new HashSet<>();
        for (String name : namesOfProd) {
            handleNames.add(name.trim().substring(2));
        }
        return handleNames;
    }

    private void popUpEnable() {
        WebElement popUp = wildberriesMainPage.getPopUp();
        WebElement label = wildberriesMainPage.getLabel();
        if (popUp.isEnabled()) {
            label.click();
        }
    }

}
