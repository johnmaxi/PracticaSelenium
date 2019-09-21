import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.BuscadorGooglePage;

public class BusquedaGoogle {
    private WebDriver driver;
    private BuscadorGooglePage buscadorGooglePage;

    @Before
    public void setUp(){
        System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test
    public void testBusquedaGoogle() throws Exception{
        buscadorGooglePage = new BuscadorGooglePage(driver);
        driver.get("https://www.google.com.co/");
        buscadorGooglePage.BusquedaGoogle("CUCUMBER  IO");
        buscadorGooglePage.irCucumber();
        driver.findElement(By.linkText("DOCUMENTATION")).click();
        Thread.sleep(3000);
    }

    @After
    public void close() {
        driver.quit();
    }
}
