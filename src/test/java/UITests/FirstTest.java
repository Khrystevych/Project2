package UITests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;

public class FirstTest extends BaseTest {
    public FirstTest() {
    }

    @DataProvider( name = "dataProvider1")
    public Object[][] credentialProvider(){
        return new Object[][]{
                {"Issue name", "Unable to login to github."},
                {"Issue name", "Unable to create a pull request on github."},
                {"Issue name", "The main page on github does not display the list of repositories."},
        };
    }

    @Test(dataProvider = "dataProvider1")
    public void createListOfIssues(String title, String comment) {
        HopePage hopePage = new HopePage(this.driver);
        hopePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(this.driver);
        loginPage.successfulLogin("Khrystevych", "VladKH999");
        MainPage mainPage = new MainPage(this.driver);
        mainPage.goToRepositoryPage();
        RepositoryPage repositoryPage = new RepositoryPage(this.driver);
        repositoryPage.goToIssuesPage();
        IssuesPage issuesPage = new IssuesPage(this.driver);
        issuesPage.createNewIssue();
        NewIssuePage newIssuePage = new NewIssuePage(this.driver);
        newIssuePage.fillOutNewIssue(title, comment);
        ListOfIssuesPage listOfIssuesPage = new ListOfIssuesPage(this.driver);
        String ExpectedIssueTitle = "Issue name";
        Assert.assertEquals(listOfIssuesPage.validateTitle(), ExpectedIssueTitle);
        System.out.println("Assert passed successfully");
    }

}

