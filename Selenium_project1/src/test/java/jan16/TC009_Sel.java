package jan16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TC009_Sel {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		File f1 = new File("C:\\Users\\omkar.gole\\eclipse-workspace\\Selenium_project1\\inputdata.xlsx");

  
		FileInputStream fis = new FileInputStream(f1);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Row Count: "+rowCount);
		String [][] data = new String [3][2];
		for(int i= 0;i < rowCount;i++)
		{
			data[i][0] = sheet.getRow(i).getCell(0).getStringCellValue();
			data[i][1] = sheet.getRow(i).getCell(1).getStringCellValue();
			String uname = data[i][0];
			String pwd = data[i][1];
			System.out.println("Username: "+uname);
			System.out.println("Password: "+pwd);
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.opencart.com/index.php?route=account/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
			
			
		}
     
	}

}
