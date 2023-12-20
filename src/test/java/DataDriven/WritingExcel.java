package DataDriven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new EdgeDriver();
		Scanner sc=new Scanner(System.in);
		FileOutputStream File=new FileOutputStream("C:\\\\Users\\\\LENOVO\\\\eclipse-workspace\\\\Cucumber2\\TestData\\output.xlsx");
		XSSFWorkbook Workbook=new XSSFWorkbook();
		XSSFSheet Sheet= Workbook.createSheet();
		
		
		for(int r=0;r<3;r++)
		{


		XSSFRow Currentrow=Sheet.createRow(r);
		for(int c=0;c<3;c++)
		{
			System.out.println("Enter Value:");
			String value=sc.next();
			Currentrow.createCell(c).setCellValue(value);
		}
	}
		Workbook.write(File);
		Workbook.close();
		File.close();



	}

}
