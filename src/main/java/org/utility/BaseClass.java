package org.utility;

    import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
	import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
    import org.openqa.selenium.remote.server.handler.interactions.touch.Down;
    import org.openqa.selenium.support.ui.Select;

		import io.github.bonigarcia.wdm.WebDriverManager;
		
		public class BaseClass {
				
            public static WebDriver driver;
			
		    public static WebDriver chromeBrowser() {
		    	WebDriverManager.chromedriver().setup();
		    	driver=new ChromeDriver();
				return driver;
		    	
		    }
		    	
		     public static  void urlLaunch(String url) {
				driver.get(url);
			}

			public static void maximize() {
		        driver.manage().window().maximize();
		    }
			
			public static  void implicitWait(long secs) {
				driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
			}
			
			public static  void sendkeys(WebElement e,String value) {
				e.sendKeys(value);
			}
			
			public static  void click(WebElement e) {
				e.click();
			}
			
			public static  void quit() {
				driver.quit();
			}
			
			public static String currentUrl() {
				String url=driver.getCurrentUrl();
				return url;
			}
			
			public static  String title() {
				String title = driver.getTitle();
				return title;
		    }
			
			public static String getAttribute(WebElement e) {
				String att = e.getAttribute("value");
				return att;
				
			}
			
			public static  void movetoElement(WebElement target) {
				Actions a=new Actions(driver);
				a.moveToElement(target).perform();
			}
			
			public static  void dragAnddrop(WebElement src,WebElement des) {
				Actions a=new Actions(driver);
				a.dragAndDrop(src, des).perform();
			}
			public static  void doubleclick(WebElement e) {
				Actions a=new Actions(driver);
				a.doubleClick(e).perform();
			}
			public static  void contextclick(WebElement e) {
				Actions a=new Actions(driver);
				a.contextClick(e).perform();
			}
			
			public static void selectByIndex(WebElement e,int index) {
				Select s=new Select(e);
				s.selectByIndex(index);
			}
			
			public static  void selectByValue(WebElement e,String value) {
				Select s=new Select(e);
				s.selectByValue(value);
			}
			
			public static  void selectByVisibleText(WebElement e,String value) {
				Select s=new Select(e);
				s.selectByValue(value);
				
			}
			
			public static  void getOptions(WebElement e,String value) {
				Select s=new Select(e);
				s.getOptions();
				
			}
			
			public static void isMultiple(WebElement e,String value) {
				Select s=new Select(e);
				s.isMultiple();
				
	       }
			
			public static void deselectByIndex(WebElement e,int index) {
				Select s=new Select(e);
				s.selectByIndex(index);
			}
			
			public static  void deselectByValue(WebElement e,String value) {
				Select s=new Select(e);
				s.selectByValue(value);
			}
			
			public static  void deselectByVisibleText(WebElement e,String value) {
				Select s=new Select(e);
				s.selectByValue(value);
				
			}
			
			public static  void deSelectAll(WebElement e) {
				Select s=new Select(e);
				s.deselectAll();
				
	        }
			
			public static  void getScreenshotAs(WebElement e) {
				TakesScreenshot tk=(TakesScreenshot)driver;
				tk.getScreenshotAs(null);
			
			}
			
			public static String getwindowHandle() {
			    String handle = driver.getWindowHandle();
		        return handle;
				
		    }
			
			public static Set<String>  getWindowHandles() {
				Set<String> windowHandles = driver.getWindowHandles();
				return windowHandles;
				
			}

		    public static void down() throws AWTException  {
	        	 Robot r=new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
	            r.keyRelease(KeyEvent.VK_DOWN);
	        	
		    }
	        
	        public static void enter() throws AWTException  {
	        	Robot r=new Robot();
	        	r.keyPress(KeyEvent.VK_ENTER);
	        	r.keyRelease(KeyEvent.VK_ENTER);
				
			}
			 
	        public static  void cntrlA() throws AWTException {
	        	Robot r=new Robot();
	        	r.keyPress(KeyEvent.VK_CONTROL);
	        	r.keyPress(KeyEvent.VK_A);
	        	r.keyRelease(KeyEvent.VK_CONTROL);
	        	r.keyRelease(KeyEvent.VK_A);
		    }
			
	        public static  void cntrlC() throws AWTException {
	        	Robot r=new Robot();
	        	r.keyPress(KeyEvent.VK_CONTROL);
	        	r.keyPress(KeyEvent.VK_C);
	        	r.keyRelease(KeyEvent.VK_CONTROL);
	        	r.keyRelease(KeyEvent.VK_C);
		    }
	        public static  void cntrlV() throws AWTException {
	        	Robot r=new Robot();
	        	r.keyPress(KeyEvent.VK_CONTROL);
	        	r.keyPress(KeyEvent.VK_V);
	        	r.keyRelease(KeyEvent.VK_CONTROL);
	        	r.keyRelease(KeyEvent.VK_V);
		    }
	        public static  void Tab() throws AWTException {
	        	Robot r=new Robot();
	        	r.keyPress(KeyEvent.VK_TAB);
	        	r.keyRelease(KeyEvent.VK_TAB);
		    }
	        
	        public static String getExcel(String filename, String sheetname, int row, int c) throws IOException {
	        	File f=new File("C:\\Users\\DELL\\eclipse-workspace\\Maven\\src\\test\\resources\\"+filename+".xlsx");
	    		
	    		FileInputStream fi=new FileInputStream(f);
	    		
	    		Workbook w=new XSSFWorkbook(fi);
	    		
	    		Sheet s=w.getSheet(sheetname);
	    		
	    		Row r=s.getRow(row);
	    		
	    		Cell cell=r.getCell(c);
	    		
	    		int type = cell.getCellType();
	    		
	    		String value=null;
	    		
				if(type==1) {
	    			 value = cell.getStringCellValue();
	    			
	    		}
	    		else {
	    			
					if(DateUtil.isCellDateFormatted(cell))
	    			{
	    				Date d = cell.getDateCellValue();
	    				SimpleDateFormat s1= new SimpleDateFormat("dd-MM-yy");
	    				value = s1.format(d);
	    				
	    			}
	    			else
	    			{
	    				double d = cell.getNumericCellValue();
	    				long l=(long)d;
	    			    value = String.valueOf(l);
	    			
	    			}
	    		}
	    		
	    		return value;
				
			}
			
	       
	        	
				
	
			
			
		}
		
			
		
				

			
			
			
			
			
			
			
				

			
				
				
				

			
			

		






