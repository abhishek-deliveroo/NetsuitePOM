import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class ExpenseReport 
{
	@Test(priority=1)
	public void createExpenseReport_GBP() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin1\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://system.netsuite.com/pages/customerlogin.jsp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("abhishek.duttaPOSubmitter@tvarana.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Entally2006");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		String s1="What school did you attend for sixth grade?" , s2="What is the middle name of your oldest child?",s3="In what city or town was your first job?";		
        String  authans=driver.findElement(By.xpath("//td[@class='smalltextnolink']/following-sibling::td")).getText();
        if(authans.equals(s1)||authans.equals(s2)||authans.equals(s3))
        {
        	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("job");
        	driver.findElement(By.xpath("//input[@type='submit']")).click();
        }
        driver.findElement(By.xpath("//a[text()='Enter Expense Report']")).click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        driver.findElement(By.xpath("//tr/td[3]/div[@class='listinlinefocusedrowcell']")).click();
        driver.findElement(By.xpath("//input[@name='inpt_category']")).sendKeys("ACCOMODATION");
        
        WebElement Amount = driver.findElement(By.xpath("//tr/td[7]/div[@class='listinlinefocusedrowcell']"));
        js.executeScript("arguments[0].click();",Amount);
        driver.findElement(By.xpath("//input[@id='amount_formattedValue']")).sendKeys("120");
        
        Thread.sleep(2000);
        WebElement Currency_label =driver.findElement(By.xpath("//tr/td[5]/div[@class='listinlinefocusedrowcell']"));
        js.executeScript("arguments[0].click();",Currency_label);
        WebElement Currency_input= driver.findElement(By.xpath("//input[@name='inpt_currency']"));
		Actions a = new Actions(driver);
		a.moveToElement(Currency_input).sendKeys("British pound").perform();
        /*
		 * for (WebElement e:Currency_input)
		 * if(e.getText().toString().equals("British pound")) {e.click();} else
		 * {System.out.println("Not Selected");}
		 */
        
        //js.executeScript("document.getElementById('inpt_currency3').value='British pound';");
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='expense_addedit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='btn_secondarymultibutton_submitter']")).click();
        
        driver.close();
   }
	
	@Test(priority=2)
	public void createExpenseReport_Other() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin1\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://system.netsuite.com/pages/customerlogin.jsp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("abhishek.duttaPOSubmitter@tvarana.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Entally2006");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		String s1="What school did you attend for sixth grade?" , s2="What is the middle name of your oldest child?",s3="In what city or town was your first job?";		
        String  authans=driver.findElement(By.xpath("//td[@class='smalltextnolink']/following-sibling::td")).getText();
        if(authans.equals(s1)||authans.equals(s2)||authans.equals(s3))
        {
        	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("job");
        	driver.findElement(By.xpath("//input[@type='submit']")).click();
        }
        driver.findElement(By.xpath("//a[text()='Enter Expense Report']")).click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        driver.findElement(By.xpath("//tr/td[3]/div[@class='listinlinefocusedrowcell']")).click();
        driver.findElement(By.xpath("//input[@name='inpt_category']")).sendKeys("ACCOMODATION");
        
        WebElement Amount = driver.findElement(By.xpath("//tr/td[7]/div[@class='listinlinefocusedrowcell']"));
        js.executeScript("arguments[0].click();",Amount);
        driver.findElement(By.xpath("//input[@id='amount_formattedValue']")).sendKeys("120");
        
        Thread.sleep(2000);
        WebElement Currency_label =driver.findElement(By.xpath("//tr/td[5]/div[@class='listinlinefocusedrowcell']"));
        js.executeScript("arguments[0].click();",Currency_label);
        WebElement Currency_input= driver.findElement(By.xpath("//input[@name='inpt_currency']"));
		Actions a = new Actions(driver);
		a.moveToElement(Currency_input).sendKeys("Rupee").perform();
        /*
		 * for (WebElement e:Currency_input)
		 * if(e.getText().toString().equals("British pound")) {e.click();} else
		 * {System.out.println("Not Selected");}
		 */
        
        //js.executeScript("document.getElementById('inpt_currency3').value='British pound';");
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='expense_addedit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='btn_secondarymultibutton_submitter']")).click();
        
        driver.close();
   }
	@Test(priority=3)
	public void createPOReport() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin1\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://system.netsuite.com/pages/customerlogin.jsp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("abhishek.duttaPOSubmitter@tvarana.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Entally2006");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		String s1="What was your childhood nickname?" , s2="What is the middle name of your oldest child?",s3="In what city did you meet your spouse/significant other?";		
        String  authans=driver.findElement(By.xpath("//td[@class='smalltextnolink']/following-sibling::td")).getText();
        if(authans.equals(s1)||authans.equals(s2)||authans.equals(s3))
        {
        	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("other");
        	driver.findElement(By.xpath("//input[@type='submit']")).click();
        }
        driver.findElement(By.xpath("//a[text()='Enter Purchase Request']")).click();
        Actions a = new Actions(driver);
        WebElement Vendor = driver.findElement(By.xpath("//input[@id='entity_display']"));
        
        driver.findElement(By.xpath("//span[@id='parent_actionbuttons_entity_fs']/a[2]")).click();
        driver.findElement(By.xpath("//a[@id='entity_popup_list']")).click();
        WebDriverWait w = new WebDriverWait(driver,12);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@uir-multiselect-id='58644']/td[2]/a")));
        driver.findElement(By.xpath("//tr[@uir-multiselect-id='58644']/td[2]/a")).click();
        
        driver.findElement(By.xpath("//input[@name='inpt_category']")).sendKeys("ACCOMODATION");
        Thread.sleep(5000);
        WebElement Category = driver.findElement(By.xpath("//input[@name='inpt_category']"));
        Category.sendKeys("ACCOMODATION");
        Thread.sleep(2000);
        //WebElement Amount = driver.findElement(By.xpath("//tr[@class='uir-machine-row uir-machine-row-odd listtextnonedit uir-machine-row-focused']/td[2]/div"));
        a.moveToElement(Category).sendKeys(Keys.TAB).sendKeys("120").perform();
        Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='expense_addedit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='btn_secondarymultibutton_submitter']")).click();
        
}
	
	@Test(priority=4)
	public void createSalesReport() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin1\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://system.netsuite.com/pages/customerlogin.jsp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("abhishek.dutta@deliveroo.co.uk");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Deliveroo@2020!");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		Actions a = new Actions(driver);
		WebElement Transaction = driver.findElement(By.xpath("//span[text()='Transactions']"));
		WebElement Sales= driver.findElement(By.xpath("//span[text()='Sales']"));
		WebElement SalesOrder=driver.findElement(By.xpath("Enter Sales Orders"));
        a.moveToElement(Transaction).pause(2000).moveToElement(Sales).pause(2000).moveToElement(SalesOrder).click();
	}
}


