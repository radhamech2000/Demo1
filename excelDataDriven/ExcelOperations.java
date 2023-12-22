package excelDataDriven;

public class ExcelOperations {

	public static void main(String[] args) throws Exception {
		
		ExcelAPI e = new ExcelAPI("C:\\Users\\GKB Family\\Radhika\\Automation-Selenium\\supportDocuments\\testdata1.xlsx");
		
		System.out.println(e.getRowCount("login"));
		System.out.println(e.columnCount("login"));
		
		System.out.println(e.getCellData("login", 0, 1));
		System.out.println(e.getCellData("login", "DateCreated", 1));
		
		//e.setCellData("login", 4, 2, "aborted");
		e.setCellData("login", "Result", 1, "aborted");

	}

}
