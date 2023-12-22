package selenium;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoibiboDateSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		WebElement element = driver.findElement(By.xpath("//div[contains(@class,'gr_fswFld active')]"));
		element.click();
		
		String travelDate = "25 January 2024";
		String trMonYr = travelDate.substring(3, 15);
		System.out.println(trMonYr);		
		
		/*List<WebElement> calMons = driver.findElements(By.xpath("//div[contains(@class,'DayPicker-Caption')]/div"));
		for (WebElement webElement : calMons) {
			String calDt = webElement.getText();
			//System.out.println(trDt+calDt );
			if(calDt.equals(trDt.trim())) {
				//System.out.println("Date Matched");
				webElement.click();
				break;
			}			
		}*/		


	}

}
