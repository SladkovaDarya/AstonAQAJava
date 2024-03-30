package ru.astondevs.pageEntity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageEntity {
    @FindBy(xpath = "//button[@id='cookie-agree']")
    private WebElement buttonAgree;
    @FindBy(xpath = "//h2[contains(text(),'Онлайн пополнение')]")
    private WebElement blockName;
    @FindBy(xpath = "//img[@alt='Visa']")
    private WebElement visaLogo;
    @FindBy(xpath = "//img[@alt='Verified By Visa']")
    private WebElement verifiedByVisaLogo;
    @FindBy(xpath = "//img[@alt='MasterCard']")
    private WebElement masterCardLogo;
    @FindBy(xpath = "//img[@alt='MasterCard Secure Code']")
    private WebElement masterCardSecureLogo;
    @FindBy(xpath = "//img[@alt='Белкарт']")
    private WebElement belcardLogo;
    @FindBy(xpath = "//img[@alt='МИР']")
    private WebElement mirLogo;
    @FindBy(xpath = "//a[contains(text(),'Подробнее о сервисе')]")
    private WebElement aboutService;
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

    public WebElement getBlockName() {
        return blockName;
    }

    public boolean visaLogo() {
        return visaLogo.isDisplayed();
    }

    public boolean verifiedByVisaLogo() {
        return verifiedByVisaLogo.isDisplayed();
    }

    public boolean masterCardLogo() {
        return masterCardLogo.isDisplayed();
    }

    public boolean masterCardSecureLogo() {
        return masterCardSecureLogo.isDisplayed();
    }

    public boolean belcardLogo() {
        return belcardLogo.isDisplayed();
    }

    public boolean mirLogo() {
        return mirLogo.isDisplayed();
    }

    public void clickAboutService() {
        if (aboutService.isDisplayed()) {
            aboutService.click();
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
