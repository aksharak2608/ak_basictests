package testngex;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;

public class exceldata {
  @Test
  public void f() {
	  
	  File src= new File("D:\\EAI\\workspace\\Ak_java\\TestData\\abc.properties");
	  try {
		FileInputStream fis= new FileInputStream(src);
		Properties pr= new Properties();
		pr.load(fis);
	
			System.out.println(pr.get("data1"));

			System.out.println(pr.get("data2"));
			System.out.println(pr.get("data3"));
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
	  
	  
	  
	  
	  
  }
  
  public void beforeTest() {
	  try {
		
		XSSFSheet sh=new XSSFWorkbook(new FileInputStream(new File("D:\\EAI\\workspace\\Ak_java\\TestData\\firstexcel.xlsx"))).getSheet("test data");
	
		for(int i=0;i<=sh.getLastRowNum();i++)
		{

		for(int j=0;j<sh.getRow(i).getPhysicalNumberOfCells();j++)
		{
		System.out.println(sh.getRow(i).getCell(j));
		
		}
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }

}
