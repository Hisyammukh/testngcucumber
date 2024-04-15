package config;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Config {
    public static WebDriver driver;

    public static void setupBrowser() throws MalformedURLException{
        getDriver();
    }

    public static WebDriver getDriver() throws MalformedURLException{
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--start-maximized");

        String ranBy = System.getProperty("machine");
        switch (ranBy) {
            case "SERVER":
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), option);
                break;
            
            default:
                driver = new ChromeDriver(option);
                break;
        }

        return driver;
        
    }

    public static void quitBrowser(){
        driver.quit();
    }
}
