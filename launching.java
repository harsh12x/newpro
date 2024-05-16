package test123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class launching {

	WebDriver driver;//empty
	//@Parameters("browsername")
	@Test

		public void sert() {
		WebDriver driver= new ChromeDriver();//new
		
	}
		
	@Parameters("urltorun")	
	
	@Test
public void zaunch(@Optional String urltorun) {
		driver.get(urltorun);
		
		
			
	}
	
	
	
	
	
	
	
}
