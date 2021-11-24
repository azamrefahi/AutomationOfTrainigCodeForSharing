package PeopleNTech.Automationtraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowser {
    private static final char[] Windowhandle = null;
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//i)how to open browser
      System.setProperty("webdriver.chrome.driver","C:\\Users\\azamr\\eclipse-workspace\\Automationtraining\\src\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("https://www.amazon.com");
	driver.manage().window().maximize();
	Thread.sleep(6000);
	driver.navigate().refresh();
	Thread.sleep(6000);
	driver.navigate().back();
	Thread.sleep(6000);
	driver.navigate().forward();
	Thread.sleep(6000);
	String windowhandle=driver.getWindowHandle();
	System.out.println(Windowhandle);
	String urlofbrowser=driver.getCurrentUrl();
	System.out.println(urlofbrowser);
	driver.close();
	}
}
