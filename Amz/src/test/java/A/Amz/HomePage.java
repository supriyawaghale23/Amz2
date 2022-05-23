package A.Amz;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePage extends Base1{
	@Test
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(priority=1)
	public void search()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("The lost world by arthur conan doyle");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}
	
	@Test(priority=2)
	public void click()
	{
		WebElement ele=driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[4]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
		ele.click();
	}
	
	

}
