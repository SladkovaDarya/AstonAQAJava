package ru.astondevs.pageEntity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageEntity {
    @FindBy(xpath = "//button[@id='cookie-agree']")
    private WebElement buttonAgree;
    @FindBy(xpath = "//form[@class='pay-form opened']/button[@class='button button__default ']")
    private WebElement buttonContinue;
    @FindBy(xpath = "//input[@class='phone']")
    private WebElement phone;
    @FindBy(xpath = "//input[@class='total_rub']")
    private WebElement inputPrice;

    public void clickToButtonAgree() {
        if (buttonAgree.isDisplayed()) {
            buttonAgree.click();
        }
    }

    public WebElement getPhone() {
        return phone;
    }

    public WebElement getInputPrice() {
        return inputPrice;
    }

    public void clickButtonContinue() {
        if (buttonContinue.isDisplayed()) {
            buttonContinue.click();
        }
    }
}


