package org.Myntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopping {
	
	public static void main(String[] args) {
		
		System.setProperty("Webdriver", "D:\\Eclipse\\Workspace1\\SeleniumAdactinHotelapp\\Drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=EAIaIQobChMIrvTw-LqI_wIVEXF9Ch230QCYEAAYASAAEgL8e_D_BwE");
		driver.manage().window().maximize();
		
		
	
	
	
	
	
	}

}
