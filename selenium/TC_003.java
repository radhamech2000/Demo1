package selenium;

import org.openqa.selenium.By;

public class TC_003 extends BaseTest{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		/* static way of finding elements
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		driver.findElement(By.name("field-keywords")).sendKeys("HarryPotter");
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		*/
		
		selectOption("amazondropbox_id","Books");
		
		typeText("amazonsearchtext_id","HarryPotter");
		
		clickElement("amazonsearchbutton_xpath");
	}

	

}
