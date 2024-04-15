package steps;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import config.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.Object;



public class StepsDef extends Config{
    // public static WebDriver driver;
    private String title;
    Object object;

    @Given("Website as {string}")
    public void loadingWebsite(String website) throws MalformedURLException {
        // ChromeOptions options = new ChromeOptions();
        // options.addArguments("--remote-allow-origins=*");
        
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // // driver.manage().window().fullscreen();
        // // driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);

        // String ranBy = System.getProperty("machine");
        // switch (ranBy) {
        //     case "SERVER":
        //         driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
        //         break;
            
        //     default:
        //         driver = new ChromeDriver(options);
        //         break;
        // }

        // driver.get(website);
        object = new Object(driver);
        object.getLink(website);
        
    }

    @When("I get title")
    public void getTitle() {
        // driver.manage().window().maximize();
        // title = driver.getTitle();
        // Assert.assertEquals(object.assertTitle(), title);
    }

    @Then("I validate is {string}")
    public void validateTitle(String name) {
        // Assert.assertTrue(title.equals(name));
        // driver.quit();
        // Assert.assertEquals(object.assertTitle(), name);
    }
}
