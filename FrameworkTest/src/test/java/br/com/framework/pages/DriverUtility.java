package br.com.framework.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverUtility {

//	private WebDriver driver;
//	WebDriverManager.chromedriver().setup();
//	ChromeOptions options = new ChromeOptions();
//	options.addArguments("--no-sandbox");
//	options.addArguments("--disable-dev-shm-usage");
//	options.addArguments("--headless");
//	driver = new ChromeDriver(options);
//	driver.navigate().to("https://www.google.com");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(120, TimeUnit.MILLISECONDS);
	WebDriver driver;

	public WebDriver navegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}

}
