package config;

import java.net.MalformedURLException;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Config {
    @BeforeSuite
    public void openBrowser() throws MalformedURLException{
        setupBrowser();
    }

    @AfterSuite
    public void tearDown(){
        quitBrowser();
    }
}
