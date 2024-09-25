package pageclases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eco.base.JavaScriptOperation;



public class SmartSenseLoginPage {

	WebDriver ndriver;
	WebDriverWait wait;
	JavaScriptOperation js;

	@FindBy(xpath= "//input[@id='username']")
	private WebElement Username;

	@FindBy(xpath= "//input[@id='password']")
	private WebElement Password;

	@FindBy(xpath= "//button[@type='submit']")
	private WebElement Loginbutton;


	public SmartSenseLoginPage(WebDriver odriver)
	{
		this.ndriver=odriver;
		PageFactory.initElements(ndriver, this);
		wait=new WebDriverWait(ndriver, Duration.ofSeconds(30));
		js=new JavaScriptOperation(ndriver);
	}

	public void Enterusername(String username) throws Exception 
	{
		Thread.sleep(2000);
		Username.sendKeys(username);
	}

	public void Enterpassword(String password) 
	{
		Password.sendKeys(password);
	}

	public void clickonLoginButton() 
	{
//		Loginbutton.click();
		js.click(Loginbutton);

	}
	public String GetTitileOfPage() 
	{
		String Loginpagetitle = ndriver.getTitle();
		return Loginpagetitle;
	}
}
