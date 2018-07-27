package by.htp.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.mail.yandex.ru");
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"index-page-container\"]/div/div[2]/div/div/div[4]/a[2]"));
		element.click();

	}

}
