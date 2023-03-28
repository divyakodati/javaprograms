package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assig8 {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://blazedemo.com/");
		new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Portland");
		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("London");
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input")).click();
		driver.findElement(By.id("inputName")).sendKeys("divya");
		driver.findElement(By.id("address")).sendKeys("razole");
		driver.findElement(By.id("city")).sendKeys("razole");
		driver.findElement(By.id("state")).sendKeys("ap");
		driver.findElement(By.id("zipCode")).sendKeys("533242");
		new Select(driver.findElement(By.name("cardType"))).selectByVisibleText("American Express");
		driver.findElement(By.id("creditCardNumber")).sendKeys("9876543212");
		driver.findElement(By.id("creditCardMonth")).sendKeys("5");
		driver.findElement(By.id("creditCardYear")).sendKeys("2025");
		driver.findElement(By.id("nameOnCard")).sendKeys("divya");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		
  }
}
