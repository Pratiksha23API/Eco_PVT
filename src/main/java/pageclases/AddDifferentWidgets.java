package pageclases;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eco.base.BaseClass;
import com.eco.base.JavaScriptOperation;

public class AddDifferentWidgets extends BaseClass {
	
	WebDriver ndriver;
	WebDriverWait wait;
	JavaScriptOperation js;
	Select sel;
	JavascriptExecutor jse;
	Actions acn;
	
	public AddDifferentWidgets(WebDriver odriver) {
		this.ndriver = odriver;
		PageFactory.initElements(ndriver, this);
		wait = new WebDriverWait(ndriver, Duration.ofSeconds(30));
		js=new JavaScriptOperation(ndriver);
		
	}
		
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
		private WebElement activeVerticalIcon ;

		@FindBy(xpath="//button[normalize-space()='Add Widgets']")
		private WebElement addWidgetsMenu ;
		
		@FindBy(xpath="//i[@class='fas fa-map-marked-alt']")
		private WebElement mapViewIcon ;

		@FindBy(xpath="//button[normalize-space()='Add Widget']")
		private WebElement addWidgetBtn ;
		
		@FindBy(xpath="//input[@placeholder='Enter Widget Name']")
		private WebElement widgetNameField ;

		@FindBy(xpath="//textarea[@name='widget_description']")
		private WebElement widgetDescription ;

		@FindBy(xpath="(//span[@class='checkmark'])[1]")
		private WebElement showAliasCheckBox ;
		
		@FindBy(xpath="(//span[@class='checkmark'])[2]")
		private WebElement showArrowCheckBox ;
		
		@FindBy(xpath="//select[@placeholder='Select Period']")
		private WebElement selectPeriod ;
		
		@FindBy(xpath="//select[@placeholder='Data Frequency']")
		private WebElement dataFreq ;
		
		@FindBy(xpath="(//div[@class='css-16pqwjk-indicatorContainer selectionbox_prefix__indicator selectionbox_prefix__dropdown-indicator'])[1]")
		private WebElement selectPlant ;
		
		@FindBy(xpath="(//div[@class='css-16pqwjk-indicatorContainer selectionbox_prefix__indicator selectionbox_prefix__dropdown-indicator'])[2]")
		private WebElement selectSensor ;
		
		@FindBy(xpath="(//div[@class='css-16pqwjk-indicatorContainer selectionbox_prefix__indicator selectionbox_prefix__dropdown-indicator'])[3]")
		private WebElement selectParameter ;
		
		@FindBy(xpath="//div[@class='widget-preview-header-refresh']")
		private WebElement  refreshPreview;
		
		@FindBy(xpath="//a[@class='trigger level-0']")
		private WebElement  addedWidgetVerticlIcon;

		@FindBy(xpath="//div[text()='Action']")
		private WebElement  action;
		
		@FindBy(xpath="//div[@class='dropdown-menu level-1 _show']/a[text()='Clone']")
		private WebElement clone ;
		
		@FindBy(xpath="//div[@class='dropdown-menu level-1 _show']//a[text()='TV Mode']")
		private WebElement tvMode ;
		
		@FindBy(xpath="//div[@id='1']//a[@class='trigger level-0']")
		private WebElement copiedWidgetverticlIcon ;
		
		@FindBy(xpath="//div[@class='dropdown-menu level-1 _show']//a[text()='Delete']")
		private WebElement  delete;
		
		@FindBy(xpath="//button[normalize-space()='Ok']")
		private WebElement  okBtn;
		
		@FindBy(xpath="//span[@class='mainMsg']")
		private WebElement  notification;



		public boolean createNewDashboard(String dashBoardName) throws Exception
		{
			applyExplicitWaitsUntilElementClickable(operationalExcellence,30).click();
			try {
				applyExplicitWaitsUntilElementClickable(addDashBoard,30).click();
			}
			catch(Exception e) {
				js.click(addDashBoard);
			}


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
		
		
		public void addMapView(String widgetName) throws Exception
		{
			applyExplicitWaitsUntilElementClickable(operationalExcellence,50).click();
						Thread.sleep(1000);
						jse = (JavascriptExecutor) ndriver;
						jse.executeScript("window.scrollBy(0,1000)");
			applyExplicitWaitsUntilElementClickable(activeVerticalIcon,50).click();       
			//			Thread.sleep(1000);
			applyExplicitWaitsUntilElementClickable(addWidgetsMenu,30).click(); 
			//add by using widgets menu
//how to move to mapview			
			try {
				applyExplicitWaitsUntilElementClickable(mapViewIcon,30).click();
			}
			catch(Exception e) {
				js.click(mapViewIcon);
			}
//			acn.moveToElement(mapViewIcon);
//			applyExplicitWaitsUntilElementClickable(mapViewIcon,30).click();
			applyExplicitWaitsUntilElementClickable(addWidgetBtn,30).click();

			applyExplicitWaitsUntilElementClickable(widgetNameField,30).sendKeys(widgetName);
			applyExplicitWaitsUntilElementClickable(widgetDescription,30).sendKeys(widgetName);
			
			acn = new Actions(ndriver);
			if(showAliasCheckBox.isSelected())
			{
				acn.moveToElement(showAliasCheckBox).doubleClick().build().perform();
				
			}else {
				acn.moveToElement(showAliasCheckBox).click().build().perform();
			}
			Thread.sleep(1000);
			if(showArrowCheckBox.isSelected())
			{
				acn.moveToElement(showArrowCheckBox).doubleClick().build().perform();
				
			}else {
				acn.moveToElement(showArrowCheckBox).click().build().perform();
			}
			
			sel= new Select(selectPeriod);
			for(int i=0;i<=7;i++)
			{
				sel.selectByIndex(i);
				sel.selectByVisibleText("last 1 month");
			}
			
			sel= new Select(dataFreq);
			for(int i=0;i<=6;i++)
			{
				sel.selectByIndex(i);
				sel.selectByVisibleText("Unaggregated");
			}
					
		}


		


}
	

