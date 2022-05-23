package A.Amz;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1 {
	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException{
	
		Properties p= new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Amz\\src\\main\\java\\A\\Amz\\data.properties");
		p.load(file);
         String s=p.getProperty("browser");
         if(s.equals("chrome"))
         {
        	 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\chromedriver.exe");
             driver=new ChromeDriver();
             
         }
		return driver;
         
	}

}

