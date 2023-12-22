package excelDataDriven;

public class DataManagement {

	public static void main(String[] args) throws Exception {
		
		ExcelAPI e = new ExcelAPI("C:\\Users\\GKB Family\\Radhika\\Automation-Selenium\\supportDocuments\\suitex.xlsx");
		String sheetName = "data";
		String testName = "TestA";
		
		//find the matching testcase row no
		int testStartRowNum = 0;
		while(!e.getCellData(sheetName, 0, testStartRowNum).equals(testName)) {
			
			testStartRowNum++;
		}
		System.out.println("test start row number is : "+ testStartRowNum);
		
		int colStartRowNum = testStartRowNum + 1;
		int dataStartRowNum = testStartRowNum + 2;
		
		//calculate the rows of data
		int rows = 0;
		while(!e.getCellData(sheetName, 0, dataStartRowNum+rows).equals("")) {
			rows++;
		}
		System.out.println("Total rows are : " + rows);
		
		//calculate the columns of data
		int cols = 0;
		while(!e.getCellData(sheetName, cols, colStartRowNum).equals("")) {
			cols++;
		}
		System.out.println("Total cols are : " + cols);
		
		//read the test data
		for(int rNum = dataStartRowNum; rNum < dataStartRowNum + rows; rNum++) {
			for(int cNum = 0; cNum < cols; cNum++) {
				System.out.println(e.getCellData(sheetName, cNum, rNum));
			}
		}

	}

}
