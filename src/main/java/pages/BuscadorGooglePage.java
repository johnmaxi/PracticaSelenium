package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuscadorGooglePage {

    @FindBy(name = "q")
    private WebElement txtBusquedaGoogle;
    private WebDriver driver;

    public BuscadorGooglePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void BusquedaGoogle (String palabrabusqueda){
        txtBusquedaGoogle.sendKeys(palabrabusqueda);
        txtBusquedaGoogle.submit();
    }

    public void irCucumber(){
        driver.findElement(By.xpath("//*[contains(text(),'Cucumber.io')]")).click();
    }
}


