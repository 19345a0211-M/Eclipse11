package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {

	public static void main(String[] args) {
		//1.open the Browser
		ChromeDriver driver = new ChromeDriver();
		
		//2.Navigate to application
		driver .get("https://facebook.com");
		
		//3.Enter invalid username
		driver.findElement(By.id("email")).sendKeys("91007620181");
		
		//4.Enter invalid password
		driver.findElement(By.id("pass")).sendKeys("zxcvbnm12345");
		
		//5.Click on login button
		driver.findElement(By.name("login")).click();
		
		//6 Verify user see error message
		String expectedErrMsg = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		String actualErrMsg = driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText();
		
		if (expectedErrMsg.equals(actualErrMsg)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		//7. close the browser
		driver.quit();

	}

}
