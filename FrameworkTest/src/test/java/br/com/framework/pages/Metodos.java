package br.com.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Metodos {

	WebDriver driver;
	
	public void navegador(String url, String navegador) {
		 if(navegador=="CHROME"|| navegador=="FIREFOX") {
			 switch (navegador) {
			 case "CHROME":
				 System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32");
					driver = new ChromeDriver();
					driver.get(url);
					driver.manage().window().maximize();
					break;
			 case "FIREFOX":
					System.setProperty("webdriver.gecko.driver","C:\\drivers\\geckodriver-v0.27.0-win64");
					driver = new FirefoxDriver();
					driver.get(url);
					driver.manage().window().maximize();
					break;
				}
			} else {
				System.out.println("Opçao invalida");
			 }
	}
	
}
