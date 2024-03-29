package ru.astondevs;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.astondevs.pageEntity.PageEntity;

public class AboutServiseTest extends BaseTest {

    @Test
    public void checkAboutService() {
        PageEntity mts = PageFactory.initElements(driver, PageEntity.class);
        mts.clickToButtonAgree();
        mts.clickAboutService();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        Assert.assertEquals(actualUrl,expectedUrl);
    }
}
