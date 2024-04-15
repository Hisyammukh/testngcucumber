package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import config.Config;

public class Object extends Config{
    
    public Object(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void getLink(String link){
        driver.get(link);
    }

    public String assertTitle(){
        return driver.getTitle();
    }
}
