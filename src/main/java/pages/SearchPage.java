package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * PageObject для Chrome
 */


public class SearchPage {

   /** private WebDriver driver;
    private WebDriverWait wait;

    public SearchPage(WebDriver driver) {

        this.driver = driver;
        //wait = new WebDriverWait(driver,5);

    }**/




    @FindBy(xpath = "//span[contains(@class,'hidden-xs hidden-sm')]")
    private WebElement searchButton;

    @FindBy(xpath = "//input[@id='search-text']")
    private WebElement inputSearch;

    @FindBy(xpath = "//input[@id='search-text']")
    private WebElement inputText;

    @FindBy(xpath = "//a[contains(@id,'tariffLink-')]")
    private WebElement clickText;


    public void setSearchButton() {
        searchButton.click();
       // wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("hidden-xs"));
    }
    public void inputSearch(){
        inputSearch.click();

        //wait.until(ExpectedConditions.invisibilityOf(inputSearch);
    }
    public void inputText(){
        inputText.click();
        //wait.until(ExpectedConditions.visibilityOf(inputText);
    }
    public void clickText(){
        clickText.click();
        //wait.until(ExpectedConditions.visibilityOf(clickText);
    }

    }
