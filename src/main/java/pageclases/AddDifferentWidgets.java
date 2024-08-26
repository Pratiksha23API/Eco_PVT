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
	//////////////////////////////////////////////////////////////////////////////////////////////mapview//////////////		
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

//	@FindBy(xpath="//div[@id='react-select-3-option-3']")
//	private WebElement  sensor1;
	@FindBy(xpath="//div[@class='css-fk865s-option selectionbox_prefix__option' and text()='sensor 1']")
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

	//////////////////////////////////////////////////////////////////////////////////////////////// RunHour
	@FindBy(xpath="//div[@class='add-widget-app-name'and text()='RunHours']")
	private WebElement  runHourMenu;

	@FindBy(xpath="//input[@placeholder='Alias']")
	private WebElement  aliseName;

	@FindBy(xpath="(//div[@class='css-1pcexqc-container selectionbox'])[1]")
	private WebElement locatn ;


	@FindBy(xpath="(//div[@class='css-1pcexqc-container selectionbox'])[2]")
	private WebElement parameter ;

	///////////////////////////////////////////////////////////////////////////////////////////////////////	  table///////////	
	@FindBy(xpath="//i[@class='fas fa-table']")
	private WebElement tableMenu;

	@FindBy(xpath="(//div[@class='css-16pqwjk-indicatorContainer selectionbox_prefix__indicator selectionbox_prefix__dropdown-indicator'])[1]")
	private WebElement selectParameters ;

	@FindBy(xpath="(//div[@class='css-16pqwjk-indicatorContainer selectionbox_prefix__indicator selectionbox_prefix__dropdown-indicator'])[2]")
	private WebElement selectSensors;
	///////////////////////////////////////////////////////////////////  Anomaly

	@FindBy(xpath="//div[contains(text(),'Anomaly Detection')]")
	private WebElement anomallyDetectionApp  ;

	@FindBy(xpath="//select[@placeholder='Enter Period']")
	private WebElement period ;

	@FindBy(xpath="//select[@placeholder='Data Frequency']")
	private WebElement  dataFrequency ;

	@FindBy(xpath="(//input[@class='form-control'])[3]")
	private WebElement  threshouldPercent ;

	@FindBy(xpath="(//input[@class='form-control'])[4]")
	private WebElement trainingWeek  ;

	@FindBy(xpath="(//div[@class='css-1pcexqc-container selectionbox'])[1]")
	private WebElement selectBox1;

	@FindBy(xpath="(//div[@class='css-1pcexqc-container selectionbox'])[2]")
	private WebElement selectBox2;

	@FindBy(xpath="(//span[@class='checkmark'])[3]")
	private WebElement  showGraphToggle;

	////////////////////////////////////////////////////  copy	
	@FindBy(xpath="//div[text()=' Anomaly Detection - Copy']")
	private WebElement  copiedAnomly;

	@FindBy(xpath="//div[text()=' RunHours - Copy']")
	private WebElement  copiedRunHour;

	@FindBy(xpath="//div[text()=' Anomaly Detection - Copy']//following::div [@class='widgetArrow']")
	private WebElement  copiedAnomlyVerticalIcon;

	@FindBy(xpath="//div[@class='dropdown-menu level-1 _show']/a[text()='Edit']")
	private WebElement edit ;

	@FindBy(xpath="(//span[@class='checkmark'])[2]")
	private WebElement  tag;

	@FindBy(xpath="(//div[@class='css-16pqwjk-indicatorContainer selectionbox_prefix__indicator selectionbox_prefix__dropdown-indicator'])[1]")
	private WebElement selPlant ;

	@FindBy(xpath="(//div[@class='css-16pqwjk-indicatorContainer selectionbox_prefix__indicator selectionbox_prefix__dropdown-indicator'])[2]")
	private WebElement  selTag;

	@FindBy(xpath="//input[@placeholder='Enter Unit Prefix']")
	private WebElement  enterPrefix;

	@FindBy(xpath="//input[@placeholder='Enter Unit Suffix']")
	private WebElement enterSufix ;

	@FindBy(xpath="//div[@class='css-11unzgr selectionbox_prefix__menu-list']/div[text()='All Plant']")
	private WebElement  allPlant;

	@FindBy(xpath="//div[@class='css-11unzgr selectionbox_prefix__menu-list']/div[text()='QA alert log']")
	private WebElement  qaAlertLog;

	@FindBy(xpath="//button[normalize-space()='Save Changes']")
	private WebElement saveChangesBtn;

	public static String widget ="";
	public String createNewDashboard(String dashBoardName) throws Exception
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

		String createdMessg= notification.getText();
		System.out.println(createdMessg);

		return createdMessg;
	}
