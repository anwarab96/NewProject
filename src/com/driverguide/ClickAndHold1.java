package com.driverguide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.packtpub.com/all");
		WebElement seven = driver.findElement(By.cssSelector(".book-block-one-liner.ellipsis>div"));
		WebElement eight = driver.findElement(By.cssSelector(".book-block-one-liner.ellipsis>div"));
		//move tiles to the position of tile2 
		Actions builder = new Actions(driver);
		builder.clickAndHold(eight)
		.release(seven)
		.perform();

	}

}
