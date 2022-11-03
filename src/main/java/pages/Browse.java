package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browse {

public static WebDriver driver;



public static WebDriver browserLaunch (String browsername) {
	
	if(browsername.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
}
else if(browsername.equalsIgnoreCase("firefox")) {
	WebDriverManager.firefoxdriver().setup();
    driver=new FirefoxDriver();
}
else if(browsername.equalsIgnoreCase("edge")) {
	WebDriverManager.edgedriver().setup();
    driver=new EdgeDriver();
}
return driver;
}
}