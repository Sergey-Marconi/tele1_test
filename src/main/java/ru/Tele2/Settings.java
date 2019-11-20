package ru.Tele2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class Settings {

    public WebDriver driver;

   @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/sergejtrusov/TEST/chromedriver");

    }
    @After
    public void close(){
        String Url = driver.getCurrentUrl();
        Assert.assertTrue(Url.equals("https://voronezh.tele2.ru/tariff/my-start"));


        driver.quit();
    }
}
