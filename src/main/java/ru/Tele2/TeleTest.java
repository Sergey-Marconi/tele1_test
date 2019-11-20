package ru.Tele2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.SearchPage;


public class TeleTest extends Settings {

 @Test

    public void SearchPage(){
        driver.get("https://voronezh.tele2.ru");

        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

        searchPage.setSearchButton();
        searchPage.inputSearch();
        searchPage.inputText();
        searchPage.clickText();


    }

}
