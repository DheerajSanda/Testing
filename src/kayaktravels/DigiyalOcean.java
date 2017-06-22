package kayaktravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DigiyalOcean {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E:/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.digitalocean.com/");		
/*//NavBar
//Products		
driver.findElement(By.xpath("//div[@class='Dropdown']//button[@class='Button--reset TopNav-link']")).click();		
//overview
driver.findElement(By.xpath("//ul[@class='Dropdown-nav']//a[@href='/products/']")).click();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
//compute
driver.findElement(By.xpath("//div[@class='Dropdown']//button[@class='Button--reset TopNav-link']")).click();		
driver.findElement(By.xpath("//ul[@class='Dropdown-nav']//a[@href='/products/compute/']")).click();
driver.navigate().back();
Thread.sleep(2000);
//Storage
driver.findElement(By.xpath("//div[@class='Dropdown']//button[@class='Button--reset TopNav-link']")).click();		
driver.findElement(By.xpath("//ul[@class='Dropdown-nav']//a[@href='/products/storage/']")).click();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
*//*//Apps
//driver.findElement(By.xpath("//ul[@class='Dropdown-nav']//a[@href='/products/one-click-apps/']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='Dropdown']//button[@class='Button--reset TopNav-link']")).click();		
driver.findElement(By.xpath("//li//a[@class='TopNav-link'][@href='/products/one-click-apps/']")).click();
*/

/*//Business
Thread.sleep(2000);
driver.findElement(By.xpath("//nav[@class='TopNav-left']//a[@class='TopNav-link'][@href='/business/']")).click();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);

//Pricing
driver.findElement(By.xpath("//nav[@class='TopNav-left']//a[@class='TopNav-link'][@href='/pricing/']")).click();
Thread.sleep(2000);
*/
//community
/*driver.findElement(By.xpath("//nav[@class='TopNav-left']//a[@class='TopNav-link'][@href='/community/']")).click();
Thread.sleep(2000);*/
/*//Tutorials
driver.findElement(By.xpath("//div[@class='main-menu-container']//a[@href='/community/tutorials']")).click();
Thread.sleep(2000);
//questions
driver.findElement(By.xpath("//div[@class='main-menu-container']//a[@href='/community/questions']")).click();
Thread.sleep(2000);
//Projects
driver.findElement(By.xpath("//div[@class='main-menu-container']//a[@href='/community/projects']")).click();
Thread.sleep(2000);
//Search
driver.findElement(By.xpath("//div[@class='query-input-container']//input[@placeholder='Search Projects']")).sendKeys("Cloudways");
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='filter-objects']//a[@href='/community/projects/cloudways']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@href='http://www.cloudways.com/en/']")).click();
*/
//Droplet
driver.findElement(By.xpath("//img[@class='Home-featureIcon is-loaded'][@src='/assets/media/homepage/deploy-in-seconds-a5f58113.svg']")).click();
driver.navigate().back();
Thread.sleep(2000);
//Price switch
driver.findElement(By.xpath("//label[@for='Pricing-switcher']")).click();
driver.findElement(By.xpath("")).click();
driver.findElement(By.xpath("")).click();




//driver.close();
	}

}
