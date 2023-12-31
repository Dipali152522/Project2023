package browserControl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utilities.ConstantUtils;

public class WebConnector {
    public static WebDriver driver;

    public static void openBrowser() {
        if (ConstantUtils.BROWSER_NAME.equalsIgnoreCase("firefox")) {
            FirefoxOptions fo = new FirefoxOptions();
            if (ConstantUtils.BROWSER_TYPE.equalsIgnoreCase("headless")) {
                fo.addArguments("--headless");
            }
            fo.addArguments("start-maximized");
            driver = new FirefoxDriver(fo);
        } else {
            ChromeOptions co = new ChromeOptions();
            if (ConstantUtils.BROWSER_TYPE.equalsIgnoreCase("headless")) {
                co.addArguments("--headless");
            }
            co.addArguments("start-maximized");
            driver = new ChromeDriver(co);
        }

//        if using implicit wait it has to be defined here
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    public static void closeBrowser() {
//        driver.quit();
    }
}



