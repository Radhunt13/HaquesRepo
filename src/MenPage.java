import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MenPage {
	public static void main(String args[]) throws InterruptedException{
		WebDriver dr;
		System.setProperty("webdriver.gecko.driver","/Users/haquespc/Downloads/geckodriver");
		dr=new FirefoxDriver();
		dr.get("http://bittechusa.com/");
		dr.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> elements= dr.findElements(By.xpath("//*[@id='menu']/li"));
		
		String man=new String();
		
		for(WebElement elementsPage:elements) {
			String stringText=elementsPage.getText();
			//System.out.println(stringText);
			
			
			if (stringText==man) {
				System.out.println("Print YES");}
				else {
				System.out.println("Print NO");}
		}
				
		
		
	}

}
