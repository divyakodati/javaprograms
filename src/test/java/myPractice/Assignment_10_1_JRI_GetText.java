package myPractice;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment_10_1_JRI_GetText {

	public static void main(String[] args) throws Exception {
		WebDriver Driver;
		Driver=new EdgeDriver();
		Driver.get("https://www.justrechargeit.com/SignIn.aspx");
		Thread.sleep(3000);
		Driver.findElement(By.id("imgbtnSignin")).click();
		Thread.sleep(3000);
		System.out.println(Driver.findElement(By.id("MessageCaption2")).getText());

	}

}
