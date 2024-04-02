package ru.astondevs.pageEntity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PageEntity {
    @FindBy(xpath = "//button[@id='cookie-agree']")
    private WebElement buttonAgree;
    @FindBy(xpath = "//form[@class='pay-form opened']/button[@class='button button__default ']")
    private WebElement buttonContinue;
    @FindBy(xpath = "//input[@class='phone']")
    private WebElement phone;
    @FindBy(xpath = "//input[@class='total_rub']")
    private WebElement inputPrice;
    @FindBy(xpath = "//p[contains(text(),'Услуги связи')]")
    private WebElement communicationServices;
    @FindBy(xpath = "//p[contains(text(),'Домашний интернет')]")
    private WebElement homeInternet;
    @FindBy(xpath = "//p[contains(text(),'Рассрочка')]")
    private WebElement installments;
    @FindBy(xpath = "//p[contains(text(),'Задолженность')]")
    private WebElement debt;
    @FindBy(xpath = "//iframe[@class = 'bepaid-iframe']")
    private WebElement frame;
    @FindBy(xpath = "//label[@class='ng-tns-c49-1 ng-star-inserted']")
    private WebElement textNumberCard;
    @FindBy(xpath = "//label[@class='ng-tns-c49-4 ng-star-inserted']")
    private WebElement textValidityPeriod;
    @FindBy(xpath = "//label[@class='ng-tns-c49-5 ng-star-inserted']")
    private WebElement textCvc;
    @FindBy(xpath = "//label[@class='ng-tns-c49-3 ng-star-inserted']")
    private WebElement textCardHolder;

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

    public WebElement getFrame() {
        return frame;
    }

    public WebElement getCommunicationServices() {
        return communicationServices;
    }

    public WebElement getHomeInternet() {
        return homeInternet;
    }

    public WebElement getInstallments() {
        return installments;
    }

    public WebElement getDebt() {
        return debt;
    }

    public WebElement getTextNumberCard() {
        return textNumberCard;
    }

    public WebElement getTextValidityPeriod() {
        return textValidityPeriod;
    }

    public WebElement getTextCvc() {
        return textCvc;
    }

    public WebElement getTextCardHolder() {
        return textCardHolder;
    }

    public void clickButtonContinue() {
        if (buttonContinue.isDisplayed()) {
            buttonContinue.click();
        }
    }

    public boolean isStableIconsDisplayed(List<WebElement> list) {
        int cnt = 0;
        for (WebElement element : list) {
            if (element.isDisplayed()) {
                cnt++;
            }
        }
        return cnt == 3;
    }
    public boolean isSwitchedIconsDisplayed(List<WebElement> list) {
        int cnt = 0;
        for (WebElement element : list) {
            if (element.isDisplayed()) {
                cnt++;
            }
        }
        return cnt == 2;
    }
}


