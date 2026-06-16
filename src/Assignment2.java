import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Prathamesh");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("prathameshsawant211@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Pass123");
		Thread.sleep(2000);
		driver.findElement(By.id("exampleCheck1")).click();
		Thread.sleep(2000);
//		static dropdown
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select gender = new Select(dropdown);
		gender.selectByIndex(0); 
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("select[id='exampleFormControlSelect1'] [1]")).click();
		driver.findElement(By.cssSelector("input[value='option1'")).click();
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("02112002");
		Thread.sleep(2000);
		
		driver.findElement(By.className("btn-success")).click();
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
	}

}
