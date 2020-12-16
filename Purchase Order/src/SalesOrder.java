import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SalesOrder {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin1\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://system.netsuite.com/pages/customerlogin.jsp");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("sravan.k@tvarana.com");;
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Tvarana@2020");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		String s1="What school did you attend for sixth grade?" , s2="What is the middle name of your oldest child?",s3="In what city or town was your first job?";		
        String  authans=driver.findElement(By.xpath("//td[@class='smalltextnolink']/following-sibling::td")).getText();
        if(authans.equals(s1)||authans.equals(s2)||authans.equals(s3))
        {
        	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("job");
        	driver.findElement(By.xpath("//input[@type='submit']")).click();
        }
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//span[text()='Transactions']"))).perform();
        Thread.sleep(2000);
        a.moveToElement(driver.findElement(By.xpath("//span[text()='Sales']"))).perform();
        Thread.sleep(2000);
        a.moveToElement(driver.findElement(By.xpath("//span[text()='Enter Sales Orders']"))).perform();
        
 }

}
