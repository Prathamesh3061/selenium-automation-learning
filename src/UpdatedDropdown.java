import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(5000);
		
//		required to click 4 times
		for(int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();  //hrefIncAdt
		}
		
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		// count the number of check boxes
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		

	}

}
