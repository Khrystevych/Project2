package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IssuesPage extends BasePage {
    private final static String TITLE = "Issues page";
    WebElement newIssueButton = driver.findElement(By.xpath("//span[contains(text(),'New issue')]"));
    public IssuesPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public NewIssuePage createNewIssue(){
        newIssueButton.click();
        return new NewIssuePage(driver);
    }
}



