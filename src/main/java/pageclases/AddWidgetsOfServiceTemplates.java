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
	@FindBy(xpath="//div[text()='Weather Forecast']")
	private WebElement weatherForecastWidget;

	@FindBy(xpath="//input[@name='alias']")
	private WebElement aliseofWeatherForcast ;

	@FindBy(xpath="//div[text()='kW']")
	private WebElement kwOptn ;

	@FindBy(xpath="(//div[@class='css-16pqwjk-indicatorContainer selectionbox_prefix__indicator selectionbox_prefix__dropdown-indicator'])[3]")
	private WebElement phaseParameter;

	@FindBy(xpath="//div[text()='KW (Y PHASE)']")
	private WebElement kwYPhase;

	@FindBy(xpath="//div[text()='Parameter Tracking']")
	private WebElement parameterTrackingWidget;

	@FindBy(xpath="(//input[@class='form-control-sm form-control'])[1]")
	private WebElement cardName;

	@FindBy(xpath="//select[@placeholder='Select Parameter Type']")
	private WebElement selectParaType;

	@FindBy(xpath="(//input[@class='form-control-sm form-control'])[2]")
	private WebElement aliseForparaTrack;

	@FindBy(xpath="(//input[@class='form-control-sm form-control'])[3]")
	private WebElement threshouldForParaTrack;


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
			System.out.println(widgetName+" "+notfn);
		}
		else if(widgetName.equalsIgnoreCase("Workplace Overview"))
		{
			Thread.sleep(1000);
			acn= new Actions(ndriver);
			acn.sendKeys(Keys.PAGE_UP).build().perform();
			Thread.sleep(2000);
			acn.moveToElement(addNewWidget).click().build().perform();
			applyExplicitWaitsUntilElementClickable(workplaceOverviewWidget,30).click();
			applyExplicitWaitsUntilElementClickable(addButton,30).click();

			applyExplicitWaitsUntilElementClickable(entrWidgetName,30).click();
			applyExplicitWaitsUntilElementClickable(entrWidgetName,30).sendKeys(widgetName);
			applyExplicitWaitsUntilElementClickable(widgetDescrptn,30).click();
			applyExplicitWaitsUntilElementClickable(widgetDescrptn,30).sendKeys(widgetName);
			Thread.sleep(1000);

			acn.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			acn.moveToElement(occupancyfield).click().sendKeys("20").build().perform();
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
			System.out.println(widgetName+" "+notfn);
		}
		else if(widgetName.equalsIgnoreCase("Weather Forecast"))
		{
//			Thread.sleep(1000);
			
			acn= new Actions(ndriver);
			acn.sendKeys(Keys.PAGE_UP).build().perform();
			acn.moveToElement(addNewWidget).click().build().perform();
									Thread.sleep(2000);
									
									
//			JavaScriptOperation.scrollToElement(addNewWidget);
//			Thread.sleep(1000);
//			acn.moveToElement(addNewWidget).click().build().perform();
			applyExplicitWaitsUntilElementClickable(weatherForecastWidget,30).click();
			applyExplicitWaitsUntilElementClickable(addButton,30).click();

			applyExplicitWaitsUntilElementClickable(entrWidgetName,30).click();
			applyExplicitWaitsUntilElementClickable(entrWidgetName,30).sendKeys(widgetName);
			applyExplicitWaitsUntilElementClickable(widgetDescrptn,30).click();
			applyExplicitWaitsUntilElementClickable(widgetDescrptn,30).sendKeys(widgetName);
			Thread.sleep(1000);

			acn.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);


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
			acn.moveToElement(parametr).click().sendKeys("2002").build().perform();
			Thread.sleep(1000);
			applyExplicitWaitsUntilElementClickable(kwOptn,30).click();

			acn.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			acn.moveToElement(aliseofWeatherForcast).click().sendKeys("a12").build().perform();
			acn.moveToElement(phaseParameter).click().build().perform();
			Thread.sleep(1000);
			applyExplicitWaitsUntilElementClickable(kwYPhase,30).click();


			acn.moveToElement(refresh).build().perform();
			applyExplicitWaitsUntilElementClickable(refresh,30).click();
			applyExplicitWaitsUntilElementClickable(addWidgetBtn,30).click();

			Thread.sleep(2000);
			notfn =notification.getText();
			//			Thread.sleep(1000);
			System.out.println(widgetName+" "+notfn);
		}
		else if(widgetName.equalsIgnoreCase("Parameter Tracking"))
		{
			Thread.sleep(1000);
			acn= new Actions(ndriver);
			acn.sendKeys(Keys.PAGE_UP).build().perform();
			Thread.sleep(2000);
			acn.moveToElement(addNewWidget).click().build().perform();
			applyExplicitWaitsUntilElementClickable(parameterTrackingWidget,30).click();
			applyExplicitWaitsUntilElementClickable(addButton,30).click();

			applyExplicitWaitsUntilElementClickable(entrWidgetName,30).click();
			applyExplicitWaitsUntilElementClickable(entrWidgetName,30).sendKeys(widgetName);
			applyExplicitWaitsUntilElementClickable(widgetDescrptn,30).click();
			applyExplicitWaitsUntilElementClickable(widgetDescrptn,30).sendKeys(widgetName);
			Thread.sleep(2000);

			try {
				applyExplicitWaitsUntilElementClickable(cardName,30).click();
			}
			catch(Exception e) {
				js.click(cardName);
			}

			Thread.sleep(2000);
			applyExplicitWaitsUntilElementClickable(cardName,30).sendKeys("alise1");
			Thread.sleep(2000);

			Select sel = new Select(selectParaType);
			sel.selectByVisibleText("7 - Tiled");
			Thread.sleep(2000);

			jse= (JavascriptExecutor)ndriver;
			jse.executeScript("window.scrollBy(0,4000)");
			Thread.sleep(2000);

			applyExplicitWaitsUntilElementClickable(aliseForparaTrack,30).click();
			Thread.sleep(1000);
			applyExplicitWaitsUntilElementClickable(aliseForparaTrack,30).sendKeys("a12");
			applyExplicitWaitsUntilElementClickable(threshouldForParaTrack,30).click();
			applyExplicitWaitsUntilElementClickable(threshouldForParaTrack,30).sendKeys("20");

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
			System.out.println(widgetName+" "+notfn);
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
		acn= new Actions(ndriver);
		acn.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		acn.moveToElement(oVIcon).click().build().perform();
		Thread.sleep(2000);
		acn.moveToElement(oActn).build().perform();
		Thread.sleep(2000);
		acn.moveToElement(copy).click().build().perform();
		Thread.sleep(2000);
		String clonenotfn =notification.getText();
		System.out.println(clonenotfn);

		acn.sendKeys(Keys.PAGE_DOWN).build().perform();	
		Thread.sleep(2000);
		acn.moveToElement(copiedIcon).click().build().perform();
		Thread.sleep(1000);

		acn.moveToElement(clonActn).build().perform();
		Thread.sleep(2000);

		acn.moveToElement(del).click().build().perform();
		applyExplicitWaitsUntilElementClickable(okBtn,30).click();
		Thread.sleep(2000);
		String deleteNotfn= notification.getText();
		System.out.println("workplace Graph-copy  "+deleteNotfn);

	}


	public String copyAndDeleteCopiedWidget(String widgetName) throws Exception
	{
		acn=new Actions(ndriver);
		acn.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
//		

//		jse= (JavascriptExecutor)ndriver;
//		jse.executeScript("window.scrollBy(0,4000)");

		widget=widgetName;		
		//generic copy and delete code
//		Thread.sleep(2000);
//		WebElement addedwidgetIcon=ndriver.findElement(By.xpath("//div[normalize-space() = '"+widget+"']//following ::div//div[@class='_Dropdown dropdown']"));
		WebElement addedwidgetIcon=ndriver.findElement(By.xpath("(//div[normalize-space() = '"+widget+"']//following ::div//div[@class='_Dropdown dropdown'])[1]"));
		Thread.sleep(2000);
		JavaScriptOperation.scrollToElement(addedwidgetIcon);
		Thread.sleep(1000);
		jse= (JavascriptExecutor)ndriver;
		jse.executeScript("window.scrollBy(0,2000)");
//		try {
//			applyExplicitWaitsUntilElementClickable(addedwidgetIcon,30).click();
//		}
//		catch(Exception e) {
//			js.click(addedwidgetIcon);
//		}
		acn.moveToElement(addedwidgetIcon).click().build().perform();
		Thread.sleep(2000);

		WebElement Oriactn = ndriver.findElement(By.xpath("//div[normalize-space() = '"+widget+"']//following ::div//div[@class='_Dropdown dropdown']//following::div//div/a/div/div[text()='Action']"));
		Thread.sleep(1000);
		acn.moveToElement(Oriactn).build().perform();
		Thread.sleep(2000);
		applyExplicitWaitsUntilElementClickable(clone,30).click();
		Thread.sleep(3000);
		String cloneNotfn= notification.getText();
		System.out.println(widgetName+" "+cloneNotfn);

        WebElement copiedWidgetVIcon= ndriver.findElement(By.xpath("//div[normalize-space() ='"+widget+" - Copy']//following ::div//div[@class='_Dropdown dropdown']"));
		JavaScriptOperation.scrollToElement(copiedWidgetVIcon);
		Thread.sleep(1000);
		applyExplicitWaitsUntilElementClickable(copiedWidgetVIcon,30).click();

		WebElement actn = ndriver.findElement(By.xpath("//div[normalize-space() ='"+widget+" - Copy']//following ::div//div[@class='_Dropdown dropdown']//following::div//div/a/div/div[text()='Action']"));
		acn.moveToElement(actn).build().perform();
		Thread.sleep(2000);
		applyExplicitWaitsUntilElementClickable(delete,30).click();
		Thread.sleep(1000);
		applyExplicitWaitsUntilElementClickable(okBtn, 30).click(); 
		Thread.sleep(2000);

		notfn =notification.getText();
		System.out.println(widgetName+" "+notfn);

		return notfn;

	}

	public String copyAndDeleteCopiedParameterTrackingWidget() throws Exception
	{
		acn=new Actions(ndriver);
		acn.sendKeys(Keys.PAGE_DOWN).build().perform();

		jse= (JavascriptExecutor)ndriver;
		jse.executeScript("window.scrollBy(0,4000)");


		Thread.sleep(2000);
		WebElement addedwidgetIcon=ndriver.findElement(By.xpath("(//div[@class='_Dropdown dropdown'])[4]"));
		acn.moveToElement(addedwidgetIcon).click().build().perform();
		Thread.sleep(2000);

		WebElement Oriactn = ndriver.findElement(By.xpath("(//div[@class='_Dropdown dropdown'])[4]//div[text()='Action']"));
		Thread.sleep(1000);
		acn.moveToElement(Oriactn).build().perform();
		Thread.sleep(2000);
		applyExplicitWaitsUntilElementClickable(clone,30).click();
		Thread.sleep(2000);
		String cloneNotfn= notification.getText();
		System.out.println("ParameterTracking  "+cloneNotfn);

		WebElement copiedWidgetVIcon= ndriver.findElement(By.xpath("(//div[@class='_Dropdown dropdown'])[3]"));
		acn.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		JavaScriptOperation.scrollToElement(copiedWidgetVIcon);
		acn.moveToElement(copiedWidgetVIcon).click().build().perform();
		Thread.sleep(2000);

		WebElement copyActn = ndriver.findElement(By.xpath("(//div[text()='Action'])[3]"));
		acn.moveToElement(copyActn).build().perform();
		Thread.sleep(2000);
		applyExplicitWaitsUntilElementClickable(delete,30).click();
		Thread.sleep(1000);
		applyExplicitWaitsUntilElementClickable(okBtn, 30).click(); 
		Thread.sleep(2000);

		notfn =notification.getText();
		System.out.println("parameterTracking  " +notfn);

		return notfn;

	}



}
