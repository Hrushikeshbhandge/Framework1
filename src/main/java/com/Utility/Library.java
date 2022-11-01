package com.Utility;

import org.openqa.selenium.WebElement;

public class Library {

	public static void custom_sendkeys(WebElement element,String value) {
		try {
			element.sendKeys(value);
		}
		catch(Exception d) {
			System.out.println(d.getMessage());
		}
	}
   
	
	public static void custom_click(WebElement element,String value) {
		try {
			element.click();
		}
		catch(Exception d) {
			System.out.println(d.getMessage());
		}
	}
}
