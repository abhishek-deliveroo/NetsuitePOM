import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class InventoryCount {
    @Test
	public void main() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin1\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://system.netsuite.com/pages/customerlogin.jsp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("abhishek.dutta@tvarana.com");;
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Entally2004$");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		String s1="What school did you attend for sixth grade?" , s2="What is the middle name of your oldest child?",s3="In what city or town was your first job?";		
        String  authans=driver.findElement(By.xpath("//td[@class='smalltextnolink']/following-sibling::td")).getText();
        if(authans.equals(s1)||authans.equals(s2)||authans.equals(s3))
        {
        	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("grade");
        	driver.findElement(By.xpath("//input[@type='submit']")).click();
        }
       
    	Thread.sleep(3000);
        WebElement Arr = driver.findElement(By.xpath("//div[@class='ns-role']/span"));
        Actions a = new Actions(driver);
  		a.moveToElement(Arr).perform();
        WebElement Role = driver.findElement(By.xpath("//span[text()='Tvarana Dev Production  -  Administrator']"));
        Thread.sleep(2000);
		Role.click();
		Thread.sleep(4000);
		driver.get("https://tstdrv939179-rp.app.netsuite.com/app/site/hosting/scriptlet.nl?script=301&deploy=2&compid=TSTDRV939179_RP&whence=");
		driver.findElement(By.xpath("//a[text()='View']")).click();
		Thread.sleep(3000);
		WebElement AddSerialNos= driver.findElement(By.xpath("//a[text()='Add Serial Numbers']/parent::span/parent::span/following-sibling::span"));
		String s =AddSerialNos.getText().trim(); 
		System.out.println(s);
		
		/*
		 * WebElement
		 * InvCount=driver.findElement(By.xpath("//span[text()='Inventory Count']"));
		 * a.moveToElement(InvCount).perform(); Thread.sleep(2000); WebElement
		 * InvCount1=driver.findElement(By.
		 * xpath("//li[@id='ns-header-menu-main-item19']/a/span[text()='Inventory Count']"
		 * )); a.moveToElement(InvCount1).perform(); Thread.sleep(3000); WebElement
		 * ItemScan=driver.findElement(By.xpath("//span[text()='Item Scanning']"));
		 * a.moveToElement(ItemScan).click().perform();
		 */
		

	}

}
