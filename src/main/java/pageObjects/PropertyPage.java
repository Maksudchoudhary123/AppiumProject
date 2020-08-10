package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PropertyPage {
	
	public PropertyPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id="com.nobroker.app:id/property_item_contact_owner")
	private WebElement PropertyListPage;
	
	@AndroidFindBy(id="com.nobroker.app:id/title_bar")
	private List<WebElement> PropertySelected;	
	
	@AndroidFindBy(xpath="//android.widget.TextView")
	private List<WebElement> Propertyvalues;
	
	@AndroidFindBy(id="com.nobroker.app:id/et_signup_phone")
	private WebElement Signup;
	
	@AndroidFindBy(id="com.nobroker.app:id/rb_signup_pwd")
	private WebElement Pwdvisible;
	
	@AndroidFindBy(id="com.nobroker.app:id/et_signup_pwd")
	private WebElement PwdField;

	@AndroidFindBy(id="com.nobroker.app:id/btn_signup")
	private WebElement Signupclick;
	
	@AndroidFindBy(className="android.widget.CheckBox")
	private List<AndroidElement> Whatswrongcheck;
	
	@AndroidFindBy(id="com.nobroker.app:id/btn_report")
	private WebElement Reportbutton;
	
	@AndroidFindBy(id="com.nobroker.app:id/edt_others")
	private WebElement Note;
	
	@AndroidFindBy(id="com.nobroker.app:id/btn_save")
	private WebElement SaveChanges;
	
	@AndroidFindBy(className="android.widget.LinearLayout")
	private WebElement Successpopup;
	
	@AndroidFindBy(className="android.widget.TextView")
	private List<AndroidElement> SuccessValues;
	
	
	public WebElement getpropertypage()
	{
		System.out.println("Navigated to property listing page");
		return PropertyListPage;
	}
	
	public List<WebElement> getpropertyselection()
	{
		System.out.println("Selecting the 4th property from listing page");
		return PropertySelected;
	}
	
	public List<WebElement> getpropertyvalues()
	{
		System.out.println("Taking all the text values in list");
		return Propertyvalues;
	}
	
	public WebElement getsignmobileno()
	{
		System.out.println("Entering mobile number");
		return Signup;
	}
	
	public WebElement getsignpwd()
	{
		System.out.println("Waiting for password field visible");
		return Pwdvisible;
	}
	
	public WebElement getpwd()
	{
		System.out.println("Entering password");
		return PwdField;
	}
	
	public WebElement getsignupclick()
	{
		System.out.println("Clicking on sign up");
		return Signupclick;
	}
	
	public List<AndroidElement> getwhatswrongcheckbox()
	{
		System.out.println("Clicking on check boxes");
		return Whatswrongcheck;
	}
	
	public WebElement getreportbutton()
	{
		System.out.println("Clicking on report button");
		return Reportbutton;
	}
	
	public WebElement getnote()
	{
		System.out.println("Entering note in text box what is wrong");
		return Note;
	}
	
	public WebElement getsavechanges()
	{
		System.out.println("Clicking on save changes");
		return SaveChanges;
	}
	
	public WebElement getsuccesspopup()
	{
		System.out.println("Waiting for success pop up");
		return Successpopup;
	}
	
	public List<AndroidElement> getsuccessvalues()
	{
		System.out.println("Success values stored and verifying");
		return SuccessValues;
	}
	
	
	
}
