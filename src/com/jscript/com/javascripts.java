package com.jscript.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascripts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRBTHAMIZH\\eclipse-workspace\\JavaScript\\driver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("https://www.amazon.in/");
		   //Thread.sleep(5000);
		   WebElement elements = driver.findElement(By.xpath("(//img[@class='product-image'])[6]"));
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].scrollIntoView();", elements);
		  /*js.executeScript("window.scrollBy(0,3000)", "");
		   Thread.sleep(2000);
		   js.executeScript("window.scrollBy(0,-3000)", ""); */
		 /*  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		   Thread.sleep(3000);
		   js.executeScript("window.scroll(0,0)"); */
	}

}
