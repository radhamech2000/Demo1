package excelDataDriven;

public class StatusUpdateAsPerAge {

	public static void main(String[] args) throws Exception {
		
		ExcelAPI e = new ExcelAPI("C:\\Users\\GKB Family\\Radhika\\Automation-Selenium\\supportDocuments\\data.xlsx");
		
		for(int i=1; i<e.getRowCount("people"); i++) {			
			
			String celldata = e.getCellData("people", "Age", i);			
			String newdata = celldata.substring(0, (celldata.length()-2));
			//System.out.println(Integer.valueOf(newdata));
			int age = Integer.valueOf(newdata);
			String status = "NotDefined";
			if(age<18) {				
				status = "Minor";
				//System.out.println(age + status);
				//e.setCellData("people", "Status", i, "Minor");
			}
			else {
				status = "Major";
				//System.out.println(age + status);
				//e.setCellData("people", "Status", i, "Major");
			}
			//e.setCellData("people", 2, i, status);
			
			e.setCellData("people", "Status", i, status);
			
		}

	}

}
