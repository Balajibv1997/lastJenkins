package Tc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mousehover {
	@Test
	public void mou() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement resource = driver.findElement(By.xpath("//a[@id='navbarPages']"));
		Actions a=new Actions(driver);
		a.moveToElement(resource).perform();
		
	}
	}


