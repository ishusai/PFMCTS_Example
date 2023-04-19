package com.cognizant.login;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class framesClass {


		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai Iswarya\\Desktop\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://leafground.com/select.xhtml;jsessionid=node01sp8k6sjajtl27c0713mzkebv206530.node0");
	        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
	        Select select = new Select(dropdown);
	               // select.selectByVisibleText("Option 2");
	                List<WebElement> options = select.getOptions();
	                Collections.sort(options, (a, b) -> a.getText().compareToIgnoreCase(b.getText()));
	                for (WebElement option : options) {
	                    System.out.println(option.getText());
	            }
	        }

			
		}
		
