package ru.astondevs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.astondevs.pageEntity.PageEntity;

public class MainTest extends BaseTest {
    @Test
    public void open() {
        PageEntity mts = PageFactory.initElements(driver, PageEntity.class);
        mts.clickToButtonAgree();
    }

    @Test
    public void blockName() {
        PageEntity mts = PageFactory.initElements(driver, PageEntity.class);
        WebElement h = mts.getBlockName();
        String header = h.getText().trim().replaceAll("\n", " ");
        String expect = "Онлайн пополнение без комиссии";
        Assert.assertEquals(header, expect);
    }

    @Test
    public void visaLogo() {
        PageEntity mts = PageFactory.initElements(driver, PageEntity.class);
        boolean actual = mts.visaLogo();
        Assert.assertTrue(actual);
    }

    @Test
    public void verifiedByVisaLogo() {
        PageEntity mts = PageFactory.initElements(driver, PageEntity.class);
        boolean actual = mts.verifiedByVisaLogo();
        Assert.assertTrue(actual);
    }

    @Test
    public void masterCardLogo() {
        PageEntity mts = PageFactory.initElements(driver, PageEntity.class);
        boolean actual = mts.masterCardLogo();
        Assert.assertTrue(actual);
    }

    @Test
    public void masterCardSecureLogo() {
        PageEntity mts = PageFactory.initElements(driver, PageEntity.class);
        boolean actual = mts.masterCardSecureLogo();
        Assert.assertTrue(actual);
    }

    @Test
    public void belcardLogo() {
        PageEntity mts = PageFactory.initElements(driver, PageEntity.class);
        boolean actual = mts.belcardLogo();
        Assert.assertTrue(actual);
    }

    @Test
    public void mirLogo() {
        PageEntity mts = PageFactory.initElements(driver, PageEntity.class);
        boolean actual = mts.mirLogo();
        Assert.assertTrue(actual);
    }
}
