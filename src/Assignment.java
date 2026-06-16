import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
//		System.out.println(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='option1']")).click();
//		System.out.println(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
