package test123;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class rundata {
	FirefoxDriver driver= new FirefoxDriver();
	
	
@Test(dataProvider="login")
	public void run(String username,String password){
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();


	}
	@DataProvider(name="login")
	public Object[][] data() {
		Object[][] data=new Object[2][2];
		data[0][0]="bhagya@gmail";
		data[0][1]="bhag123";
		data[1][0]="uti@gmail";
		data[1][1]="utti123";
		return data;
		
	}

}
