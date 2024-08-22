package pageclases;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

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

		@FindBy(xpath="//button[text()='Add']")
		private WebElement addWidgetMenuBtn ;
		
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
		
		@FindBy(xpath = "//div[@class='css-5mz1tj-menu selectionbox_prefix__menu']/div/div[text()='ANGAT']")
		private WebElement menuANGAT;
		
		@FindBy(xpath="(//div[@class='css-16pqwjk-indicatorContainer selectionbox_prefix__indicator selectionbox_prefix__dropdown-indicator'])[2]")
		private WebElement selectSensor ;
		
		@FindBy(xpath="//div[@id='react-select-3-option-3']")
		private WebElement  sensor1;
		
		@FindBy(xpath="(//div[@class='css-16pqwjk-indicatorContainer selectionbox_prefix__indicator selectionbox_prefix__dropdown-indicator'])[3]")
		private WebElement selectParameter ;
		
		@FindBy(xpath = "//div[@class='css-5mz1tj-menu selectionbox_prefix__menu']/div/div[text()='Total KW']")
		private WebElement totalKW;
		
		@FindBy(xpath="//div[@class='widget-preview-header-refresh']")
		private WebElement  refreshPreview;
		
		@FindBy(xpath="//button[text()='Add Widget']")
		private WebElement  addWidget;
		
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
/////////////////////////////////////////////////////////////////////////////////////////////////list
		
		@FindBy(xpath="//div[@class='add-widget-modal-body']")
		private WebElement widgetsBody;
		
		@FindBy(xpath="//div[@class='add-widget-app']/div[text()='List View']")
		private WebElement listViewMenu;
		
		@FindBy(xpath="//input[@placeholder='Enter Alias / Name Fields']")
		private WebElement enterAliasname ;
		
		@FindBy(xpath="//input[@placeholder='Enter Value']")
		private WebElement EnterValue ;
		
		@FindBy(xpath="//button[normalize-space()='Add']")
		private WebElement  addBtn;
		@FindBy(xpath="//div[@class='px-4']//div//div[2]//div[1]//div[1]//div[1]//div[1]//input[1]")
		private WebElement  reAliasName;
		@FindBy(xpath="//div[contains(@class,'px-4')]//div//div[2]//div[2]//div[1]//div[1]//div[1]//input[1]")
		private WebElement reValue ;
		
////////////////////////////////////////////////////////////////////////////////////////////////
		@FindBy(xpath="//div[@class='add-widget-app-name'and text()='RunHours']")
		private WebElement  runHourMenu;
		
		@FindBy(xpath="//input[@placeholder='Alias']")
		private WebElement  aliseName;
		
		@FindBy(xpath="(//div[@class='css-1pcexqc-container selectionbox'])[1]")
		private WebElement locatn ;
		
		
		@FindBy(xpath="(//div[@class='css-1pcexqc-container selectionbox'])[2]")
		private WebElement parameter ;
		
///////////////////////////////////////////////////////////////////////////////////////////////////////		
		@FindBy(xpath="//i[@class='fas fa-table']")
		private WebElement tableMenu;
		
		@FindBy(xpath="(//div[@class='css-16pqwjk-indicatorContainer selectionbox_prefix__indicator selectionbox_prefix__dropdown-indicator'])[1]")
		private WebElement selectParameters ;
		
		@FindBy(xpath="(//div[@class='css-16pqwjk-indicatorContainer selectionbox_prefix__indicator selectionbox_prefix__dropdown-indicator'])[2]")
		private WebElement selectSensors;
		
//		@FindBy(xpath="")
//		private WebElement ;
//		@FindBy(xpath="")
//		private WebElement ;
//

		





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

			boolean messgAvaliable=createNotificatn.isDisplayed();
