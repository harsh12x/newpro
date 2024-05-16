package test123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data {
	
	WebDriver driver;
	public void setting() {
		FirefoxDriver driver= new FirefoxDriver();
	}
	
	
	
	@Test(dataProvider="logindata")
	public void logindataverify(String username, String password) {
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
	driver.quit();
	}
	@DataProvider(name="logindata")
	public Object[][] data() {
		Object [][] datapro=new Object[2][2];
		datapro[0][0]="harshada";
		datapro[0][1]="hart123";
		
		datapro[1][0]="jhani";
		datapro[1][1]="harshada";
		 return datapro;
		
	}
	
	
	
	
	

}
