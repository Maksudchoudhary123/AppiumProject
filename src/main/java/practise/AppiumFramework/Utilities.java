package practise.AppiumFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Utilities {
	AndroidDriver<AndroidElement>  driver;

	public Utilities(AndroidDriver<AndroidElement> driver)
	{
		this.driver=driver;
	}

	
	public void scrollTo() {
		Dimension dim = driver.manage().window().getSize();
		int x = dim.getWidth()/2;
		int starty = (int) (dim.getHeight()*0.8);	
		int endy = (int) (dim.getHeight()*0.2);
		
		TouchAction act = new TouchAction(driver);
		act.press(PointOption.point(x,starty)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
		.moveTo(PointOption.point(x,endy)).release().perform();

	}
	
	public WebElement webdriverwait(WebElement element,int time) {
		WebDriverWait wait = new WebDriverWait(driver,time);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public WebElement webdriverwaitby(WebElement element,int time) {
		WebDriverWait wait = new WebDriverWait(driver,time);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public WebElement webdriverwaitvisibility(int time) {
		WebDriverWait wait = new WebDriverWait(driver,time);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.LinearLayout")));
	}
	
	public AndroidElement scrollToText(String text)
	{
	    return driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));");
	}
	
	public AndroidElement androiduiautomartext(String text) {
		return driver.findElementByAndroidUIAutomator("text(\""+text+"\")");
		
	}
	

}
