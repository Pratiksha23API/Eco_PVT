package pageclases;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eco.base.BaseClass;
import com.eco.base.JavaScriptOperation;

public class AddWidgetsOfServiceTemplates extends BaseClass {
	public static String TemplateName ;

	WebDriver ndriver;
	WebDriverWait wait;
	JavaScriptOperation js;
	Actions acn;
	JavascriptExecutor	jse;
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
		
		
		@FindBy(xpath="//textarea[@name='widget_description']")
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
		
		@FindBy(xpath="//a[@class='trigger level-0']")
		private WebElement oVIcon;
		
		@FindBy(xpath="//div[text()='Action']")
		private WebElement oActn ;
		
		@FindBy(xpath="//a[text()='Clone']")
		private WebElement copy;

		@FindBy(xpath="(//a[@class='trigger level-0'])[2]")
		private WebElement copiedIcon;
		
		@FindBy(xpath="(//div[text()='Action'])[2]")
		private WebElement clonActn;
		
		@FindBy(xpath="(//a[text()='Delete' and @class='dropdown-item'])[2]")
		private WebElement del;

		@FindBy(xpath="//button[normalize-space()='Ok']")
		private WebElement okBtn;
		
		@FindBy(xpath="//button[normalize-space()='+ Add New Widget']")
		private WebElement addNewWidget ;
		
		@FindBy(xpath="//div[text()='Workplace Overview']")
		private WebElement workplaceOverviewWidget;
		
		@FindBy(xpath="(//input[@class='form-control-sm form-control'])[1]")
		private WebElement occupancyfield;
		
		@FindBy(xpath="(//input[@class='form-control-sm form-control'])[2]")
		private WebElement occupantsfield;
		
		@FindBy(xpath="(//input[@class='form-control-sm form-control'])[3]")
		private WebElement aliseField;
		
		@FindBy(xpath="(//input[@class='form-control-sm form-control'])[4]")
		private WebElement prefixfield ;
		
		@FindBy(xpath="(//input[@class='form-control-sm form-control'])[5]")
		private WebElement suffixfield;
		
		@FindBy(xpath="//select[contains(@placeholder,'Select Scope')]")
		private WebElement scope;
		
		@FindBy(xpath="//span[@class='checkmark']")
		private WebElement highlightedCheckmark;
		
		@FindBy(xpath="//div[@class='dropdown-menu level-1 _show']/a[text()='Clone']")
		private WebElement clone ;
		
        @FindBy(xpath="//div[@class='dropdown-menu level-1 _show']//a[text()='Delete']")
		private WebElement  delete;
//		
//		@FindBy(xpath="")
//		private WebElement ;
//		
//		@FindBy(xpath="")
//		private WebElement ;