//			boolean messgAvaliable=	isWebElementDisplayed(createNotificatn);
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
/*			applyExplicitWaitsUntilElementClickable(operationalExcellence,50).click();
						Thread.sleep(1000);
						jse = (JavascriptExecutor) ndriver;
						jse.executeScript("window.scrollBy(0,1000)");
			applyExplicitWaitsUntilElementClickable(activeVerticalIcon,50).click();       
			//			Thread.sleep(1000);
			applyExplicitWaitsUntilElementClickable(addWidgetsMenu,30).click(); 
			//add by using widgets menu
//how to move to mapview
//		acn.scrollToElement(mapViewIcon);
//			acn= new Actions(ndriver);
//			acn.moveToElement(widgetsBody).scrollToElement(mapViewIcon).click().build().perform();
			try {
				applyExplicitWaitsUntilElementClickable(mapViewIcon,30).click();
			}
			catch(Exception e) {
				js.click(mapViewIcon);
			}
			Thread.sleep(1000);
//			acn.moveToElement(mapViewIcon);
//			applyExplicitWaitsUntilElementClickable(mapViewIcon,30).click();
//			try {
//				applyExplicitWaitsUntilElementClickable(addWidgetBtn,30).click();
//			}
//			catch(Exception e) {
//				js.click(addWidgetBtn);
//			}
//			applyExplicitWaitsUntilElementClickable(addWidgetBtn,30).click();
			
			
			
			
	*/		
			
	applyExplicitWaitsUntilElementClickable(operationalExcellence,50).click();
	applyExplicitWaitsUntilElementClickable(activeVerticalIcon,50).click();
	applyExplicitWaitsUntilElementClickable(addWidgetsMenu,50).click();
	applyExplicitWaitsUntilElementClickable(mapViewIcon,50).click();
	applyExplicitWaitsUntilElementClickable(addWidgetMenuBtn,50).click();
			

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
			Thread.sleep(2000);
			
			sel= new Select(selectPeriod);
			List<WebElement> periodOptins=sel.getOptions();
			for(int i=1;i<periodOptins.size();i++)
			{
				sel.selectByIndex(i);
				sel.selectByVisibleText("last 3 months");
			}
			
			sel= new Select(dataFreq);
			List<WebElement> frqOptions =sel.getOptions();
			for(int i=1;i<frqOptions.size();i++)
			{
				sel.selectByIndex(i);
				sel.selectByVisibleText("Unaggregated");
			}
		
			jse = (JavascriptExecutor) ndriver;
			jse.executeScript("window.scrollBy(0,1000)");
			
			
			applyExplicitWaitsUntilElementClickable(selectPlant,30).click(); //select ANGAT
//			acn.moveToElement(selectPlant).click().sendKeys("ANGAT").sendKeys(Keys.ENTER).build().perform();
			applyExplicitWaitsUntilElementClickable(selectPlant,30).sendKeys("ANGAT",Keys.ENTER);
			
			
//			acn.moveToElement(selectPlant).sendKeys("ANGAT").sendKeys(Keys.ENTER).build().perform();
			
			
			applyExplicitWaitsUntilElementClickable(selectSensor,30).click();//select sensor
			applyExplicitWaitsUntilElementClickable(sensor1,30).click();
			
			applyExplicitWaitsUntilElementClickable(selectParameter,30).click();
			applyExplicitWaitsUntilElementClickable(totalKW,30).click();
//move to refresh preview			
			acn= new Actions(ndriver);
			acn.moveToElement(refreshPreview).click().perform();
			Thread.sleep(2000);
			
//click on widget			
				applyExplicitWaitsUntilElementClickable(addWidget,30).click();
				Thread.sleep(2000);
				String notfn =notification.getText();
				System.out.println(notfn);
				
				applyExplicitWaitsUntilElementClickable(addedWidgetVerticlIcon,30).click();	
				applyExplicitWaitsUntilElementClickable(action,30).click();	
				applyExplicitWaitsUntilElementClickable(tvMode,30).click();	
				acn.sendKeys(Keys.ESCAPE).build().perform();
				
