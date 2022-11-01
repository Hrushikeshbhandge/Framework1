package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test1 extends BaseClass{

	@Test
	public void VerifyFBlogin() {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		
//		login.getEmail().sendKeys("Hrushi@gmail.com");
//		login.getPassword().sendKeys("94242");
//		login.getBtnlogin().click();
//		
		
		Library.custom_sendkeys(login.getEmail(),"Hrushi@gmail.com");
		Library.custom_sendkeys(login.getPassword(),"94242");
		Library.custom_sendkeys(login.getBtnlogin(),"Btnlogin");
		
		//verify
		String title=driver.getTitle();
		String ExpectedTitle="Facebook";
		
		Assert.assertEquals(title,ExpectedTitle);

	}

}
