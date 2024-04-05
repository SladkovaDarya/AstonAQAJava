package ru.astondevs.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.astondevs.pageEntity.wildberries.WildberriesBasket;
import ru.astondevs.pageEntity.wildberries.WildberriesMain;

import java.util.Set;

public class MainTests extends BaseTest {
    protected WildberriesMain wildberriesMain = new WildberriesMain();
    protected WildberriesBasket wildberriesBasket = new WildberriesBasket();

    @BeforeTest
    public void open() {
        wildberriesMain.clickCookies();
    }

    //имена на главной стр и в корзине не эквивалентны друг другу!
    // на главной стр в карточке одно название,
    // в корзине может быть другая версия
    @Test(priority = 1)
    public void namesCompare() throws InterruptedException {
        Set<String> namesMainPage = wildberriesMain.handlingNames();
        Thread.sleep(7000);
        driver.get("https://www.wildberries.ru/lk/basket");
        Set<String> namesBasketPage = wildberriesBasket.handlingBasketNames();
        System.out.println(namesMainPage);
        System.out.println(namesBasketPage);
        Assert.assertEquals(namesMainPage, namesBasketPage);
    }

    @Test(priority = 2) //количество продуктов, выбранных на гл стр и в корзине
    public void numProductsCompare() {
        int cntMain = wildberriesMain.getCntProductsOnMain();
        int cntBasket = wildberriesBasket.commonCntProducts();
        Assert.assertEquals(cntMain, cntBasket);
    }

    @Test(priority = 3) // цена продуктов при подсчете и общая с сайта
    public void price() {
        int basketCnt = wildberriesBasket.getAddingSum();
        System.out.println(basketCnt);
        int commonPrice = wildberriesBasket.pullCommonPrice();
        System.out.println(commonPrice);
        Assert.assertEquals(basketCnt,commonPrice);
   }


}
