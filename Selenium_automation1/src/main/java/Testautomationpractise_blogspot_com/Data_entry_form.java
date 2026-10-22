package Testautomationpractise_blogspot_com;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Data_entry_form {

	static EdgeDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		Selectitem();
		NewTab_Window();
		brokenlink();
		
		ShadowDom();
		FotterLink();
		Uploadfiles();
		
		Form();
		
		laptoplink();
		//
		Slider();
		DragDrop();
		DoubleClick();
		Search();
		Dynamicbutton();
		AlertPopup();
		Hoverpoint();
		
		
		
		
		//Name field
		driver.findElement(By.id("name")).sendKeys("Indra");
		
		//Email field data fillup
		driver.findElement(By.cssSelector("#email")).sendKeys("Indramru1111@gmail.com");
		
		//phone number field fillup
		driver.findElement(By.cssSelector("input#phone")).sendKeys("1111200711");
		
		//Address field fill up
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Hinjawadi phase 1 , pimpari chinchwad, pune , maharashtra , india ");

		//Male check box fill
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		//list all element click
		List<WebElement> days=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		for(int i=0;i<days.size();i++)
		{
			days.get(i).click();
		}
		
		
		//Country select
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByContainsVisibleText("India");
		
		//Select the colour
		driver.findElement(By.xpath("//option[@value='red']")).click();
		
		//Select option value
		driver.findElement(By.xpath("//option[@value='lion']")).click();
		
		//Date picker 1
		driver.findElement(By.id("datepicker")).sendKeys("11/11/2007");
		
		//Date picker 2
		driver.findElement(By.cssSelector("#txtDate")).sendKeys("11/11/2017");
		
	}
	
	
	 public static void Search()
	{
		WebElement search=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		search.sendKeys("Software testing tutorial");
		search.sendKeys(Keys.ENTER);
	}
	
	 
	 public static void Dynamicbutton() throws InterruptedException
	 {
		 WebElement hoverbutton=driver.findElement(By.xpath("//button[@onclick='toggleButton(this)']"));
		 Actions hover=new Actions(driver);
		 hover.moveToElement(hoverbutton).perform();
		 Thread.sleep(4000);
		 hover.click(hoverbutton).perform();
		 
	 }
	 
	 
	 public static void AlertPopup() throws InterruptedException
	 {
		 //Simple alert
		 driver.findElement(By.id("alertBtn")).click();
		 Alert alert=driver.switchTo().alert();
		 Thread.sleep(3000);
		 alert.accept();
		 
		 //Confirmation alert
		 driver.findElement(By.cssSelector("#confirmBtn")).click();
		 Alert alertc=driver.switchTo().alert();
		 Thread.sleep(3000);
		 alertc.dismiss();
		 
		 //Prompt alert
		 driver.findElement(By.cssSelector("button#promptBtn")).click();
		 Alert alertprompt=driver.switchTo().alert();
		 Thread.sleep(3000);
		 alertprompt.sendKeys("I am Indra");
		 alertprompt.accept();
		  
	 }
	 
	 
	 public static void NewTab_Window() throws InterruptedException
	 {
		 //New tab
		 WebElement newtab=driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		 newtab.click();
		 //All window id are stores in the variable
		 
		 String Windowid=driver.getWindowHandle();
		 Thread.sleep(4000);
		 driver.switchTo().window(Windowid);
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("PopUp")).click();
		 Thread.sleep(5000);
		 
		 //Multiple window handle
		 Set<String> mlinks=driver.getWindowHandles();
		 
		 //Conver link set to Arrylist
		 List<String> mainwindo = new ArrayList(mlinks);
	
		 //store the id of window in string
		 String mw=mainwindo.get(0);
		 String cw=mainwindo.get(1);
		 String cw2=mainwindo.get(2);
		 
		 //Switching the window and close the window
		 driver.switchTo().window(cw);
		 driver.close();
		 driver.switchTo().window(mw);
		 
		 
		 
		 
		 
	
		 
		 
//		 
//		 for(int i=0;i<mainwindo.size();i++)
//		 {
//			String mwindow=mainwindo.get(0);
//			String childwindow=maine
//			
//			
//			if(mwindow!=mainwindo.get(i))
//			{
//				mainwindo.get(i).
//			}
//			 
//		 }
		 
		 
		 
		 
		 
		 
		 
//		 driver.close();
//		 driver.switchTo().window(Windowid);
		 
		 
		 
		 
		 //By Multiple window handles
