package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

@org.testng.annotations.Listeners({Listeners.class})
public class DriverManager {

	 public static WebDriver driver;

    public DriverManager(){
    	WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
    }

    public static WebDriver getWebDriver(){
        return driver;
    }
}
