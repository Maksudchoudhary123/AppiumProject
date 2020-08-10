package practise.AppiumFramework;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.time.Duration;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import pageObjects.NoBrokerHomePage;
import pageObjects.PropertyPage;


public class NoBroker extends NoBrokerBase {
	
	@BeforeTest
	public void killAllNodes() throws IOException, InterruptedException
	{
	//taskkill /F /IM node.exe
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);
		
	}
	
	@Test
	public void noBrokerApp() throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		service=startServer();
		AndroidDriver<AndroidElement> driver = Capabilities("NoBrokerApp");

		NoBrokerHomePage home = new NoBrokerHomePage(driver);
		PropertyPage property = new PropertyPage(driver);
		Utilities util = new Utilities(driver);
		
		util.webdriverwait(home.getcontinue(), 20).click();

		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
		if(home.getdeny().isDisplayed()) {
			home.getdeny().click();
		}
		if(home.getdeny().isDisplayed()) {
			home.getdeny().click();
		}
		if(home.getdeny().isDisplayed()) {
			home.getdeny().click();
		}
		}catch(Exception e) {
			System.out.println("Pop is not available");
		}
		home.getbuy().click();
		home.getsearchtextbox().click();
		
		
		//Clicking on dropdown of city
		home.getcitySelection().click();
		util.scrollToText("Bangalore").click();
	
		
		WebElement element = home.getlocality();
		element.sendKeys("Bellandur");
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
		Thread.sleep(6000);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(3000);
		element.sendKeys("hsr layout");
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
		Thread.sleep(5000);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));

			Thread.sleep(4000);
		

		
		home.getlocality().sendKeys("Marathahalli");
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));

			Thread.sleep(4000);
		home.getnearbyproperties().click();
		
		home.gettwobhk().click();
		home.getthreebhk().click();
		
		home.getsearchproperty().click();
		
		util.webdriverwaitby(property.getpropertypage(), 30);
		Thread.sleep(4000);
		
		util.scrollTo();
		util.scrollTo();
		util.scrollTo();
		
		property.getpropertyselection().get(0).click();
		Thread.sleep(3000);
		
		
		
		while(!((property.getpropertyvalues()).size()==0)) {
		util.scrollTo();
		try {
			if(util.scrollToText("Similar Properties").isDisplayed()) {
				util.scrollToText("Wrong Info").click();
				break;
			}
			
		}catch(Exception e) {
			
		}
		
		}
		
	property.getsignmobileno().sendKeys("8698903544");

	util.webdriverwait(property.getsignpwd(), 30).click();

		Thread.sleep(3000);

		property.getpwd().sendKeys("Nobroker@123");
		property.getsignupclick().click();


		List<AndroidElement> value = property.getwhatswrongcheckbox();
		for(int i=0;i<value.size(); i++) {
			value.get(i).click();
		}

		property.getreportbutton().click();

		util.scrollToText("3 BHK").click();
		util.androiduiautomartext("4 BHK").click();

		util.scrollTo();
		property.getnote().sendKeys("BHK size was wrong");
		property.getsavechanges().click();
		
		util.webdriverwaitvisibility(30);
		Assert.assertEquals((property.getsuccessvalues().get(0).getText()),"Thank you for the feedback");
		
		service.stop();
		
	}
	
	

}
