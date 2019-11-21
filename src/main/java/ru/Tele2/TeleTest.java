package ru.Tele2;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import pages.SearchPage;


public class TeleTest extends Settings {

    @Test

    public void SearchPage() throws InterruptedException {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

        driver.manage().window().maximize();
        searchPage.searchButton.click();
        driver.wait(3000);
        searchPage.inputSearch.click();
        driver.wait(3000);
        searchPage.inputText.click();
        driver.wait(3000);
        searchPage.clickText.click();
    }
}
