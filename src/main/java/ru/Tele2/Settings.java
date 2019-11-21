package ru.Tele2;

import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Settings {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    static public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 15);
        driver.get("https://www.tele2.ru/");
        driver.manage().window().maximize();
    }

    @After
    public void close(){
        driver.quit();
    }
}


