import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsclass {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\akshay\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("vaibhavrajkumarpatil@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Vaibhav@2803");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
		Actions A=new Actions(driver);
		for(int i=0;i<3;i++) {
		A.sendKeys(Keys.ARROW_DOWN).perform();
		}
		WebElement W=driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[4]/div/a"));
		A.click(W).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div/ul/li[1]/div/div[1]/div/div[2]/div[1]")).click();
		
		
		
		
		
		

	}

}
