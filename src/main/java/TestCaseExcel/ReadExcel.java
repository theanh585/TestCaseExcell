package TestCaseExcel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.sl.draw.geom.Formula;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	private final static String path = "E:\\Data Test Case\\";
	private static List<String> listExcel;
	private static List<ObjectTest> listTest = new LinkedList<>();;
	
	public static void ReadExcel() throws IOException {
			
		listExcel = new LinkedList<>();
        File folder = new File(path);
        for (File e : folder.listFiles()) {
            listExcel.add(e.getPath());
        }
		
		for (String path: listExcel) {
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheetAt(0);
		FormulaEvaluator formula = wb.getCreationHelper().createFormulaEvaluator();

		ObjectTest testCase = new ObjectTest();
		testCase.setTasks(ReadExcel.getCellValue(sheet.getRow(1).getCell(0),formula).toString());
		testCase.setBoth(Double.parseDouble(ReadExcel.getCellValue(sheet.getRow(2).getCell(15),formula).toString()));
		testCase.setDevTotal(1);	
		testCase.setDevPass(2);
		testCase.setDevFail(2);	
		testCase.setDevBlocked(2); 	
		testCase.setDevNotRun(2); 	
		testCase.setDevToDo(2);
		testCase.setDevProgress(2);
		testCase.setDevRate(2); 
		
		testCase.setQcTotal(2);	
		testCase.setQcPass(2);
		testCase.setQcFail(2);
		testCase.setQcBlocked(2); 	
		testCase.setQcNotRun(2); 	
		testCase.setQcToDo(2);
		testCase.setQcProgress(2);
		testCase.setQcRate(2); 
		
		testCase.setTestQC(2);
		testCase.setTestDev(2); 
	
		listTest.add(testCase);
		wb.close();
		file.close();
		
		}
		
	}
	
	private static Object getCellValue(Cell cell, FormulaEvaluator evaluator) { 
		CellValue cellValue = evaluator.evaluate(cell); 
		switch (cellValue.getCellTypeEnum()) { 
		case BOOLEAN: return cellValue.getBooleanValue(); 
		case NUMERIC: return cellValue.getNumberValue(); 
		case STRING: return cellValue.getStringValue(); 
		case BLANK: return ""; 
		case ERROR: return cellValue.getError(cell.getErrorCellValue()).getStringValue(); 
		
		}
		return cellValue;
	}
	
	public static void WriteExcel() throws IOException {
		
		FileOutputStream file = new FileOutputStream("E:\\Master TestCase\\CELLO_Test_Report_20220117.xlsx", true);
		XSSFWorkbook workbook = new XSSFWorkbook("E:\\Master TestCase\\CELLO_Test_Report_20220117.xlsx");
		XSSFSheet workSheet = workbook.getSheetAt(0);
		XSSFRow row;
		XSSFCell cell;
		
		for(int i= 0; i < listTest.size() ; i++) {
			row = workSheet.createRow(i + 30);
			cell= row.createCell(3);
			cell.setCellValue(i+1);
			
			cell= row.createCell(4);
			cell.setCellValue("Task_" + i);
			
			cell= row.createCell(5);
			cell.setCellValue(listTest.get(i).getTasks());
		
			
			cell= row.createCell(6);
			cell.setCellValue(listTest.get(i).getDevTotal());
			
			cell= row.createCell(30);
			cell.setCellValue(listTest.get(i).getBoth());
		}
		workbook.write(file);
		workbook.close();
		file.close();
	}
	
	public static void main(String[] args) throws IOException {
		ReadExcel();
		System.out.println("writing file");
		WriteExcel();
		System.out.println("Complete");
	}
}
