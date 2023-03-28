package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_13_1_GetHyperLinks {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(3000);
		
		java.util.List<WebElement> abc=driver.findElements(By.tagName("a"));
		System.out.println("print the hyperlink count:" +abc.size());
		
		//for loop
				for (int i = 0; i < +abc.size(); i++) {
					System.out.println(abc.get(i).getText());

	}

}
}