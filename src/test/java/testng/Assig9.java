package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Assig9 {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://www.justrechargeit.com/");
		driver.findElement(By.id("signup-link9")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("signup_name")).sendKeys("divya");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
  }
}
