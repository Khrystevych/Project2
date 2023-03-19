package UITests;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;
    protected Logger logger;
    public BaseTest() {
    }

    @BeforeMethod
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\IdeaProjects\\Newproject\\src\\main\\resources\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
        this.driver.get("https://github.com/");
    }

    @AfterMethod
    void tearDown() {
        this.driver.quit();
    }
}
