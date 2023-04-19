package com.cognizant.login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cognizant {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Sai Iswarya\\Desktop\\msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
        driver.get("https://leafground.com/alert.xhtml;jsessionid=node0100ciwe1d7psowneeyvvghu8t152651.node0");
 
 
 WebElement one = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[1]"));
	one.click();
	Alert alert =driver.switchTo().alert();
	alert.accept();
	WebElement two = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[1]"));
	two.click();
	Alert c =driver.switchTo().alert();
	c.dismiss();
	WebElement three = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]/span[1]"));
	three.click();
	
	WebElement threee = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]/div[1]/a/span"));
	threee.click();
	WebElement four = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[1]"));
	four.click();
	Alert p =driver.switchTo().alert();
	p.sendKeys("namashivaya");
	p.accept();
	WebElement five =driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt106\"]/span[1]"));
	five.click();
	WebElement fivee =driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt108\"]/span[1]"));
	fivee.click();
	WebElement six =driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt111\"]/span[1]"));
	six.click();
	WebElement sixx =driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt112\"]/div[1]/a[3]"));
	sixx.click();
	//WebElement sixxx =driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt112\"]/div[1]/a[1]/span"));
	//sixxx.click();
	
	}
}
