import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverWrapper {
    WebDriver driver;

    public DriverWrapper() {
        System.setProperty("webdriver.chrome.driver", "/Users/alexandrkanishevskii/IdeaProjects/ITVDNQA/005_Samples/Sample_2_PageFactory/src/main/resources/chromedriver");
        this.driver = new ChromeDriver();
    }

    public void init() {
        this.driver.get("https://itvdn.com/ru");
        this.driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void close() {
        this.driver.quit();
    }
}