String notfn;
	public String addWidget(String widgetName) throws Exception
	{
		if(widgetName.equalsIgnoreCase("Map View"))
		{
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

			}
			sel.selectByVisibleText("Unaggregated");
//
//					jse = (JavascriptExecutor) ndriver;
//					jse.executeScript("window.scrollBy(0,1000)");
//			Thread.sleep(3000);
			
//			Thread.sleep(2000);
//			JavaScriptOperation.scrollToElement(selectSensor);
//			JavaScriptOperation.scrollToElement(selectPlant);
			acn= new Actions(ndriver);
//			acn.sendKeys(Keys.PAGE_DOWN).build().perform();
			acn.moveToElement(selectPlant).click().build().perform();

JavaScriptOperation.scrollToElement(selectPlant);
applyExplicitWaitsUntilElementClickable(selectPlant,30).click(); //select ANGAT
Thread.sleep(2000);
applyExplicitWaitsUntilElementClickable(menuANGAT,30).click();
//
//
//			//			acn.moveToElement(selectPlant).click().sendKeys("ANGAT").sendKeys(Keys.ENTER).build().perform();
//			//		applyExplicitWaitsUntilElementClickable(selectPlant,30).sendKeys("ANGAT",Keys.ENTER);
//
//
//			//			acn.moveToElement(selectPlant).sendKeys("ANGAT").sendKeys(Keys.ENTER).build().perform();
Thread.sleep(2000);
acn.moveToElement(selectSensor).click().build().perform();
JavaScriptOperation.scrollToElement(selectSensor);
Thread.sleep(1000);
applyExplicitWaitsUntilElementClickable(selectSensor,30).click();//select sensor
Thread.sleep(3000);
applyExplicitWaitsUntilElementClickable(sensor1,50).click();

			
//Thread.sleep(2000);
//acn.moveToElement(selectParameter).click().build().perform();
JavaScriptOperation.scrollToElement(selectParameter);
Thread.sleep(3000);
applyExplicitWaitsUntilElementClickable(selectParameter,30).click();
Thread.sleep(3000);
			applyExplicitWaitsUntilElementClickable(totalKW,30).click();
			//move to refresh preview			
			acn= new Actions(ndriver);
			acn.moveToElement(refreshPreview).click().perform();
			Thread.sleep(2000);

			//click on widget			
			applyExplicitWaitsUntilElementClickable(addWidget,30).click();
			Thread.sleep(2000);
		 notfn =notification.getText();
			System.out.println(notfn);

		}
		else if(widgetName.equalsIgnoreCase("List View"))
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
			 notfn =notification.getText();
			System.out.println(notfn);

		}
		else if(widgetName.equalsIgnoreCase("RunHours"))
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
			 notfn =notification.getText();
			System.out.println(notfn);
			
			
			//*************************************code for copy widget**********************
