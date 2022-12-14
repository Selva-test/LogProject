package org.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmployeeDetails { //Class name

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\NewProject\\Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
//		driver.navigate().back();
//		driver.navigate().forward();
	
//		driver.getTitle()
//		driver.
		
//		navigators
//		alert    https://demo.automationtesting.in/Alerts.html
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
//		driver.
		
		
}
}