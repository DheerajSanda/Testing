package kayaktravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class kayakTest {
public static WebDriver driver;
@BeforeMethod
public void launchBrowser(){
	System.setProperty("webdriver.chrome.driver","E:/chromedriver.exe");
	driver = new ChromeDriver();
}


@Test(priority=1)
public void Verifytitle() throws InterruptedException{
	driver.get("https://www.kayak.com/");
	Thread.sleep(3000);
	Assert.assertEquals("Search Flights, Hotels & Rental Cars | KAYAK",driver.getTitle());
}
@Test(priority=2)
public void Hotels() throws InterruptedException{
	driver.get("https://www.kayak.com/");
	driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/header/div/div[2]/div/nav/div/div[1]/a")).click();
	String URL = driver.getCurrentUrl();
	System.out.println(URL);
	Thread.sleep(3000);
	Assert.assertEquals(URL, "https://www.kayak.com/hotels" );
}

@Test(priority=3)
public void Flights() throws InterruptedException{
	driver.get("https://www.kayak.com/");
	driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/header/div/div[2]/div/nav/div/div[2]/a")).click();
	Thread.sleep(3000);
	String URL2 = driver.getCurrentUrl();
	System.out.println(URL2);
	Assert.assertEquals(URL2, "https://www.kayak.com/flights" );
}
@Test(priority=4)
public void cars() throws InterruptedException{
	driver.get("https://www.kayak.com/");
	driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/header/div/div[2]/div/nav/div/div[3]/a")).click();
	Thread.sleep(3000);
	String URL3 = driver.getCurrentUrl();
	System.out.println(URL3);
	Assert.assertEquals(URL3, "https://www.kayak.com/cars" );
}

@Test(priority=5)
public void SearchBox() throws InterruptedException{
	driver.get("https://www.kayak.com/");
	//Business
	driver.findElement(By.xpath("//label[@title='Leisure']/following::span[1]")).click();
	//search box
	driver.findElement(By.xpath("html/body/div[1]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div/div/div[1]/div[2]/form/div[2]/div[1]/input[1]")).sendKeys("New York, NY");
	//more options
	driver.findElement(By.xpath("html/body/div[1]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div/div/div/div[2]/form/div[3]/div/div/div[1]/div/a/span[2]")).click();
	
	//5 stars
	Select dropdown = new Select(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div/div/div/div[2]/form/div[3]/div/div/div[2]/div/div[1]/div/select")));
	dropdown.selectByIndex(3);

	Select dropdown1 = new Select(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div/div/div/div[2]/form/div[3]/div/div/div[2]/div/div[2]/div/select")));
	dropdown1.selectByIndex(0);

	Select dropdown2 = new Select(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div/div/div/div[2]/form/div[3]/div/div/div[2]/div/div[3]/div/select")));
	dropdown2.selectByIndex(1);

	Select dropdown3 = new Select(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div/div/div/div[2]/form/div[3]/div/div/div[2]/div/div[4]/div/select")));
	dropdown3.selectByIndex(1);
	driver.findElement(By.xpath("html/body/div[1]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div/div/div[1]/div[2]/form/div[2]/div[2]/div/div[2]/div[1]/div/input")).click();
	driver.findElement(By.xpath("html/body/div[7]/div[4]/div[4]/div/div[2]/div/div[3]/div[3]/div[5]/div")).click();
	driver.findElement(By.xpath("html/body/div[1]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div/div/div[1]/div[2]/form/div[2]/div[2]/div/div[2]/div[3]/div/input")).click();
	driver.findElement(By.xpath("html/body/div[7]/div[4]/div[4]/div/div[3]/div/div[3]/div[3]/div[7]/div")).click();

	//search
	driver.findElement(By.xpath("html/body/div[1]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div/div/div[1]/div[2]/form/div[2]/div[4]/button")).click();
	Thread.sleep(4000);
	String url4 = driver.getCurrentUrl();
	System.out.println("Search url = "+url4);
	Assert.assertEquals(url4, "https://www.kayak.com/hotels/York,NY,US/2017-06-15/2017-07-15/2guests" );

}

@AfterMethod
public void closeBrowser(){
	driver.close();
}


}
