package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;




public class CreateAccount {
	int ofseconds=10;

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Deepika.D");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		WebElement sourceDrop = driver.findElement(By.name("industryEnumId"));
		Select dropdown=new Select(sourceDrop);
		dropdown.selectByValue("IND_SOFTWARE");
		
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
		Select ownershi=new Select(ownership);
		ownershi.selectByVisibleText("S-Corporation");
		
		WebElement source=driver.findElement(By.id("dataSourceId"));
		Select Sourceemp=new Select(source);
		Sourceemp.selectByValue("LEAD_EMPLOYEE");

		WebElement campaign =driver.findElement(By.id("marketingCampaignId"));
		Select marketingcampaign=new Select(campaign);
		marketingcampaign.selectByIndex(6);
		
		WebElement state=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select province=new Select(state);
		province.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10L));
		WebElement accountNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("tabletext")));
		
		String actualAccountName = accountNameElement.getText();
		Assert.assertEquals(actualAccountName, "accountNameElement", "Account name verification Passed!");
	}

}
