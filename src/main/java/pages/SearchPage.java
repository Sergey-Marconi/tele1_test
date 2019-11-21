package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.Tele2.Settings;

/**
 * PageObject для Chrome
 */


public class SearchPage extends Settings {

   /** private WebDriver driver;
    private WebDriverWait wait;

    public SearchPage(WebDriver driver) {

        this.driver = driver;
        //wait = new WebDriverWait(driver,5);

    }**/

    public WebElement searchButton = driver.findElement(By.xpath("//span[contains(@class,'hidden-xs hidden-sm')]"));

    public WebElement inputSearch = driver.findElement(By.xpath("//input[@id='search-text']"));

    public WebElement inputText =driver.findElement(By.xpath( "//input[@id='search-text']"));

    public WebElement clickText = driver.findElement(By.xpath("//a[contains(@id,'tariffLink-')]"));
    }
