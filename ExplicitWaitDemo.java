package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		//1.Open the browser
		ChromeDriver driver =new ChromeDriver();
		
		//2.Maximize it
		driver.manage().window().maximize();
		
		//3.Navigate to application 
		driver.get("https://whitecircleschool.com/explicit-wait-demo1/");
		
		//4.Click on 'Start' button
		driver.findElement(By.id("start")).click();
		
		//5.Verify the text 'HELLOWORLD!' appear on the web page
		String expectedText = "Hello World!";
		
		//Wait for the text to appear
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(60));//wait for max time 60 sec.
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finesh > h4")));
		
		String actualText = driver.findElement(By.cssSelector("#finesh > h4")).getText();
		if(actualText.equals(expectedText)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		 
		//6.Quit the Browser
		driver.quit();
				
	}

}
