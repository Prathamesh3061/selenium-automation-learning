import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Invoking Browser
//		chrome - chromeDriver exten - Methods close get
//		Firefox - Firefox -> methods close get
//		safari SarriDriver -> methods close get
//		WebDriver methods + class Methods
		
//		chromedriver.exe -> Chrome browser
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://economictimes.indiatimes.com/news/age-calculator");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
		
		
//		webdriver.geeko.driver
//		FirefoxDriver driver = new FirefoxDriver();
//		remaining step as it is to driver.close()
		
		
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\edgedriver_win64.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://economictimes.indiatimes.com/news/age-calculator");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
		

	}

}
