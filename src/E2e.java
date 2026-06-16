import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class E2e {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("div[id='ctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='MAA']"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-active']")).click();

		driver.findElement(By.id("divpaxinfo")).click();

//		here we see retrun date which is not enable for onway, let see how to check

		if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5")) {
			System.out.println("Its disabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		Thread.sleep(2000);

		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(2000);
		driver.close();

	}
}
