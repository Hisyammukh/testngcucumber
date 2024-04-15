package config;

import java.net.MalformedURLException;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Config {
    @Before
    public void openBrowser() throws MalformedURLException{
        setupBrowser();
    }

    @After
    public void tearDown(){
        quitBrowser();
    }
}
