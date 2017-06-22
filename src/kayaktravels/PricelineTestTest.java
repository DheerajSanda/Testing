package kayaktravels;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PricelineTestTest {

	public static WebDriver driver;

@Test(priority=1)	
	public void launchBrowser(){
	System.setProperty("webdriver.chrome.driver","E:/chromedriver.exe");
	driver = new ChromeDriver();
}

@Test(priority=2)
	public void webPage(){
	driver.get("https://www.priceline.com/home/");
}

@Test(priority=3)
	public void PageTitle(){
	System.out.println(driver.getTitle()); //Priceline.com - The Best Deals on Hotels, Flights and Rental Cars.
	Assert.assertEquals(driver.getTitle(),"Priceline.com - The Best Deals on Hotels, Flights and Rental Cars.");
}

@Test(priority=4)
	public void Login() throws InterruptedException{
	driver.findElement(By.xpath("//button[@id='in-path-sign-in-out-click'][@class='navbar-btn btn-priceline btn-arrow']")).click();
	driver.findElement(By.xpath("//input[@id='signin-first-name'][@name='lname']")).sendKeys("dheeraj.sanda@gmail.com");
	driver.findElement(By.xpath("//input[@class='register__form-field-password'][@name='password']")).sendKeys("dheeraj@123");
	driver.findElement(By.xpath("//button[@id='button-sign-in']")).click();
	Thread.sleep(9000);

}

@Test(priority=5)
	public void ExpressDeals(){
	driver.findElement(By.xpath("//a[@data-ga-action='Click_Express Deal']")).isDisplayed();

}

@Test(priority=6)
	public void FindMyTrip() throws InterruptedException{
	driver.findElement(By.xpath("//span[@id ='myTrips-nav-title']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='/profile/#/checkstatus'][@data-ga-label='view_itinerary']")).click();
	Thread.sleep(4000);
	driver.get("https://www.priceline.com/home/");

}

@Test(priority=7)
	public void HelpContactUs(){
	driver.findElement(By.xpath("//button[@id='in-path-help-click']")).click();
	driver.findElement(By.xpath("//a[@class='global-header-dropdown-link'][@href='/help/#/'][@data-ga-label='contact_us']")).click();

}

@Test(priority=8)
	public void HotelsSearchButton() throws InterruptedException{
	ArrayList<WebElement> navs = (ArrayList<WebElement>) driver.findElements(By.tagName("nav"));
	
	//System.out.println(navs.get(0).findElements(By.tagName("a")).get(1).getAttribute("innerHTML"));
	navs.get(0).findElements(By.tagName("a")).get(1).click();

	ArrayList<WebElement> Search = (ArrayList<WebElement>) driver.findElements(By.tagName("section"));
	/*System.out.println(Search.get(0).getAttribute("innerHTML"));
	System.out.println(Search.get(1).getAttribute("innerHTML"));
	System.out.println(Search.get(2).getAttribute("innerHTML"));
	//for(int i=0;i<10;i++){
		System.out.println(Search.get(7).findElements(By.tagName("button")).get(0).getAttribute("innerHTML"));//
	*///}
	Search.get(7).findElements(By.tagName("button")).get(0).isDisplayed();
	Thread.sleep(9000);

}

@Test(priority=9)
	public void navbar(){
	//cars
	driver.findElement(By.xpath("//a[@class='global-header-nav-product-link'][@href='/rentalcars/']")).click();
	//flights
	driver.findElement(By.xpath("//a[@class='global-header-nav-product-link'][@href='/flights/']")).click();
	//packages
	driver.findElement(By.xpath("//a[@class='global-header-nav-product-link'][@href='/vacationpackages/']")).click();
	//Cruises
	driver.findElement(By.xpath("//a[@class='global-header-nav-product-link'][@href='http://cruises.priceline.com/']")).click();

}

@Test(priority=10)
	public void LasVegas() throws InterruptedException{
	driver.get("https://www.priceline.com/home/");
	Thread.sleep(11000);
	driver.findElement(By.xpath("//a[@href='/stay/#/search/hotels/Las Vegas/1']")).click();
	Thread.sleep(6000);
	driver.get("https://www.priceline.com/home/");
}

@Test(priority=11)
	public void SearchBox() throws InterruptedException{
	driver.get("https://www.priceline.com/home/");
	//calendar
	driver.findElement(By.xpath("html/body/div[2]/div/div/div/section[1]/div/div[1]/div[1]/div/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]/div[1]/div/div/input")).sendKeys("6/15/2017");
	//driver.findElement(By.xpath("html/body/div[2]/div/div/div/section[1]/div/div[1]/div[1]/div/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/div/div/div/div[2]/div[1]/div/div/input")).click();		
	driver.findElement(By.xpath("//button[@id='in-path-help-click']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("html/body/div[2]/div/div/div/section[1]/div/div[1]/div[1]/div/div[2]/div[1]/div/div/div[2]/div[1]/div[1]/div/div/div/div[2]/div[1]/div/div/input")).sendKeys("6/22/2017");
	//driver.findElement(By.xpath("//button[@id='in-path-help-click']")).click();
	//rooms
	Select dropdown = new Select(driver.findElement(By.xpath("html/body/div[2]/div/div/div/section[1]/div/div[1]/div[1]/div/div[2]/div[1]/div/div/div[2]/div[1]/div[2]/div/select")));
	dropdown.selectByIndex(2);
	//SearchBox
	driver.findElement(By.xpath("//input[@placeholder='Destination']")).sendKeys("New York");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='in-path-help-click']")).click();		
	Thread.sleep(2000);

	//SearchButton
	driver.findElement(By.xpath("html/body/div[2]/div/div/div/section[1]/div/div[1]/div[1]/div/div[2]/div[1]/div/div/div[2]/div[2]/button")).click();	
	Thread.sleep(9000);
	System.out.println(driver.findElement(By.xpath("//div[@class='xsell-design xsell-design-sopq ng-scope']")).isDisplayed());

}

@Test(priority=11)
	public void SignOut() throws InterruptedException{
	driver.findElement(By.xpath("//button[@id='in-path-sign-in-out-click']")).click();
	driver.findElement(By.xpath("//span[@class='sign-out-menu-button-text'][text()='Sign out']")).click();
	driver.close();	}
}

