package myPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_14_addition {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://phptravels.com/demo/");
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("divya");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("kodati");
		
		
		WebElement ab=driver.findElement(By.xpath("//*[@id='numb1']"));
		WebElement bc=driver.findElement(By.xpath("//*[@id='numb2']"));
		
		ab.get
		
		
		

	}

}
