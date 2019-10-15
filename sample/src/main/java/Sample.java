import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;



public class Sample {


    public static void main(String[] args) throws InterruptedException {

        // Указываем путь к драйверу. Это необходимо для всех драйверов кроме Firefox до 46 версии.
        System.setProperty("webdriver.chrome.driver","/Users/alexandrkanishevskii/IdeaProjects/ITVDNQA/sample/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);


        // OnLoad событие
        driver.get("http://www.google.com/xhtml");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("pickles");
        searchBox.submit();

        //
        driver.get("https://www.google.ru/");
        WebElement serchMiami = driver.findElement(By.xpath("//input[@name='q']"));
        serchMiami.sendKeys("майами");
        WebElement clickSearchMiami = driver.findElement(By.xpath("//input[@name='q']"));
        clickSearchMiami.sendKeys(Keys.ENTER);



//         Дополнительный способ перейти на страницу
//         driver.get() == driver.navigate().to()
        driver.navigate().to("https://yandex.ru/");
        WebElement cambridgeSearchBox = driver.findElement(By.id("text"));
        cambridgeSearchBox.sendKeys("carrot");
        cambridgeSearchBox.submit();
//
//         Основные функции навигации браузера
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        driver.quit();
    }
}