//add clone code and delete	
//applyExplicitWaitsUntilElementClickable(action,30).click();	
//applyExplicitWaitsUntilElementClickable(clone,30).click();	
				
}

public void addListView(String widgetName) throws Exception
{
	applyExplicitWaitsUntilElementClickable(operationalExcellence,50).click();
	applyExplicitWaitsUntilElementClickable(activeVerticalIcon,50).click();
	applyExplicitWaitsUntilElementClickable(addWidgetsMenu,50).click();
	
//	acn.moveToElement(widgetsBody).scrollToElement(listViewMenu).click().build().perform();
	applyExplicitWaitsUntilElementClickable(listViewMenu,50).click();
	applyExplicitWaitsUntilElementClickable(addWidgetMenuBtn,50).click();

	applyExplicitWaitsUntilElementClickable(widgetNameField,30).sendKeys(widgetName);
	applyExplicitWaitsUntilElementClickable(widgetDescription,30).sendKeys(widgetName);
	
	jse = (JavascriptExecutor) ndriver;
	jse.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(1000);
	applyExplicitWaitsUntilElementClickable(enterAliasname,30).sendKeys("aa");
	applyExplicitWaitsUntilElementClickable(EnterValue,30).sendKeys("aa");
	applyExplicitWaitsUntilElementClickable(addBtn,50).click();

	applyExplicitWaitsUntilElementClickable(reAliasName,30).sendKeys("bb");
	applyExplicitWaitsUntilElementClickable(reValue,30).sendKeys("bb");
//	Thread.sleep(1000);
	
	acn= new Actions(ndriver);
	acn.moveToElement(refreshPreview).click().perform();
	Thread.sleep(2000);
	applyExplicitWaitsUntilElementClickable(refreshPreview,50).click();
	applyExplicitWaitsUntilElementClickable(addWidget,30).click();
	Thread.sleep(2000);
	String notfn =notification.getText();
	System.out.println(notfn);
	
	}

public void addRunHour(String widgetName) throws Exception
{
	applyExplicitWaitsUntilElementClickable(operationalExcellence,50).click();
	applyExplicitWaitsUntilElementClickable(activeVerticalIcon,50).click();
	applyExplicitWaitsUntilElementClickable(addWidgetsMenu,50).click();
	applyExplicitWaitsUntilElementClickable(runHourMenu,50).click();
	applyExplicitWaitsUntilElementClickable(addWidgetMenuBtn,50).click();
	applyExplicitWaitsUntilElementClickable(widgetNameField,30).sendKeys(widgetName);
	applyExplicitWaitsUntilElementClickable(widgetDescription,30).sendKeys(widgetName);
	
	
	sel= new Select(selectPeriod);
	List<WebElement> periodOptins=sel.getOptions();
	for(int i=1;i<periodOptins.size();i++)
	{
		sel.selectByIndex(i);
		Thread.sleep(1000);
		sel.selectByVisibleText("Day");
	}
	
	sel= new Select(dataFreq);
	List<WebElement> frqOptions =sel.getOptions();
	for(int i=1;i<frqOptions.size();i++)
	{
		sel.selectByIndex(i);
		sel.selectByVisibleText("60 min");
	}

	jse = (JavascriptExecutor) ndriver;
	jse.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(1000);
	applyExplicitWaitsUntilElementClickable(aliseName,50).sendKeys("alis");
	applyExplicitWaitsUntilElementClickable(locatn,50).click();
	ndriver.findElement(By.xpath("//div[text()='test12']")).click();
	
	applyExplicitWaitsUntilElementClickable(parameter,50).click();
	ndriver.findElement(By.xpath("//div[text()='KVA']")).click();
	
	acn= new Actions(ndriver);
	acn.moveToElement(refreshPreview).click().perform();
	Thread.sleep(2000);
	applyExplicitWaitsUntilElementClickable(addWidget,30).click();
	Thread.sleep(2000);
	String notfn =notification.getText();
	System.out.println(notfn);
}


