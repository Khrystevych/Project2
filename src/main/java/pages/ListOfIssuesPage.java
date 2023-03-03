package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListOfIssuesPage extends BasePage {
    WebElement actualIssueTitle = driver.findElement(By.xpath("//bdi[@class='js-issue-title markdown-title']"));
    private final static String TITLE = "List of Issues page";
    public ListOfIssuesPage(WebDriver driver) {
        super(driver, TITLE);
    }

    public String validateTitle(){
        String ActualIssueTitle = actualIssueTitle.getText();
        return ActualIssueTitle;
    }

    @Override
    public String toString() {
        return "ListOfIssuesPage{" +
                "issueTitle=" + actualIssueTitle +
                '}';
    }
}
