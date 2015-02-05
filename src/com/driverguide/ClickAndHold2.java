package com.driverguide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("C:\\Users\\Anwara Begum\\Desktop\\8850OS_Code\\Chapter 2\\HTML\\Sortable.html");
		WebElement three = driver.findElement(By.name("three"));
		//WebElement two = driver.findElement(By.name("two"));
		//move tiles to the position of tile2 
		Actions builder = new Actions(driver);
		builder.moveToElement(three)
		.clickAndHold()
		.moveByOffset(120, 0)
		.release()
		.perform();
	}

}
