package Tc;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class amezoncls {
	

	
	@Test
	public void openAzon() throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung phone")   ;
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> phones = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		 
		
		   List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']/ancestor::div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/descendant::span[@class=\"a-price\"]"));
		int count=price.size();
		for(int i=0;i<count;i++) {
		System.out.println(phones.get(i).getText()+"==========>"+price.get(i).getText());
		}
	}
	
	

	}


