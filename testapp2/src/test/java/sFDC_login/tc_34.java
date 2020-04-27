package sFDC_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testapp2.page_load;

public class tc_34 extends page_load{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launch_browser("ch");
		String u=url();
		driver.get(u);
		Thread.sleep(1000);
		//--//a[contains(text(),'Login')]
		WebElement log=driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		waitElement(log);
		log.click();
		Thread.sleep(1000);
		WebElement user=driver.findElement(By.xpath("//input[@id='username']"));
		waitElement(user);
		user.clear();
		String user1=valid_user();
		user.sendKeys(user1);
		Thread.sleep(1000);
		//--//input[@id='password']
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		pwd.clear();
		String p=password();
		pwd.sendKeys(p);
		Thread.sleep(1000);
		//--//input[@id='rememberUn']
		/*WebElement remember=driver.findElement(By.xpath("//input[@id='rememberUn']"));
		remember.click();;
		Thread.sleep(1000);*/
				//--//input[@id='Login']
				WebElement login_button=driver.findElement(By.xpath("//input[@id='Login']"));
				login_button.click();
				//user();
				Thread.sleep(3000);
				//--//a[contains(text(),'Remind Me Later')]
				WebElement remind_button=driver.findElement(By.xpath("//a[contains(text(),'Remind Me Later')]"));
				waitElement(remind_button);
				remind_button.click();
				//--//a[contains(text(),'Home')]
				WebElement home=driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
				home.click();
				Thread.sleep(1000);
				driver.findElement(By.id("tryLexDialogX")).click();
				//---//a[contains(text(),'laxmi RR')]
				WebElement name=driver.findElement(By.xpath("//a[contains(text(),'laxmi RR')]"));
				name.click();
				
				//--(//img[@title='Edit Profile'])[1]
				WebElement edit=driver.findElement(By.xpath("(//img[@title='Edit Profile'])[1]"));
				waitElement(edit);
				edit.click();
				Thread.sleep(1000);
				//--//iframe[@id='contactInfoContentId']
				driver.switchTo().frame("contactInfoContentId");
				//-=-//a[contains(text(),'About')]
				WebElement about=driver.findElement(By.xpath("//a[contains(text(),'About')]"));
				about.click();
				//--//input[@id='lastName']
				WebElement ln=driver.findElement(By.xpath("//input[@id='lastName']"));
				ln.clear();
				ln.sendKeys("Abcd");
				//--//input[@value='Save All']
				WebElement sa=driver.findElement(By.xpath("//input[@value='Save All']"));
				sa.click();
				Thread.sleep(1000);
				
				driver.quit();
	}

}