public void addTable(String widgetName) throws Exception
{
	applyExplicitWaitsUntilElementClickable(operationalExcellence,50).click();
	applyExplicitWaitsUntilElementClickable(activeVerticalIcon,50).click();
	applyExplicitWaitsUntilElementClickable(addWidgetsMenu,50).click();
	applyExplicitWaitsUntilElementClickable(tableMenu,50).click();
	applyExplicitWaitsUntilElementClickable(addWidgetMenuBtn,50).click();
	applyExplicitWaitsUntilElementClickable(widgetNameField,30).sendKeys(widgetName);
	applyExplicitWaitsUntilElementClickable(widgetDescription,30).sendKeys(widgetName);
	

	jse = (JavascriptExecutor) ndriver;
	jse.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(1000);
	
}

public void selectSensorsforTableWidget(io.cucumber.datatable.DataTable dataTable ) throws Exception
{
	
	applyExplicitWaitsUntilElementClickable(selectSensors,30).click();

List<List<String>>	data= dataTable.asLists(String.class);
System.out.println(data.size());
System.out.println(data.get(0).size());

for(int i = 0;i<data.get(0).size();i++)
{
	String t = data.get(0).get(i);
	ndriver.findElement(By.xpath("//div[text()='"+t+"']")).click();
	applyExplicitWaitsUntilElementClickable(selectSensors,30).click();
//	ndriver.findElement(By.xpath("//div[@class='user-suggestion-contaner']/ul/li[text()='"+ data.get(0).get(1)+"']")).click();
}

}

public void selectParametersforTableWidget(io.cucumber.datatable.DataTable dataTable ) throws Exception
{
	
	applyExplicitWaitsUntilElementClickable(selectParameters,30).click();

List<List<String>>	data= dataTable.asLists(String.class);
System.out.println(data.size());
System.out.println(data.get(0).size());

for(int i = 0;i<data.get(0).size();i++)
{
	String t = data.get(0).get(i);
	Thread.sleep(1000);
	ndriver.findElement(By.xpath("//div[text()='"+t+"']")).click();
	Thread.sleep(1000);
	applyExplicitWaitsUntilElementClickable(selectParameters,30).click();
//	ndriver.findElement(By.xpath("//div[@class='user-suggestion-contaner']/ul/li[text()='"+ data.get(0).get(1)+"']")).click();
}

}


	//select parameters 2/3
//	applyExplicitWaitsUntilElementClickable(selectParameters,30).click();
//	    ndriver.findElement(By.xpath("//div[text()='Cooling Tower Water Conductivity A']")).click();

	    
//	    	    applyExplicitWaitsUntilElementClickable(selectParameters,30).click();
//	    	    Thread.sleep(1000);
//	 	ndriver.findElement(By.xpath("//div[text()='temp_c']")).click();
//	 	applyExplicitWaitsUntilElementClickable(selectParameters,30).click();
//	 	ndriver.findElement(By.xpath("//div[text()='Total KW']")).click();
//	 	
//	 	applyExplicitWaitsUntilElementClickable(selectSensors,30).click();	
//	 	ndriver.findElement(By.xpath("//div[text()='QA12']")).click();
//	 	applyExplicitWaitsUntilElementClickable(selectSensors,30).click();
//	 	ndriver.findElement(By.xpath("//div[text()='sensor 9']")).click();
//	 	applyExplicitWaitsUntilElementClickable(selectSensors,30).click();
//	 	ndriver.findElement(By.xpath("//div[text()='sensor 1']")).click();
	 	

//		acn= new Actions(ndriver);
//		acn.moveToElement(refreshPreview).click().perform();
//		Thread.sleep(2000);
//		applyExplicitWaitsUntilElementClickable(addWidget,30).click();
//		Thread.sleep(2000);
//		String notfn =notification.getText();
//		System.out.println(notfn);
}



	