//	widget=widgetName;		
//			
//			applyExplicitWaitsUntilElementClickable(addedWidgetVerticlIcon,30).click();
//			applyExplicitWaitsUntilElementClickable(action,30).click();
//			Thread.sleep(2000);
//			applyExplicitWaitsUntilElementClickable(tvMode,30).click();
//			Thread.sleep(3000);
//			acn=new Actions(ndriver);
//			acn.sendKeys(Keys.ESCAPE).build().perform();
//			Thread.sleep(1000);
//			applyExplicitWaitsUntilElementClickable(addedWidgetVerticlIcon,30).click();
//			applyExplicitWaitsUntilElementClickable(action,30).click();
//			Thread.sleep(2000);
//			applyExplicitWaitsUntilElementClickable(clone,30).click();
//Thread.sleep(1000);
////					jse = (JavascriptExecutor) ndriver;
////					jse.executeScript("window.scrollBy(0,2000)");
//acn.sendKeys(Keys.PAGE_DOWN).build().perform();
//			
////			Thread.sleep(3000);
//			WebElement copiedWidgetVIcon= ndriver.findElement(By.xpath("//div[normalize-space() ='"+widget+" - Copy']//following ::div//div[@class='_Dropdown dropdown']"));
//			JavaScriptOperation.scrollToElement(copiedWidgetVIcon);
//			applyExplicitWaitsUntilElementClickable(copiedWidgetVIcon,30).click();
//			
//			WebElement actn = ndriver.findElement(By.xpath("//div[normalize-space() ='"+widget+" - Copy']//following ::div//div[@class='_Dropdown dropdown']//following::div//div/a/div/div[text()='Action']"));
//			applyExplicitWaitsUntilElementClickable(actn,30).click();
////			applyExplicitWaitsUntilElementClickable(action,50).click();
//			Thread.sleep(2000);
//			applyExplicitWaitsUntilElementClickable(delete,30).click();
//			Thread.sleep(1000);
//			applyExplicitWaitsUntilElementClickable(okBtn, 30).click(); 
//			Thread.sleep(2000);
//			String notfn =notification.getText();
//			System.out.println(notfn);
//
//			
			
		}
		else if(widgetName.equalsIgnoreCase("Anomaly Detection"))
		{
			applyExplicitWaitsUntilElementClickable(operationalExcellence,50).click();
			applyExplicitWaitsUntilElementClickable(activeVerticalIcon,50).click();
			applyExplicitWaitsUntilElementClickable(addWidgetsMenu,50).click();
			applyExplicitWaitsUntilElementClickable(anomallyDetectionApp ,50).click();
			applyExplicitWaitsUntilElementClickable(addWidgetMenuBtn,50).click();
			applyExplicitWaitsUntilElementClickable(widgetNameField,30).sendKeys(widgetName);
			applyExplicitWaitsUntilElementClickable(widgetDescription,30).sendKeys(widgetName);

			sel= new Select(period);
			List<WebElement> periodOptins=sel.getOptions();
			for(int i=1;i<periodOptins.size();i++)
			{
				sel.selectByIndex(i);
				Thread.sleep(1000);
			}
			sel.selectByVisibleText("Day");


			sel= new Select(dataFrequency);
			List<WebElement> frqOptions =sel.getOptions();
			for(int i=1;i<frqOptions.size();i++)
			{
				sel.selectByIndex(i);
			}
			sel.selectByVisibleText("1 Day");

			applyExplicitWaitsUntilElementClickable(threshouldPercent,30).click();                             //enter threshould
			applyExplicitWaitsUntilElementClickable(threshouldPercent,30).sendKeys("20");                           //50


			applyExplicitWaitsUntilElementClickable(trainingWeek,30).click();                             //trainigWeek
			applyExplicitWaitsUntilElementClickable(trainingWeek,30).sendKeys("2");                            //2

			//select PCB
			applyExplicitWaitsUntilElementClickable(selectBox1,30).click(); 
			Thread.sleep(1000);
			WebElement pcb=ndriver.findElement(By.xpath("//div[@id='react-select-2-option-114' and text()='PSB 6']"));
			//		acn=new Actions(ndriver);
			applyExplicitWaitsUntilElementClickable(pcb,50).click(); 
			Thread.sleep(1000);

			//	 select kwh	
			//				applyExplicitWaitsUntilElementClickable(selectBox2,30).click(); 
			try {
				applyExplicitWaitsUntilElementClickable(selectBox2,30).click();
			}
			catch(Exception e) {
				js.click(selectBox2);
			}
			Thread.sleep(2000);
			ndriver.findElement(By.xpath("//div[@id='react-select-7-option-64' and text()='kWh']")).click();  


			//	applyExplicitWaitsUntilElementClickable(showGraphToggle,30).click();                       //togglebtn click
			acn= new Actions(ndriver);
			acn.moveToElement(refreshPreview).click().perform();
			Thread.sleep(2000);
			applyExplicitWaitsUntilElementClickable(addWidget,30).click();
			Thread.sleep(2000);
			 notfn =notification.getText();
			System.out.println(notfn);
		}
