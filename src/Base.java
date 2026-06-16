import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
//		explicitly wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		// here we use implicitylywait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String[] itemsNeeded = {"Cucumber","Brocolli","Carrot"};
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
//		Thread.sleep(4000);		
		
		addItems(driver,itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahul shettyacademy");
		
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		
	}

	
	public static void addItems(WebDriver driver, String[] itemsNeeded) {
			
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	
	int j = 0;
			
			for(int i = 0; i < products.size(); i++) {
				
				//cucumber - 1kg
				//brocolli 1 kg
				
				String[]  name = products.get(i).getText().split("-"); // format it to get actual vegetable name
				String formattedName = name[0].trim();
	//			convert array into array list for easy search
	//			check whether name you extracted is present in arrayList or not
				
				List itemsNeededList = Arrays.asList(itemsNeeded);
				
				if(itemsNeededList.contains(formattedName)) {
					j++;
	//				click on the cart
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
	//				break; we can not use break here because here we use multiple elements
					
					if(j==itemsNeeded.length) {
						break;
					}
				}
			
		}
	}
}
