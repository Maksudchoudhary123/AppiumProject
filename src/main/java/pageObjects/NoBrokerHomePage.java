package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

// All the objects belonging to one page will be defined in java class
public class NoBrokerHomePage {
	
	//Concatenate driver
	public NoBrokerHomePage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Continue']")
	public WebElement Continue;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='DENY']")
	public WebElement Deny;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Buy']")
	public WebElement Buy;
	
	@AndroidFindBy(id="com.nobroker.app:id/searchEditHome")
	public WebElement LocalitySearch;
	
	@AndroidFindBy(id="com.nobroker.app:id/spinnergo")
	private WebElement Citydropdown;
	
	@AndroidFindBy(id="com.nobroker.app:id/localityAutoCompleteTxt")
	private WebElement CityAutoComplete;
	
	@AndroidFindBy(id="com.nobroker.app:id/nearByRadio")
	private WebElement Radiobutton;
	
	@AndroidFindBy(id="com.nobroker.app:id/bhktwo")
	private WebElement House2bhk;
	
	@AndroidFindBy(id="com.nobroker.app:id/bhkthree")
	private WebElement House3bhk;
	
	@AndroidFindBy(id="com.nobroker.app:id/searchProperty")
	private WebElement SearchProperty;
	
	
	
	public WebElement getcontinue()
	{
		System.out.println("trying to click on continue");
		return Continue;
	}
	
	public WebElement getdeny()
	{
		System.out.println("trying to click on deny");
		return Deny;
	}
	
	public WebElement getbuy()
	{
		System.out.println("trying to click on buy");
		return Buy;
	}
	
	public WebElement getsearchtextbox()
	{
		System.out.println("trying to click on locality search text box");
		return LocalitySearch;
	}
	public WebElement getcitySelection()
	{
		System.out.println("Selecting the option from dropdown");
		return Citydropdown;
	}
	
	public WebElement getlocality()
	{
		System.out.println("Selecting the area from the dropdown");
		return CityAutoComplete;
	}

	public WebElement getnearbyproperties()
	{
		System.out.println("Selecting the area from the dropdown");
		return Radiobutton;
	}
	
	public WebElement gettwobhk()
	{
		System.out.println("Selecting the 2 bhk house");
		return House2bhk;
	}
	
	public WebElement getthreebhk()
	{
		System.out.println("Selecting the 3 bhk house");
		return House3bhk;
	}
	
	public WebElement getsearchproperty()
	{
		System.out.println("Selecting the 3 bhk house");
		return SearchProperty;
	}
	
	
	
}
