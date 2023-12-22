package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainProp;
	public static Properties childProp;
	public static Properties orprop;
	
	
	public static void init() throws Exception 
	{
		// static way of giving data.properties file location
		//FileInputStream fis = new FileInputStream("C:\\Users\\GKB Family\\Radhika\\Automation-Selenium\\java17-eclipse-workspace-Aug2023\\September-2023_6pm_selenium\\src\\test\\resources\\data.properties");
		
		System.out.println(projectpath);
		FileInputStream fis = new FileInputStream(projectpath+"\\src\\test\\resources\\data.properties");
		
		//properties class is used to load the properties file
		//Properties p = new Properties();
		p = new Properties();
		p.load(fis);
		/*String val = p.getProperty("chromebrowser");
		System.out.println(val);*/
		
		//the following code is utilized when multiple instances are there
		fis = new FileInputStream(projectpath+"\\src\\test\\resources\\environment.properties");
		mainProp = new Properties();
		mainProp.load(fis);
		String en = mainProp.getProperty("env");
		System.out.println(en);
		
		fis = new FileInputStream(projectpath+"\\src\\test\\resources\\"+en+".properties");
		childProp = new Properties();
		childProp.load(fis);
		System.out.println(childProp.getProperty("amazonurl"));
		
		fis = new FileInputStream(projectpath+"\\src\\test\\resources\\or.properties");
		orprop = new Properties();
		orprop.load(fis);
		
	}
	
	/*public static void launch(String browser) {
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}*/
	public static void launch(String browser) {
		
		if(p.getProperty(browser).equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(p.getProperty(browser).equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(p.getProperty(browser).equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}
	
	public static void navigateUrl(String url) {
		
		//driver.get(url); //always hits the server for response
		
		//driver.navigate().to(url); // only 1st time hits server and next time onwards it takes the reference form the local cache
		//driver.navigate().to(p.getProperty(url));
		
		//for multiple instance
		driver.navigate().to(childProp.getProperty(url));
	}
	
	public static void clickElement(String locatorKey) {
		
		//driver.findElement(By.xpath(orprop.getProperty(locatorKey))).click();
		getElement(locatorKey).click();
	}

	public static void typeText(String locatorKey, String text) {
		//driver.findElement(By.name(orprop.getProperty(locatorKey))).sendKeys(text);
		getElement(locatorKey).sendKeys(text);
	}

	public static void selectOption(String locatorKey, String option) {
		
		//driver.findElement(By.id(orprop.getProperty(locatorKey))).sendKeys(option);
		getElement(locatorKey).sendKeys(option);
	}

	public static WebElement getElement(String locatorKey) {
		
		WebElement element = null;
		
		if(!isElementPresent(locatorKey))
			System.out.println("Element is not present with locator :" + locatorKey);
		element = driver.findElement(getLocator(locatorKey));	
		/*if(locatorKey.endsWith("_id")) {
			element = driver.findElement(By.id(orprop.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_name")) {
			element = driver.findElement(By.name(orprop.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_classname")) {
			element = driver.findElement(By.className(orprop.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_xpath")) {
			element = driver.findElement(By.xpath(orprop.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_css")) {
			element = driver.findElement(By.cssSelector(orprop.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_linktext")) {
			element = driver.findElement(By.linkText(orprop.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_partiallinktext")) {
			element = driver.findElement(By.partialLinkText(orprop.getProperty(locatorKey)));
		}else if(locatorKey.endsWith("_tagname")) {
			element = driver.findElement(By.tagName(orprop.getProperty(locatorKey)));
		}*/
		return element;
	}

	public static boolean isElementPresent(String locatorKey) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		System.out.println("Check for element presence :" + locatorKey);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorKey)));
		
		/*if(locatorKey.endsWith("_id")) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(orprop.getProperty(locatorKey))));
		}else if(locatorKey.endsWith("_name")) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.name(orprop.getProperty(locatorKey))));
		}else if(locatorKey.endsWith("_classname")) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.className(orprop.getProperty(locatorKey))));
		}else if(locatorKey.endsWith("_xpath")) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(orprop.getProperty(locatorKey))));
		}else if(locatorKey.endsWith("_css")) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(orprop.getProperty(locatorKey))));
		}else if(locatorKey.endsWith("_linktext")) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(orprop.getProperty(locatorKey))));
		}else if(locatorKey.endsWith("_partiallinktext")) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(orprop.getProperty(locatorKey))));
		}else if(locatorKey.endsWith("_tagname")) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName(orprop.getProperty(locatorKey))));
		}*/
		
		return true;
	}
	
	public static By getLocator(String locatorKey) {
		
		By by = null;
		
		if(locatorKey.endsWith("_id")) {
			by = By.id(orprop.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_name")) {
			by = By.name(orprop.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_classname")) {
			by = By.className(orprop.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_xpath")) {
			by = By.xpath(orprop.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_css")) {
			by = By.cssSelector(orprop.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_linktext")) {
			by = By.linkText(orprop.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_partiallinktext")) {
			by = By.partialLinkText(orprop.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_tagname")) {
			by = By.tagName(orprop.getProperty(locatorKey));
		}
		
		return by;
		
	}
	
	public static boolean isLinksEqual(String expectedLink) {
		
		String actualLink = driver.findElement(By.linkText("Customer Service")).getText();
		
		if(actualLink.equals(expectedLink))
			return true;
		else
			return false;
	}
	
}
