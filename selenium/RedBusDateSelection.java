package selenium;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusDateSelection {

	public static void main(String[] args) throws Exception {		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		WebElement element = driver.findElement(By.cssSelector("div#onwardCal"));
		element.click();
		
		/* 
		 * To inspect elements that will go away when you take out mouse
		 * 
				setTimeout(function() {
				  debugger;
				}, 3000);//in console of inspecting elements

		 */
		WebElement currentDate = driver.findElement(By.xpath("//div[contains(@class,'DayNavigator__IconBlock-qj8jdz-2 iZpveD')][2]"));
		WebElement next = driver.findElement(By.xpath("//div[contains(@class,'DayNavigator__IconBlock-qj8jdz-2 iZpveD')][3]"));
		//String selDate = driver.findElement(By.cssSelector("div.labelCalendarContainer>div>span")).getText();
		
		String selectedDate = currentDate.getText().substring(0, 8);
		String dt = null;
		String mon = selectedDate.substring(0, 3);
		String yr = selectedDate.substring(4, 8);
		
		String travelDate = "25 Jan 2024";		
		String trDt = travelDate.substring(0, 2);
		String trMon = travelDate.substring(3, 6);
		String trYr = travelDate.substring(7, 11);	
	
		/*while(!trMon.equals(mon)) {
			
			//System.out.println("Current date is : " + selectedDate);
			Thread.sleep(1000);
			next.click();
			selectedDate = currentDate.getText().substring(0, 8);
			mon = selectedDate.substring(0, 3);
			yr = selectedDate.substring(4, 8);			
						
		}*/
		
		/*String elPath = "//span[contains(text(),'"+ trDt +"')]";
		
		//System.out.println(elPath);
		
		WebElement dtElement = driver.findElement(By.xpath(elPath));
		dtElement.click();*/
		
		/*System.out.println(trDt);
		System.out.println(trMon);
		System.out.println(trYr);*/
		
		String trMonYr = travelDate.substring(3, 11);
		//System.out.println(trMonYr);
		String monyr = mon +" " + yr;
		//System.out.println(monyr);
		
		while(!trMonYr.equals(monyr)) {
			
			//System.out.println("Current date is : " + selectedDate);
			Thread.sleep(1000);
			next.click();
			selectedDate = currentDate.getText().substring(0, 8);
			monyr = selectedDate.substring(0, 8);						
			//System.out.println("Current date is : " + monyr);			
		}		
		
		List<WebElement> calDays = driver.findElements(By.xpath("//div[contains(@class,'DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj')]/span"));
		for (WebElement webElement : calDays) {
			String calDt = webElement.getText();
			//System.out.println(trDt+calDt );
			if(calDt.equals(trDt.trim())) {
				//System.out.println("Date Matched");
				webElement.click();
				break;
			}			
		}		

	}

}
