package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import dev.failsafe.internal.util.Assert;

public class CreateLeadFunctionality {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LTTS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deepika");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Deenan");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestLeaf");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
	}

}
