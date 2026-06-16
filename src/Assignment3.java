import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		// how to apply implicitly timeout 
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// get the website
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//maxmize the window.
		driver.manage().window().maximize();
		
		// Enter username and password
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("Learning@830$3mK2");
		
//		how to select radio button
		driver.findElement(By.cssSelector("input[value='user']")).click();

		// apply explecitly wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		
//		click on okay button
		driver.findElement(By.id("okayBtn")).click();
		
		
//		how to slect option from static dropdown list
		WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(options);
		dropdown.selectByValue("consult");
		
		//agree terms and conditions checkbox
		driver.findElement(By.id("terms")).click();
		
		// click on signInBtn .
		driver.findElement(By.id("signInBtn")).click();
		
		// how click elements present in the window( we want select all elements)
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for(int i =0;i<products.size();i++)

		{

		products.get(i).click();

		}

		driver.findElement(By.partialLinkText("Checkout")).click();
		
		
	}

}


//how to handle dynamic dropdowns 
//		List<WebElement> options = driver.findElements(By.xpath("//li"));
//		for(WebElement option : options){
//		    if(option.getText().equals("India")){
//		        option.click();
//		        break;
//		    }
//		}
