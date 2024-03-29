package ru.astondevs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
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
    public void runPopUp() {
        PageEntity mts = PageFactory.initElements(driver, PageEntity.class);
        mts.clickButtonContinue();
    }
}
