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


public class WidgetWithGraphType extends BaseClass {

	WebDriver ndriver;
	WebDriverWait wait;
	JavaScriptOperation js;
	Select sel;
	JavascriptExecutor jse;
	Actions acn;

	public WidgetWithGraphType(WebDriver odriver) {
		this.ndriver = odriver;
		PageFactory.initElements(ndriver, this);
		wait = new WebDriverWait(ndriver, Duration.ofSeconds(30));
		js=new JavaScriptOperation(ndriver);

	}
	WidgetWithGraphType grptypePage;

	@FindBy(xpath="//p[@class='active' and text()='Operational Excellence']")
	private WebElement operationalExcellence;

	@FindBy(xpath="//button[@class='add-wrap _add-wrap']")
	private WebElement addDashBoard ;

	@FindBy(xpath="//input[@id='dashboard-name']")
	private WebElement enterNameFiled ;

	@FindBy(xpath="//button[normalize-space()='Create']")
	private WebElement createBtn ;

	@FindBy(xpath="//div[@class='Toastify__toast Toastify__toast--success successToast notification']")
	private WebElement createNotificatn ;

	@FindBy(xpath="//i[@class='fas fa-ellipsis-v']")
	private WebElement verticalIcon ;

	@FindBy(xpath="//button[normalize-space()='Add Widgets']")
	private WebElement addWidgetsMenu ;

	@FindBy(xpath="//i[@class='fas fa-chart-pie']")
	private WebElement piechartWidgetApp ;

	@FindBy(xpath="//button[normalize-space()='Add']")
	private WebElement addBtn ;

	@FindBy(xpath="//input[@placeholder='Enter Widget Name']")
	private WebElement widgetNameField ;

	@FindBy(xpath="//textarea[@name='widget_description']")
	private WebElement widgetDescription ;

	@FindBy(xpath="//input[@placeholder='From']")
	private WebElement fromField ;

	@FindBy(xpath="//select[@placeholder='Select']")
	private WebElement graphType ;

	@FindBy(xpath="//input[@class='form-control-sm form-control']")
	private WebElement alias ;

	@FindBy(xpath="//span[@class='recharts-legend-item-text']")
	private WebElement aliasText ; 

	@FindBy(xpath="(//div[@class='css-o3h76h-control selectionbox_prefix__control'])[1]")
	private WebElement location;

	@FindBy(xpath="(//div[@class='css-1pcexqc-container selectionbox'])[2]")
	private WebElement parameter ;

	@FindBy(xpath="//input[@type='color']")
	private WebElement color ;

	@FindBy(xpath="//div[@class='d-flex flex-wrap individual-color']//div[2]//div[4]")
	private WebElement selectColor;

	@FindBy(xpath="//span[normalize-space()='Refresh Preview']")
	private WebElement refreshPreview ;

	@FindBy(xpath="//div[@class='widget-pie-chart ']")
	private WebElement pieChartDisplay ;

	@FindBy(xpath="//button[normalize-space()='Add Widget']")
	private WebElement addWidgetBtn ;

	@FindBy(xpath="//span[@class='mainMsg']")
	private WebElement  notification ;

	@FindBy(xpath="//div[@class='custom-padding undefined col-xl-12']//select[@placeholder='Select']")
	private WebElement showValue ;

	@FindBy(xpath="//div[3]//div[1]//div[1]//select[1]")
	private WebElement selectValue ;

	@FindBy(xpath="//div[@class='css-16pqwjk-indicatorContainer selectionbox_prefix__indicator selectionbox_prefix__dropdown-indicator']")
	private WebElement selectTag ;

	@FindBy(xpath="//div[text()='QA alert log']")
	private WebElement qaAlertLog ;

	@FindBy(xpath="//div[text()='QA alert list']")
	private WebElement qaAlertList ;




	public boolean createNewDashboard(String dashBoardName) throws Exception
	{
		applyExplicitWaitsUntilElementClickable(operationalExcellence,30).click();
		try {
			applyExplicitWaitsUntilElementClickable(addDashBoard,30).click();
		}
		catch(Exception e) {
			js.click(addDashBoard);
		}

		//		enterNameFiled.sendKeys(Keys.BACK_SPACE);
		//		Thread.sleep(1000);
		//		applyExplicitWaitsUntilElementClickable(enterNameFiled,30).sendKeys(dashBoardName);;

		applyExplicitWaitsUntilElementClickable(enterNameFiled,30).clear();
		applyExplicitWaitsUntilElementClickable(enterNameFiled,30).click();
		applyExplicitWaitsUntilElementClickable(enterNameFiled,30).sendKeys(dashBoardName);
		applyExplicitWaitsUntilElementClickable(createBtn,30).click();
		Thread.sleep(2000);


		boolean messgAvaliable=	isWebElementDisplayed(createNotificatn);
		if(messgAvaliable)
		{
			System.out.println(dashBoardName+ "  dashboard is created succefully ");

		}
		else {
			System.out.println(dashBoardName+ "  dashboard is not created succefully ");
		}

		return messgAvaliable;
	}

