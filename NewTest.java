package test123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
	WebDriver driver;
	
 @BeforeClass
  public void f() {
	 driver=new ChromeDriver();   
  }
  @BeforeMethod
  public void a() {
	driver.get("https://demo.automationtesting.in/Alerts.html");
	 
	
  }
  @Test (priority=1)
  public void k() {
    SoftAssert sa=new SoftAssert();
	  String actual=driver.getCurrentUrl();
	  String expected="https://demo. automationtesting.in/Alerts.html";
	     
	  driver.findElement(By.linkText("https://static.xx.fbcdn.net/rsrc.php/y1/r/4lCu2zih0ca.svg"));
	  
	  driver.findElement(By.partialLinkText("Facebook"));
	  
	  
	  
	  
	  
	 sa.assertEquals(actual,expected);
	  
	  String actual1=driver.getTitle();
	  String expected1="Alerts";
	   sa.assertEquals(actual1,expected1);
	   System.out.println("hello");
	   sa.assertAll();
  }
  
  
 /* @Test (priority=2)
  public void l() {
	  
	 
	  
	  
  }*/
}
