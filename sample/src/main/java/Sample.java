import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {


    public static void main(String[] args) {

        // Указываем путь к драйверу. Это необходимо для всех драйверов кроме Firefox до 46 версии.
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // OnLoad событие
        driver.get("http://www.google.com/xhtml");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("pickles");
        searchBox.submit();


        // Дополнительный способ перейти на страницу
        // driver.get() == driver.navigate().to()
        driver.navigate().to("https://dictionary.cambridge.org");

        WebElement cambridgeSearchBox = driver.findElement(By.className("cdo-search__input"));
        cambridgeSearchBox.sendKeys("carrot");
        cambridgeSearchBox.submit();

        // Основные функции навигации браузера
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        driver.quit();
    }
}