	public  void selectLocatnParameter() throws Exception
	{
		jse = (JavascriptExecutor) ndriver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		applyExplicitWaitsUntilElementClickable(alias,30).click();
		applyExplicitWaitsUntilElementClickable(alias,30).clear();;
		applyExplicitWaitsUntilElementClickable(alias,30).sendKeys("abc");
		//		Thread.sleep(1000);
		applyExplicitWaitsUntilElementClickable(location,30).click();
		Thread.sleep(1000);
//		ndriver.findElement(By.xpath("(//div[text()='1000 KVA LT'])[1]")).click();    //here program stop
		
		ndriver.findElement(By.xpath("//div[text()='Mannual Sensor101']")).click();
		
		Thread.sleep(1000);
		applyExplicitWaitsUntilElementClickable(parameter,30).click();
		Thread.sleep(1000);
		ndriver.findElement(By.xpath("//div[text()='kWh']")).click();
	}

	String colorValue;
	public void selectColour() throws Exception
	{
		applyExplicitWaitsUntilElementClickable(color,30).click();
		colorValue =selectColor.getCssValue("color");
		applyExplicitWaitsUntilElementClickable(selectColor,30).click();
		Thread.sleep(1000);
	}

	public void clickOnRefreshPreview() throws Exception
	{
		acn= new Actions(ndriver);
		acn.moveToElement(refreshPreview).click().perform();
		Thread.sleep(2000);
	}

	boolean widgetDisplayed;
	public boolean verifyWidgetDisplayed() throws Exception
	{

		widgetDisplayed=isWebElementDisplayed(pieChartDisplay);

		if(widgetDisplayed)
		{
			if(pieChartDisplay.getCssValue("color").equals(colorValue) &&  aliasText.getText().equals("abc"))
			{
				System.out.println(  "piechart  succefully display with correct colour");
			}

			else {
				System.out.println("piechart not succefully display with correct colour");
			}
		}

		return widgetDisplayed;

	}

	public void clickOnAddWidgetBtn() throws Exception
	{
		applyExplicitWaitsUntilElementClickable(addWidgetBtn, 30).click();
		Thread.sleep(2000);
	}
	public void  addWidgetWithGraphType(String graphtype) throws Exception
	{
		applyExplicitWaitsUntilElementClickable(operationalExcellence,50).click();

		//		try {
		//			applyExplicitWaitsUntilElementClickable(VerticalIcon,50).click();
		//		}
		//		catch(Exception e) {
		//			js.click(VerticalIcon);
		//		}
		//		jse = (JavascriptExecutor) ndriver;
		//		jse.executeScript("window.scrollBy(0,1000)");
		applyExplicitWaitsUntilElementClickable(verticalIcon,50).click();  
		applyExplicitWaitsUntilElementClickable(addWidgetsMenu,30).click(); 

		applyExplicitWaitsUntilElementClickable(piechartWidgetApp,30).click();
		applyExplicitWaitsUntilElementClickable(addBtn,30).click();
		applyExplicitWaitsUntilElementClickable(widgetNameField,30).sendKeys("Pie Chart");                
		applyExplicitWaitsUntilElementClickable(widgetDescription,30).sendKeys("Pie Chart");

		applyExplicitWaitsUntilElementClickable(fromField,30).clear();
		applyExplicitWaitsUntilElementClickable(fromField,30).sendKeys("10");

		//select pieChartType

		sel = new Select(graphType);
		sel.selectByValue(graphtype);
		Thread.sleep(2000);

		if(graphtype.equalsIgnoreCase("Radial Chart"))
		{
			sel= new Select(showValue);
			sel.selectByValue("Yes");
			sel=new Select(selectValue);
			sel.selectByValue("Average");
		}
		else if(graphtype.equalsIgnoreCase("Arc Score"))
		{
			sel= new Select(showValue);
			sel.selectByValue("Yes");
			sel=new Select(selectValue);
			sel.selectByValue("Average");
		}
		else if(graphtype.equalsIgnoreCase("YoY Visualization"))
		{

			applyExplicitWaitsUntilElementClickable(selectTag, 40).click();
			applyExplicitWaitsUntilElementClickable(qaAlertLog, 30).click();
			acn= new Actions(ndriver);
//			acn.moveToElement(refreshPreview).click().perform();
//			Thread.sleep(2000);
//			applyExplicitWaitsUntilElementClickable(addWidgetBtn, 30).click();
//			Thread.sleep(1000);
		}

	}

	public String verifyWidgetaddSuccefully() throws Exception
	{
		applyExplicitWaitsUntilElementClickable(addWidgetBtn,30).click();
		Thread.sleep(2000);
		String notfn =notification.getText();
		return notfn;

	}

}
