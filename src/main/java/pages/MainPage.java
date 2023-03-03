package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage{
    private final static String TITLE = "Main page";
    WebElement repositoryButton = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/aside/div/loading-context/div/div[1]/div/ul/li[2]/div/div/a"));
    public MainPage(WebDriver driver) {
        super(driver, TITLE);
    }
    public RepositoryPage goToRepositoryPage (){
        repositoryButton.click();
        return new RepositoryPage(driver);
    }

}