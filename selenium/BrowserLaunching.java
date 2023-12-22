package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		WebDriverManager.chromedriver().setup();
		//WebDriverManager is a class with static method of "chromedriver()"
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\GKB Family\\Radhika\\Automation-Selenium\\drivers\\chromedriver-win64-118\\chromedriver.exe");
		//System is a class with setProperty is a static method
		ChromeDriver driver = new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\GKB Family\\Radhika\\Automation-Selenium\\drivers\\geckodriver.exe");
		FirefoxDriver driver1 = new FirefoxDriver();
		
		WebDriverManager.edgedriver().setup();
		//System.setProperty("webdriver.edge.driver","");
		EdgeDriver driver2 = new EdgeDriver();
		*/
		
		//Polymorphism concept
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
		WebDriverManager.edgedriver().setup();
		
		driver = new EdgeDriver();

	}

}