		public static String widget ="";
		
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
		if(widgetName.equalsIgnoreCase("Workplace Graph"))
		{
			applyExplicitWaitsUntilElementClickable(options,30).click();
			applyExplicitWaitsUntilElementClickable(addNewWidgetMenu,30).click();
			applyExplicitWaitsUntilElementClickable(workplaceGraphWidget,30).click();
			applyExplicitWaitsUntilElementClickable(addButton,30).click();
			
			applyExplicitWaitsUntilElementClickable(entrWidgetName,30).click();
			applyExplicitWaitsUntilElementClickable(entrWidgetName,30).sendKeys(widgetName);
			applyExplicitWaitsUntilElementClickable(widgetDescrptn,30).click();
			applyExplicitWaitsUntilElementClickable(widgetDescrptn,30).sendKeys(widgetName);
			
			acn= new Actions(ndriver);
//			
			
			jse= (JavascriptExecutor)ndriver;
			jse.executeScript("window.scrollBy(0,2000)");
			try {
				applyExplicitWaitsUntilElementClickable(normalBtn,30).click();
			}
			catch(Exception e) {
				js.click(normalBtn);
			}
			Thread.sleep(1000);
			jse= (JavascriptExecutor)ndriver;
			jse.executeScript("window.scrollBy(0,2000)");
			acn.sendKeys(Keys.PAGE_DOWN).build().perform();
			try {
				applyExplicitWaitsUntilElementClickable(enterAlisName,30).click();
			}
			catch(Exception e) {
				js.click(enterAlisName);
			}
//			applyExplicitWaitsUntilElementClickable(enterAlisName,30).click();
			applyExplicitWaitsUntilElementClickable(enterAlisName,30).sendKeys("asf");
			
			jse.executeScript("window.scrollBy(0,2000)");
			acn.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			try {
				applyExplicitWaitsUntilElementClickable(loctn,30).click();
			}
			catch(Exception e) {
				js.click(loctn);
			}
	acn.moveToElement(loctn).click().build().perform();
	Thread.sleep(1000);
			applyExplicitWaitsUntilElementClickable(pfBannerOptn,80).click();
			
			Thread.sleep(1000);
			try {
				applyExplicitWaitsUntilElementClickable(parametr,30).click();
			}
			catch(Exception e) {
				js.click(parametr);
			}
			acn.moveToElement(parametr).click().build().perform();
			Thread.sleep(1000);
			applyExplicitWaitsUntilElementClickable(kwhOptn,30).click();
			
			acn.moveToElement(refresh).build().perform();
			applyExplicitWaitsUntilElementClickable(refresh,30).click();
			applyExplicitWaitsUntilElementClickable(addWidgetBtn,30).click();
			
			Thread.sleep(2000);
			notfn =notification.getText();
//			Thread.sleep(1000);
			System.out.println(notfn);
		}
		else if(widgetName.equalsIgnoreCase("Workplace Overview"))
		{
			Thread.sleep(1000);
			acn= new Actions(ndriver);
			acn.sendKeys(Keys.PAGE_UP).build().perform();
			Thread.sleep(2000);
			acn.moveToElement(addNewWidget).click().build().perform();
//			applyExplicitWaitsUntilElementClickable(addNewWidget,30).click();
			applyExplicitWaitsUntilElementClickable(workplaceOverviewWidget,30).click();
			applyExplicitWaitsUntilElementClickable(addButton,30).click();

			applyExplicitWaitsUntilElementClickable(entrWidgetName,30).click();
			applyExplicitWaitsUntilElementClickable(entrWidgetName,30).sendKeys(widgetName);
			applyExplicitWaitsUntilElementClickable(widgetDescrptn,30).click();
			applyExplicitWaitsUntilElementClickable(widgetDescrptn,30).sendKeys(widgetName);
			Thread.sleep(1000);
			
//			jse= (JavascriptExecutor)ndriver;
//			jse.executeScript("window.scrollBy(0,2000)");
			acn.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			acn.moveToElement(occupancyfield).click().sendKeys("20").build().perform();
//			applyExplicitWaitsUntilElementClickable(occupancyfield,30).click();
//			applyExplicitWaitsUntilElementClickable(occupancyfield,30).sendKeys("20");
			applyExplicitWaitsUntilElementClickable(occupantsfield,30).click();
			applyExplicitWaitsUntilElementClickable(occupantsfield,30).sendKeys("40");
			
			applyExplicitWaitsUntilElementClickable(highlightedCheckmark,30).click();
			
			Select sel = new Select(scope);
			sel.selectByVisibleText("Outer Air Condition");
			Thread.sleep(1000);
			
			acn= new Actions(ndriver);
			acn.moveToElement(aliseField).click().sendKeys("alias1").build().perform();
			acn.moveToElement(prefixfield).click().sendKeys("aa").build().perform();
			acn.moveToElement(suffixfield).click().sendKeys("ss").build().perform();
			
			Thread.sleep(1000);
			try {
				applyExplicitWaitsUntilElementClickable(loctn,30).click();
			}
			catch(Exception e) {
				js.click(loctn);
			}
	acn.moveToElement(loctn).click().sendKeys("pf").build().perform();
	Thread.sleep(2000);
			applyExplicitWaitsUntilElementClickable(pfBannerOptn,80).click();
			
			Thread.sleep(1000);
			try {
				applyExplicitWaitsUntilElementClickable(parametr,30).click();
			}
			catch(Exception e) {
				js.click(parametr);
			}
			acn.moveToElement(parametr).click().sendKeys("2001").build().perform();
		    Thread.sleep(1000);
			applyExplicitWaitsUntilElementClickable(kwhOptn,30).click();
			
			acn.moveToElement(refresh).build().perform();
			applyExplicitWaitsUntilElementClickable(refresh,30).click();
			applyExplicitWaitsUntilElementClickable(addWidgetBtn,30).click();
			
			Thread.sleep(2000);
			notfn =notification.getText();
//			Thread.sleep(1000);
			System.out.println(notfn);
			
			
		}
		
