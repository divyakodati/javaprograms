package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_11_Rio_GetAttribute {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://app.riamoneytransfer.com/en-us/");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section[1]/div/div/div[2]/div/div/form/div[1]/div/div/div/div")));

	}

}
