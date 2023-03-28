package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_12_AppleVacations_GetTitleAndURL {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://www.applevacations.com/#!/");
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		//driver.findElement(By.id("accessible-megamenu-1679433841132-32")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/header/div[1]/div/div[1]/div/div[2]/nav/ul/li[2]/a"))
		.click();
Thread.sleep(2000);
driver.findElement(
		By.xpath("/html/body/div[2]/div/header/div[1]/div/div[1]/div/div[2]/nav/ul/li[2]/ul/li[3]/a")).click();
Thread.sleep(2000);
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
	}

}