        return notfn;
		
	}
	
	public void EditDashbordThenCloneAndDeleteClonedWorkplaceGraphWidget() throws Exception
	{
		Thread.sleep(2000);
		applyExplicitWaitsUntilElementClickable(options,30).click();
		applyExplicitWaitsUntilElementClickable(editDashbordMenu,30).click();
		jse= (JavascriptExecutor)ndriver;
		jse.executeScript("window.scrollBy(0,4000)");
		

		Thread.sleep(1000);
//	WebElement oVIcon=	ndriver.findElement(By.xpath("//a[@class='trigger level-0']")); //vicon of ori
	acn= new Actions(ndriver);
	acn.sendKeys(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(1000);
	acn.moveToElement(oVIcon).click().build().perform();
	Thread.sleep(2000);
//	WebElement Oactn=	ndriver.findElement(By.xpath("//div[text()='Action']"));
	acn.moveToElement(oActn).build().perform();
	Thread.sleep(2000);
//	WebElement copy=	ndriver.findElement(By.xpath("//a[text()='Clone']"));
	acn.moveToElement(copy).click().build().perform();
	Thread.sleep(2000);
		String clonenotfn =notification.getText();
		System.out.println(clonenotfn);
		
		acn.sendKeys(Keys.PAGE_DOWN).build().perform();	
		Thread.sleep(2000);
//	WebElement copiedIcon=	ndriver.findElement(By.xpath("(//a[@class='trigger level-0'])[2]"));  //vicon of copy
	acn.moveToElement(copiedIcon).click().build().perform();
	Thread.sleep(1000);
	

//	WebElement clonActn=	ndriver.findElement(By.xpath("(//div[text()='Action'])[2]"));
	acn.moveToElement(clonActn).build().perform();
	Thread.sleep(2000);
	
//	WebElement del=	ndriver.findElement(By.xpath("(//a[text()='Delete' and @class='dropdown-item'])[2]"));
	acn.moveToElement(del).click().build().perform();
	applyExplicitWaitsUntilElementClickable(okBtn,30).click();
		Thread.sleep(2000);
		String deleteNotfn= notification.getText();
		System.out.println(deleteNotfn);
		
	}
	
	
	public String copyAndDeleteCopiedWidget(String widgetName) throws Exception
	{
		acn=new Actions(ndriver);
		acn.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		jse= (JavascriptExecutor)ndriver;
		jse.executeScript("window.scrollBy(0,4000)");
		
		widget=widgetName;		
		//generic copy and delete code
		
		WebElement addedwidgetIcon=ndriver.findElement(By.xpath("//div[normalize-space() = '"+widget+"']//following ::div//div[@class='_Dropdown dropdown']"));
		Thread.sleep(1000);
		acn.sendKeys(Keys.PAGE_DOWN).build().perform();
		acn.moveToElement(addedwidgetIcon).click().build().perform();
		Thread.sleep(2000);
//		applyExplicitWaitsUntilElementClickable(addedwidgetIcon,30).click();
		
		WebElement Oriactn = ndriver.findElement(By.xpath("//div[normalize-space() = '"+widget+"']//following ::div//div[@class='_Dropdown dropdown']//following::div//div/a/div/div[text()='Action']"));
		Thread.sleep(1000);
		acn.moveToElement(Oriactn).build().perform();
//		applyExplicitWaitsUntilElementClickable(Oriactn,50).click();
		Thread.sleep(2000);
		applyExplicitWaitsUntilElementClickable(clone,30).click();
		Thread.sleep(2000);
		
		WebElement copiedWidgetVIcon= ndriver.findElement(By.xpath("//div[normalize-space() ='"+widget+" - Copy']//following ::div//div[@class='_Dropdown dropdown']"));
		JavaScriptOperation.scrollToElement(copiedWidgetVIcon);
		Thread.sleep(1000);
		applyExplicitWaitsUntilElementClickable(copiedWidgetVIcon,30).click();
		
		WebElement actn = ndriver.findElement(By.xpath("//div[normalize-space() ='"+widget+" - Copy']//following ::div//div[@class='_Dropdown dropdown']//following::div//div/a/div/div[text()='Action']"));
		acn.moveToElement(actn).build().perform();
//		applyExplicitWaitsUntilElementClickable(actn,30).click();
		Thread.sleep(2000);
		applyExplicitWaitsUntilElementClickable(delete,30).click();
		Thread.sleep(1000);
		applyExplicitWaitsUntilElementClickable(okBtn, 30).click(); 
		Thread.sleep(2000);
		
		notfn =notification.getText();
		System.out.println(notfn);

		return notfn;
		
		
		
	}
	
	

}
