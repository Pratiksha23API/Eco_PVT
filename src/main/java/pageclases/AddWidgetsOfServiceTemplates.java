package pageclases;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eco.base.BaseClass;
import com.eco.base.JavaScriptOperation;

public class AddWidgetsOfServiceTemplates extends BaseClass {
	public static String TemplateName ;

	WebDriver ndriver;
	WebDriverWait wait;
	JavaScriptOperation js;

	public AddWidgetsOfServiceTemplates(WebDriver odriver) {
		this.ndriver = odriver;
		PageFactory.initElements(ndriver, this);
		wait = new WebDriverWait(ndriver, Duration.ofSeconds(30));
		js=new JavaScriptOperation(ndriver);

	}

	@FindBy(xpath="//div[@data-title='Design']//img[@class='SSicon center-center icon-inactive']")
	private WebElement designMenu;

	@FindBy(xpath="//a[@class='border']")
	private WebElement addNewTemplate;

	@FindBy(xpath="//label[normalize-space()='Client Specific Onboarding']")
	private WebElement clientSpeBordOptn;

	@FindBy(xpath="//button[normalize-space()='Continue']")
	private WebElement continueBtn;

	@FindBy(xpath="//label[normalize-space()='Service Based Dashboard']")
	private WebElement serviceBasedOptn;

	@FindBy(xpath="//input[@placeholder='Search...']")
	private WebElement serachInput;

	@FindBy(xpath="//label[normalize-space()='Workplace']")
	private WebElement workplace;

	@FindBy(xpath="//label[@class='partner-login-label']")
	private WebElement pinkFloydIndustries;

	@FindBy(xpath="//label[@class='partner-login-label']")
	private WebElement pfBanner;

	@FindBy(xpath="//input[@placeholder='Enter Name']")
	private WebElement entrName;

	@FindBy(xpath="//textarea[@placeholder='Enter Description']")
	private WebElement entrDecriptn;

	@FindBy(xpath="//span[normalize-space()='Plant Filter']")
	private WebElement plantFilter;

		@FindBy(xpath="//div[text()='Sanity June']/ancestor::div[@class='rt-tr -odd' or  @class='rt-tr -even']//span[@class='checkmark']")
		private WebElement checkBox;
	//	
	//	@FindBy(xpath="")
	//	private WebElement ;
	//	
	//	@FindBy(xpath="")
	//	private WebElement ;
	//	


	public void createServiceTemplates(String serviceTemplateName) throws Exception
	{
	TemplateName=serviceTemplateName;
		
		applyExplicitWaitsUntilElementClickable(designMenu,30).click();
		applyExplicitWaitsUntilElementClickable(addNewTemplate,30).click();
		applyExplicitWaitsUntilElementClickable(clientSpeBordOptn,30).click();
		applyExplicitWaitsUntilElementClickable(continueBtn,30).click();
		applyExplicitWaitsUntilElementClickable(serviceBasedOptn,30).click();
		applyExplicitWaitsUntilElementClickable(continueBtn,30).click();
		applyExplicitWaitsUntilElementClickable(serachInput,30).click();
		applyExplicitWaitsUntilElementClickable(serachInput,30).sendKeys("workplace");
		applyExplicitWaitsUntilElementClickable(workplace,30).click();
		applyExplicitWaitsUntilElementClickable(continueBtn,30).click();
		applyExplicitWaitsUntilElementClickable(serachInput,30).sendKeys("pink");
		applyExplicitWaitsUntilElementClickable(pinkFloydIndustries,30).click();
		applyExplicitWaitsUntilElementClickable(continueBtn,30).click();
		applyExplicitWaitsUntilElementClickable(pfBanner,30).click();
		applyExplicitWaitsUntilElementClickable(continueBtn,30).click();

		applyExplicitWaitsUntilElementClickable(entrName,30).click();
		applyExplicitWaitsUntilElementClickable(entrName,30).sendKeys(TemplateName);
		applyExplicitWaitsUntilElementClickable(entrDecriptn,30).click();
		applyExplicitWaitsUntilElementClickable(entrDecriptn,30).sendKeys(TemplateName);

		applyExplicitWaitsUntilElementClickable(plantFilter,30).click();
		applyExplicitWaitsUntilElementClickable(continueBtn,30).click();

}
	
	public void clickOnCheckBoxAndTemplateName(String displayedTemplateName) throws Exception
	{
		TemplateName=displayedTemplateName;
		Thread.sleep(2000);
		ndriver.findElement(By.xpath("//div[text()='"+TemplateName+"']/ancestor::div[@class='rt-tr -odd' or  @class='rt-tr -even']//span[@class='checkmark']")).click();
		Thread.sleep(2000);
		ndriver.findElement(By.xpath("(//div[text()='"+TemplateName+"'])[1]")).click();
		
	}
	
	

}