//		 Set<String> windowIds=driver.getWindowHandles();
//		 
//		 List<String> windowlist=new ArrayList(windowIds);
//		 
//		String parentid=windowlist.get(0);
//		String childid=windowlist.get(1); 
//		 
//		Thread.sleep(5000);
//		driver.switchTo().window(parentid);
//		 		 
	 }
	 
	 
	 public static void Hoverpoint() throws InterruptedException
	 {
		 WebElement hover=driver.findElement(By.xpath("//button[text()='Point Me']"));
		 Actions act=new Actions(driver);
		 
		 act.moveToElement(hover).perform();
		 
		 Thread.sleep(5000);
	 }
	 
	 public static void DoubleClick() throws InterruptedException
	 {
		 WebElement Doubleclick=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		 
		 Actions act=new Actions(driver);
		 
		 act.doubleClick(Doubleclick).perform();
		 Thread.sleep(5000);	 
	 }
	
	 
	 public static void DragDrop()
	 {
		 WebElement Drag=driver.findElement(By.id("draggable"));
		 WebElement Drop=driver.findElement(By.id("droppable"));
		 
		 
		 Actions act=new Actions(driver);
		 
		 act.dragAndDrop(Drag, Drop).build().perform();
		 
	 }
	 
	 public static void Slider()
	 {
		 WebElement Slider=driver.findElement(By.xpath("//span[@style='left: 15%;']"));
		 
		 
		 Actions act=new Actions(driver);
		 
		 act.dragAndDropBy(Slider, 50, 0).build().perform();
	 }
	 
	 public static void Selectitem()
	 {
		 
		 WebElement select=driver.findElement(By.xpath("//div[@id='dropdown']/div[11]"));
		 
		 select.click();
		 
		 
		 
		 
//		 WebElement items=driver.findElement(By.id("comboBox"));
//		 
//		 Select item=new Select(items);
//		 item.selectByContainsVisibleText("Item 11");
//		 
//		 driver.findElement(By.cssSelector("input[placeholder='Select an item']"))
	 }

	 
	 public static void laptoplink()
	 {
		 driver.findElement(By.id("apple")).click();
		 driver.navigate().back();
		 driver.findElement(By.id("lenovo")).click();
		 driver.navigate().back();
		 driver.findElement(By.id("dell")).click();
		 driver.navigate().back(); 
	 }
	 
	 
	 public static void brokenlink() throws InterruptedException
	 {
		 
		 List<WebElement> links=driver.findElements(By.partialLinkText("Errorcode"));
		 
		 for(int i=0;i<links.size();i++)
		 {
			 links.get(i).click();
			 Thread.sleep(1000);
			 driver.navigate().back();
			 Thread.sleep(2000);
		 }
		 
		 
		 
		 //code is convert less
		 
//		 driver.findElement(By.xpath("//a[@href='http://www.deadlinkcity.com/error-page.asp?e=400']")).click();
//		 Thread.sleep(4000);
//		 driver.navigate().back();
//		 
//		 driver.findElement(By.xpath("//a[@href='http://www.deadlinkcity.com/error-page.asp?e=401']")).click();
//		 driver.navigate().back();
//		 
//		 driver.findElement(By.xpath("//a[@href='http://www.deadlinkcity.com/error-page.asp?e=403']")).click();
//		 driver.navigate().back();
//		 
//		 driver.findElement(By.xpath("//a[@href='http://www.deadlinkcity.com/error-page.asp?e=404']")).click();
//		 driver.navigate().back();
//		 
//		 driver.findElement(By.xpath("//a[@href='http://www.deadlinkcity.com/error-page.asp?e=408']")).click();
//		 driver.navigate().back();
//		 
//		 driver.findElement(By.xpath("//a[@href='http://www.deadlinkcity.com/error-page.asp?e=500']")).click();
//		 driver.navigate().back();
//		 
//		 driver.findElement(By.xpath("//a[@href='http://www.deadlinkcity.com/error-page.asp?e=502']")).click();
//		 driver.navigate().back();
//		 
//		 driver.findElement(By.xpath("//a[@href='http://www.deadlinkcity.com/error-page.asp?e=503']")).click();
//		 driver.navigate().back();
	 }
	 
	 public static void Form()
	 {
		 driver.findElement(By.id("input1")).sendKeys("Paragraph1");
		 driver.findElement(By.id("btn1")).click();
		 
		 driver.findElement(By.id("input2")).sendKeys("Paragraph2");
		 driver.findElement(By.id("btn2")).click();
		 
		 driver.findElement(By.id("input3")).sendKeys("Paragraph3");
		 driver.findElement(By.id("btn3")).click();
	 }
	 
	 
	 public static void ShadowDom() throws InterruptedException
	 {
		 SearchContext shadow=driver.findElement(By.cssSelector("#shadow_host")).getShadowRoot();
		 Thread.sleep(2000);
		 //SearchContext shadow=shadow1.findElement(By.cssSelector("#nested_shadow_host")).getShadowRoot();
		 Thread.sleep(2000);
		 shadow.findElement(By.cssSelector("input[type='text']")).sendKeys("I handle the ShadowDom");
		 System.out.println(shadow.toString());
		 shadow.findElement(By.cssSelector("input[type='checkbox']")).click();
		 
	 }
	 
	 
	 public static void Uploadfiles()
	 {
		 
		 //Single File Upload
		WebElement file=driver.findElement(By.id("singleFileInput"));
		file.sendKeys("C:\\Users\\asus\\OneDrive\\Pictures\\venkateshwara-swamy-7680x4320-14468.png");
		
		driver.findElement(By.xpath("//button[text()='Upload Single File']")).click();
		
		
		//Multiple File Upload
		WebElement mfile=driver.findElement(By.id("multipleFilesInput"));
		
		mfile.sendKeys("C:\\Users\\asus\\OneDrive\\Pictures\\Screenshots 1\\Screenshot 2026-07-22 154531.png\n" + "C:\\Users\\asus\\OneDrive\\Pictures\\Screenshots 1\\Screenshot 2026-07-22 154908.png");
		
		WebElement tfile=driver.findElement(By.xpath("//button[text()='Upload Multiple Files']"));
		tfile.click();
	 }
	 
	 public static void FotterLink() throws InterruptedException
	 {
		 driver.findElement(By.partialLinkText("Home")).click();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.partialLinkText("Hidden Elements & AJAX")).click();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 
		 Thread.sleep(3000);
		 driver.findElement(By.partialLinkText("Download Files")).click();
		 Thread.sleep(3000);
		 driver.navigate().back();
		 Thread.sleep(3000);
		 
	 }
}
