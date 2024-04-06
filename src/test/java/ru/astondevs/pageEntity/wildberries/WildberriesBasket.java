package ru.astondevs.pageEntity.wildberries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.astondevs.tests.DriverSingleton;

import java.util.*;

public class WildberriesBasket {
    private WebDriver driver = DriverSingleton.getInstance();
    private WildberriesBasketPage wildberriesBasketPage = new WildberriesBasketPage(driver);

    private Set<String> getListOfProductNames() {
        List<WebElement> webElNames = wildberriesBasketPage.getNameOfProductsWebElements();
        Set<String> basketNames = new HashSet<>();
        for (WebElement element : webElNames) {
            basketNames.add(element.getText());
        }
        return basketNames;
    }

    public Set<String> handlingBasketNames() {
        Set<String> basketNames = getListOfProductNames();
        Set<String> handleNames = new HashSet<>();
        for (String name : basketNames) {
            handleNames.add(name.trim().replaceAll("/", ""));
        }
        return handleNames;
    }

    public int commonCntProducts() {
        String[] parts = wildberriesBasketPage.getNumCnt().getText().split(" ");
        return Integer.parseInt(parts[1]);
    }

    public List<Integer> pullPrice() {
        List<WebElement> listPrice = wildberriesBasketPage.getPrices();
        List<Integer> price = new ArrayList<>();
        for (WebElement element : listPrice) {
            String numb = element.getText().trim().replaceAll(" ₽", "");
            price.add(Integer.parseInt(numb));
        }
        return price;
    }

    public int getAddingSum() {
        List<Integer> price = pullPrice();
        int cnt = 0;
        for (int i : price) {
            cnt = cnt + i;
        }
        return cnt;
    }

    public int pullCommonPrice() {
        WebElement element = wildberriesBasketPage.getCommonSum();
        String preSum = element.getText().trim().replace(" ₽", "");
        String sum = preSum.replaceAll(" ", "");
        int commonPrice = Integer.parseInt(sum);
        return commonPrice;
    }
}
