package br.com.framework.runner;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import br.com.framework.pages.DriverUtility;

public class Runner {

	private static String url = "https://www.google.com/";
	
	private static WebDriver driver;
	private static DriverUtility driverUtility;
	
	
	@Test
	public void test() throws InterruptedException {
		driverUtility = new DriverUtility();
		driver = driverUtility.navegador(url);
		Thread.sleep(10000);
		driver.quit();
	}
	
}
