package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumConfig {
    static {
        System.setProperty("webdriver.chrome.driver", "src/main/java/config/chromedriver.exe");
    }

    private WebDriver driver;

    public SeleniumConfig() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }

    public void open(String page) {
        driver.get(page);
    }

    public void close() {
        driver.close();
    }

    public WebDriver getDriver() {
        return  driver;
    }
}
