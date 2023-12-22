package selenium;

public class TC_001 extends BaseTest{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//launch("firefox");
		
		//launch("chrome");
		
		//navigateUrl("https://amazon.in");
		
		//Using properties file data
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");

	}

}