return notfn;
	}

	public String copyAndDeleteCopiedWidget(String widgetName) throws Exception      
	{ 
		widget=widgetName;		
		//copy and delete code
		acn=new Actions(ndriver);
		acn.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		
		WebElement addedwidgetIcon=ndriver.findElement(By.xpath("//div[normalize-space() = '"+widget+"']//following ::div//div[@class='_Dropdown dropdown']"));
		JavaScriptOperation.scrollToElement(addedwidgetIcon);
		Thread.sleep(2000);
		applyExplicitWaitsUntilElementClickable(addedwidgetIcon,30).click();
//		applyExplicitWaitsUntilElementClickable(addedWidgetVerticlIcon,30).click();
		
		WebElement Oriactn = ndriver.findElement(By.xpath("//div[normalize-space() = '"+widget+"']//following ::div//div[@class='_Dropdown dropdown']//following::div//div/a/div/div[text()='Action']"));
		
		applyExplicitWaitsUntilElementClickable(Oriactn,30).click();
		Thread.sleep(2000);
		applyExplicitWaitsUntilElementClickable(tvMode,30).click();
		Thread.sleep(3000);
		
		acn=new Actions(ndriver);
		acn.sendKeys(Keys.ESCAPE).build().perform();
		Thread.sleep(1000);
//		applyExplicitWaitsUntilElementClickable(addedWidgetVerticlIcon,30).click();
		
		JavaScriptOperation.scrollToElement(addedwidgetIcon);
		Thread.sleep(2000);
		applyExplicitWaitsUntilElementClickable(addedwidgetIcon,30).click();
		applyExplicitWaitsUntilElementClickable(Oriactn,30).click();                        //original widget Actn
		Thread.sleep(2000);
		applyExplicitWaitsUntilElementClickable(clone,30).click();
Thread.sleep(1000);
//				jse = (JavascriptExecutor) ndriver;
//				jse.executeScript("window.scrollBy(0,2000)");
acn.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(3000);
		WebElement copiedWidgetVIcon= ndriver.findElement(By.xpath("//div[normalize-space() ='"+widget+" - Copy']//following ::div//div[@class='_Dropdown dropdown']"));
		JavaScriptOperation.scrollToElement(copiedWidgetVIcon);
		applyExplicitWaitsUntilElementClickable(copiedWidgetVIcon,30).click();
		
		WebElement actn = ndriver.findElement(By.xpath("//div[normalize-space() ='"+widget+" - Copy']//following ::div//div[@class='_Dropdown dropdown']//following::div//div/a/div/div[text()='Action']"));
		applyExplicitWaitsUntilElementClickable(actn,30).click();
//		applyExplicitWaitsUntilElementClickable(action,50).click();
		Thread.sleep(2000);
		applyExplicitWaitsUntilElementClickable(delete,30).click();
		Thread.sleep(1000);
		applyExplicitWaitsUntilElementClickable(okBtn, 30).click(); 
		Thread.sleep(2000);
		notfn =notification.getText();
		System.out.println(notfn);
		
		return notfn;

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

	public void selectParametersforTableWidget(io.cucumber.datatable.DataTable dataTable ) throws Exception
	{

		applyExplicitWaitsUntilElementClickable(selectParameters,30).click();
		Thread.sleep(2000);
		List<List<String>>	data= dataTable.asLists(String.class);
		System.out.println(data.size());                     //1
		System.out.println(data.get(0).size());                //2

		for(int i = 0;i<data.get(0).size();i++)
		{
			//			applyExplicitWaitsUntilElementClickable(selectParameters,30).click();
			String t = data.get(0).get(i);
			//			Thread.sleep(1000);
			//			System.out.println(t);
			//			ndriver.findElement(By.xpath("//div[text()='"+t+"']")).click();
			//			


			selectParameters.click();
			selectParameter.sendKeys(t);
			WebElement para = ndriver.findElement(By.xpath("//div[contains(@class,'selectionbox_prefix__option') and text()='"+t+"']"));
			para.click();
			Thread.sleep(2000);


			//	Thread.sleep(1000);

			//			ndriver.findElement(By.xpath("//div[text()='"+ data.get(0).get(1)+"']")).click();
		}

	}

	public void selectSensorsforTableWidget(io.cucumber.datatable.DataTable dataTable ) throws Exception
	{

		applyExplicitWaitsUntilElementClickable(selectSensors,30).click();
		Thread.sleep(2000);
		List<List<String>>	data= dataTable.asLists(String.class);
		System.out.println(data.size());
		System.out.println(data.get(0).size());

		for(int i = 0;i<data.get(0).size();i++)
		{
			applyExplicitWaitsUntilElementClickable(selectSensors,30).click();
			String t = data.get(0).get(i);
			ndriver.findElement(By.xpath("//div[text()='"+t+"']")).click();
			//			Thread.sleep(1000);

			//	ndriver.findElement(By.xpath("//div[@class='user-suggestion-contaner']/ul/li[text()='"+ data.get(0).get(1)+"']")).click();
		}

	}

	public void clickOnRefreshAndAddWidget() throws Exception
	{

		//		acn= new Actions(ndriver);
		//		acn.moveToElement(refreshPreview).click().perform();
		JavaScriptOperation.scrollToElement(refreshPreview);
		applyExplicitWaitsUntilElementClickable(refreshPreview,30).click();
		Thread.sleep(3000);
		applyExplicitWaitsUntilElementClickable(addWidget,30).click();
		Thread.sleep(2000);
		String notfn =notification.getText();
		System.out.println(notfn);
	}



	public void editAnomlyWidgetAndSaveChanges() throws Exception
	{
		//		acn=new Actions(ndriver);
		//		applyExplicitWaitsUntilElementClickable( addedWidgetVerticlIcon,30);
		//		applyExplicitWaitsUntilElementClickable(action,30).click();
		//		Thread.sleep(1000);
		//		applyExplicitWaitsUntilElementClickable(tvMode,30).click();
		//		acn.sendKeys(Keys.ESCAPE).perform();
		//		applyExplicitWaitsUntilElementClickable(action,30).click();
		//		Thread.sleep(1000);
		//		applyExplicitWaitsUntilElementClickable(clone,30).click();
		//		Thread.sleep(1000);
		//		jse= (JavascriptExecutor)ndriver;
		//		jse.executeScript("window.scrollBy(0,1000)");
		//		boolean s = isWebElementDisplayed(copiedAnomly);
		//		if(s)
		//		{
		//			System.out.println("AnomlyWidget clone succefully");
		//		}
		//		else {
		//			System.out.println("AnomlyWidget not clone succefully");
		//
		//		}
		//		Thread.sleep(1000);
		//		applyExplicitWaitsUntilElementClickable( copiedAnomlyVerticalIcon,30).click();
		//		applyExplicitWaitsUntilElementClickable(action,30).click();
		//		Thread.sleep(1000);
		//		applyExplicitWaitsUntilElementClickable(delete,30).click();
		//		Thread.sleep(1000);
		//		applyExplicitWaitsUntilElementClickable(okBtn, 30).click();    
		//


		applyExplicitWaitsUntilElementClickable(addedWidgetVerticlIcon, 30).click();  
		Thread.sleep(1000);
		applyExplicitWaitsUntilElementClickable(edit, 30).click();  

		applyExplicitWaitsUntilElementClickable(selPlant, 30).click();    
		applyExplicitWaitsUntilElementClickable(allPlant, 30).click();    
		applyExplicitWaitsUntilElementClickable(selTag, 30).click();    
		applyExplicitWaitsUntilElementClickable(qaAlertLog, 30).click();    
		//
		applyExplicitWaitsUntilElementClickable(enterPrefix, 30).sendKeys("11");    
		applyExplicitWaitsUntilElementClickable(enterSufix, 30).sendKeys("11");;    
		acn.moveToElement(refreshPreview).perform();
		applyExplicitWaitsUntilElementClickable(refreshPreview,30).click();
		Thread.sleep(1000);

		applyExplicitWaitsUntilElementClickable(saveChangesBtn,30).click();
		Thread.sleep(2000);
	}

}







