import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Optional. If not specified, WebDriver searches the PATH for chromedriver.
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mytek.tn/");
        Thread.sleep(2000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("Imprimante");
        searchBox.submit();
        Thread.sleep(4000);


        WebElement Produit = driver.findElement(By.xpath("//*[@title=\"Imprimante Jet d'encre HP PageWide Pro 477dw 4en1 - WiFi\"]"));
        Produit.click();
        Thread.sleep(4000);

        WebElement JAchete = driver.findElement(By.name("Submit"));
        JAchete.click();
        Thread.sleep(4000);

        WebElement Passer_Commande = driver.findElement(By.xpath("//*[@title=\"Passer la Commander\"]"));
        Passer_Commande.click();
        Thread.sleep(4000);

        driver.quit();
    }
}