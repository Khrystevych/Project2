package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewIssuePage extends BasePage  {
    private final static String TITLE = "New Issue page";
    WebElement issueTitle = driver.findElement(By.xpath("//input[@id='issue_title']"));
    WebElement leaveComment = driver.findElement(By.xpath("//textarea[@id='issue_body']"));
    WebElement submitNewIssueButton = driver.findElement(By.xpath("//*[@id=\"new_issue\"]/div/div/div[1]/div/div[1]/div/div[2]/button"));
    public NewIssuePage(WebDriver driver) {
        super(driver, TITLE);
    }

    public ListOfIssuesPage fillOutNewIssue(String title, String comment){
        issueTitle.sendKeys(title);
        leaveComment.sendKeys(comment);
        submitNewIssueButton.click();
        log.info("New Issue created successfully");
        return new ListOfIssuesPage(driver);
    }
}
