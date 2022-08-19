package org.utillites;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert aa;
	public static Select s;
	public static TakesScreenshot tk;


	
	//1.browser launch
	public static void Launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	//2. get url
	public static void pageurl(String url) {
		driver.get(url);

	}
	
	//3. max window
	public static void winmax() {
		driver.manage().window().maximize();

	}
	
	//4.get title
	
	public static void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	//5. current url
	
	public static void curturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	//6. close
	
	public static void browserclose() {
		driver.close();

	}
	
	//7. quit
	
	public static void browserquit() {
		driver.quit();

	}
	
	//8. sendkeys
	
	public static void fill(WebElement ele, String value) {
		
		ele.sendKeys(value);
	}
	
	
	
	//9. click
	
	public static void btnclick(WebElement ele) {
		
		ele.click();
	}
	
	//10. getText from page
	
	public static void pagegettext(WebElement ele) {
		
		String text = ele.getText();
		System.out.println(text);
		
	}
	
	//11. getAttribute from text
	
	public static void getAttributefrompage(WebElement ele) {
		
		String att = ele.getAttribute("value");
		System.out.println(att);
	
	}
	
	//12. threads
	
	public static void threads() throws InterruptedException {
	
		Thread.sleep(2000);

	}
	
	//13. move to element 
	
	public static void movetoele(WebElement ele) {
	
	a.moveToElement(ele).perform();
		
	}
	
	//14. drag and drop
	
	public static void draganddroppage(WebElement ele) {
	
		a.dragAndDrop(ele, ele).perform();

	}
	
	//15 double click
	
	public static void doubleclick(WebElement ele) {
	
		a.doubleClick(ele).perform();

	}
	
	//16. context click
	
	public static void contextclick(WebElement ele) {
		
		a.contextClick(ele).perform();

	}
	
	//17. enter
	
	public static void enter() throws AWTException {
		
		r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	//18.cut
	
	public static void cuttext() throws AWTException {
		
		r=new Robot();
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);

	}
	
	//19. copy
	
	public static void copttext() throws AWTException {
		
		r=new Robot();
		r.keyPress(KeyEvent.VK_COPY);
		r.keyRelease(KeyEvent.VK_COPY);
	}
	
	//20. paste
	
	public static void pastetext() throws AWTException {
		
		r=new Robot();
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		
	}
	
	//21. key up
	
	public static void keyup() throws AWTException {
		
		r=new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}
	
	//22. key down
	
	public static void keydown() throws AWTException {
		
		r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	
	//23. tab
	
	public static void tab() throws AWTException {
		
		r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}
	
	//24. accept
	
	public static void acceptalert() {
	
		driver.switchTo().alert();
		aa.accept();

	}
	
	//25. dismiss
	
	public static void dismissalert() {
		
		driver.switchTo().alert();
		aa.dismiss();
	}
	
	//26. simple alert
	
	public static void simplealert(WebElement prompt) {
		
		prompt.click();

	}
	
	//27. drop down
	
	public static void byvisible() {
	
		s.selectByVisibleText("Chennai");

	}
	
	//28. byIndex
	
	public static void byind() {
	
		s.selectByIndex(0);

	}
	
	//29. byValue
	public static void byval() {
		s.selectByValue("qcv");

	}
	
	//30. get first select option
	
	public static void getfirst() {
		
		s.getFirstSelectedOption();

	}
	
	//31. deselect
	
	public static void deselectss() {
		
		s.deselectByVisibleText("simple");
	}
	
	//32. byinde
	
	public static void byinde() {
		s.deselectByIndex(0);

	}
	
	//33. byvalu
	public static void byvalu() {
		
		s.deselectByValue("wer");

	}
	
	//34. deselect ALL
	
	public static void deselectall() {
		
		s.deselectAll();

	}
	
	//35. TakesScreenshot
	
	public static void TakesScreenshotss() {
		tk.getScreenshotAs(OutputType.FILE);

	}
	
	//36. FileUtils
	
	public static void futils() throws IOException {
	
		FileUtils.copyDirectory(null, null);

	}
	
	//37. getWindowHandle
	
	public static void singleWindow() {
		
		String handle = driver.getWindowHandle();
		System.out.println(handle);	
	}
	
	//38. getWindowHandles
	
	public static void allwindows() {
		
		Set<String> eachid = driver.getWindowHandles();
		System.out.println(eachid);
		
	}
}