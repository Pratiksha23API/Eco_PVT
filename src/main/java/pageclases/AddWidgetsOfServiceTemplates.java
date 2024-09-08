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
	String notfn;

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
		
		@FindBy(xpath="//div[@class='float-button']")
		private WebElement options;
		
		@FindBy(xpath="//div[@class='navContent']//button[2]")
		private WebElement editDashbordMenu;
		
		@FindBy(xpath="//span[normalize-space()='ADD NEW WIDGET']")
		private WebElement addNewWidgetMenu;
		
		@FindBy(xpath="//div[text()='Workplace Graph']")
		private WebElement workplaceGraphWidget;
		
		
		@FindBy(xpath="//button[normalize-space()='Add']")
		private WebElement addButton;
		
		@FindBy(xpath="//input[@placeholder='Enter Widget Name']")
		private WebElement entrWidgetName;
		
		
		@FindBy(xpath="//label[normalize-space()='Widget Description']")
		private WebElement widgetDescrptn;
		
		@FindBy(xpath="//button[normalize-space()='Normal']")
		private WebElement normalBtn;
		
		@FindBy(xpath="//input[@placeholder='Alias']")
		private WebElement enterAlisName;
		
		@FindBy(xpath="(//div[@class='css-1hwfws3 selectionbox_prefix__value-container selectionbox_prefix__value-container--has-value'])[1]")
		private WebElement loctn;
		
		@FindBy(xpath="//div[text()='PF Baner']")
		private WebElement pfBannerOptn;
		
		@FindBy(xpath="(//div[@class='css-1hwfws3 selectionbox_prefix__value-container selectionbox_prefix__value-container--has-value'])[2]")
		private WebElement parametr;
		
		@FindBy(xpath="//div[text()='kWh']")
		private WebElement kwhOptn;
		
		@FindBy(xpath="//span[normalize-space()='Refresh Preview']")
		private WebElement refresh;
		
		@FindBy(xpath="//button[normalize-space()='Add Widget']")
		private WebElement addWidgetBtn;
		
		@FindBy(xpath="//span[@class='mainMsg']")
		private WebElement  notification;
//		@FindBy(xpath="")
//		private WebElement ;
//		
//		@FindBy(xpath="")
//		private WebElement ;
//		
//		@FindBy(xpath="")
//		private WebElement ;
		


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
	boolean s;
	public boolean clickOnCheckBoxAndTemplateName(String displayedTemplateName) throws Exception
	{
		TemplateName=displayedTemplateName;
		Thread.sleep(2000);
		ndriver.findElement(By.xpath("//div[text()='"+TemplateName+"']/ancestor::div[@class='rt-tr -odd' or  @class='rt-tr -even']//span[@class='checkmark']")).click();
		Thread.sleep(2000);
		WebElement template =ndriver.findElement(By.xpath("(//div[text()='"+TemplateName+"'])[1]"));
		boolean display=isWebElementDisplayed(template);
		
		template.click();
		return display;
			
	}
	
	public String addWidgetOfTemplateService(String widgetName) throws Exception
	{
		applyExplicitWaitsUntilElementClickable(options,30).click();
		applyExplicitWaitsUntilElementClickable(addNewWidgetMenu,30).click();
		applyExplicitWaitsUntilElementClickable(workplaceGraphWidget,30).click();
		applyExplicitWaitsUntilElementClickable(addButton,30).click();
		
		applyExplicitWaitsUntilElementClickable(entrWidgetName,30).click();
		applyExplicitWaitsUntilElementClickable(entrWidgetName,30).sendKeys(widgetName);
		applyExplicitWaitsUntilElementClickable(widgetDescrptn,30).click();
		applyExplicitWaitsUntilElementClickable(widgetDescrptn,30).sendKeys(widgetName);
		
		applyExplicitWaitsUntilElementClickable(normalBtn,30).click();
		applyExplicitWaitsUntilElementClickable(enterAlisName,30).click();
		applyExplicitWaitsUntilElementClickable(enterAlisName,30).sendKeys("asf");
		
		applyExplicitWaitsUntilElementClickable(loctn,30).click();
		applyExplicitWaitsUntilElementClickable(pfBannerOptn,30).click();
		
		applyExplicitWaitsUntilElementClickable(parametr,30).click();
		applyExplicitWaitsUntilElementClickable(kwhOptn,30).click();
		
		applyExplicitWaitsUntilElementClickable(refresh,30).click();
		applyExplicitWaitsUntilElementClickable(addWidgetBtn,30).click();
		
		Thread.sleep(3000);
		notfn =notification.getText();
		Thread.sleep(1000);
		System.out.println(notfn);
		
        return notfn;
		
	}
	
	public void EditDashbordThenCloneAndDeleteClonedWidget() throws Exception
	{
		applyExplicitWaitsUntilElementClickable(options,30).click();
		applyExplicitWaitsUntilElementClickable(editDashbordMenu,30).click();
		
		ndriver.findElement(By.xpath("//a[@class='trigger level-0']")).click();  //vicon of ori
		ndriver.findElement(By.xpath("//div[text()='Action']")).click();
		ndriver.findElement(By.xpath("//a[text()='Clone']")).click();
		String clonenotfn =notification.getText();
		System.out.println(clonenotfn);
		
		ndriver.findElement(By.xpath("(//a[@class='trigger level-0'])[2]")).click();  //vicon of copy
		ndriver.findElement(By.xpath("(//div[text()='Action'])[2]")).click();
		ndriver.findElement(By.xpath("(//a[text()='Delete' and @class='dropdown-item'])[2]")).click();
		ndriver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		String deleteNotfn= notification.getText();
		System.out.println(deleteNotfn);
		
	}
	
	
	
	

}
