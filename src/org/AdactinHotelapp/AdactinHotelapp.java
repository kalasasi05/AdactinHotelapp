package org.AdactinHotelapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotelapp {
	
	public static void main(String[] args) {

		System.setProperty("webdriver", "D:\\Eclipse\\Workspace1\\SeleniumGreenss\\Drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.name("username"));
		name.sendKeys("Sasikala");
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Sasi@1423");
		
		WebElement Login = driver.findElement(By.name("login"));
		Login.click();
	}

}
