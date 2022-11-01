package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {

		@FindBy(how=How.XPATH,using="//input[@name='email']")
		private WebElement email;
		
		@FindBy(how=How.XPATH,using="//input[@name='pass']")
		private WebElement password;
		
		@FindBy(how=How.XPATH,using="//button[@name='login']")
		private WebElement Btnlogin;

		//Generate Getter setter methods
		public WebElement getEmail() {
			return email;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getBtnlogin() {
			return Btnlogin;
		}

	}


