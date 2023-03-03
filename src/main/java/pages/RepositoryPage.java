package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RepositoryPage extends BasePage {
    private final static String TITLE = "Repository page";
    WebElement issuesButton = driver.findElement(By.xpath("//a[@id='issues-tab']"));
    public RepositoryPage(WebDriver driver) {
        super(driver, TITLE);
    }
    public IssuesPage goToIssuesPage (){
        issuesButton.click();
        return new IssuesPage(driver);
    }
}
