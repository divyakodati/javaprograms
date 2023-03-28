package myPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindHyperLinksCount {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//System.out.println(driver.findElement(By.linkText("Gmail")).getText());
		
		List<WebElement> abc=driver.findElements(By.tagName("a"));
		System.out.println("print the hyperlink count:" +abc.size());
		
		//for loop
//		for (int i = 0; i < +abc.size(); i++) {
//			System.out.println(abc.get(i).getText());
//		
			//print list by using advanced for loop/for each/enhance for loop
			for(WebElement xyz : abc)
			System.out.println(xyz.getText());
			
		}
		
		

	}


