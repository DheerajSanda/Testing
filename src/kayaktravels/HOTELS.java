package kayaktravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HOTELS {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","E:/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.hotels.com/?intlid=HOME+%3A%3A+header_main_section");
//Hotels icon
driver.findElement(By.xpath("//a[@href='/?intlid=HOME+%3A%3A+header_main_section']")).isDisplayed();

/*driver.findElement(By.xpath("//a[@href='/profile/landing.html?intlid=HOME+%3A%3A+header_main_section']")).click();
driver.findElement(By.xpath("//a[@href='/profile/signin.html?target=H4sIAAAAAAAAANO3z8wryclMsU3W0zNINLIsr3Ix8c7JdA2r8Hd2TncKdfSq8jXLzfcyyg9KS7LQDU_LCXVOTPXVAwAC1NXROAAAAA..&intlid=HOME+%3A%3A+header_accounts_section']")).click();
driver.findElement(By.xpath("//input[@id='sign-in-email'][@name='email']")).sendKeys("dheeraj.sanda@gmail.com");
driver.findElement(By.xpath("//input[@id='sign-in-persistant'][@name='rememberMe']")).click();
driver.findElement(By.xpath("//input[@id='sign-in-password']")).sendKeys("dheeraj@123");
driver.findElement(By.xpath("//div[@class='form-actions']//button[1]")).click();
driver.findElement(By.xpath("//a[@href='/?intlid=HOME+%3A%3A+header_main_section']")).click();
*/

driver.findElement(By.xpath("//label[@id='widget-query-label-1']")).click();
driver.findElement(By.xpath("//a[@aria-label='06/15/17']")).click();
driver.findElement(By.xpath("//label[@id='widget-query-label-3']")).click();
driver.findElement(By.xpath("//a[@aria-label='06/22/17']")).click();
driver.findElement(By.xpath("//div[@class='widget-query-group widget-query-destination']//input[1]")).sendKeys("New York");
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@href='/profile/landing.html?intlid=HOME+%3A%3A+header_main_section']")).click();
driver.findElement(By.xpath("//a[@href='/profile/landing.html?intlid=HOME+%3A%3A+header_main_section']")).click();


//Rooms
Select dropdown = new Select(driver.findElement(By.xpath("//div[@class='widget-query-room-number']//select[@id='qf-0q-compact-occupancy']")));
dropdown.selectByIndex(1);

/*Select dropdown2 = new Select(driver.findElement(By.xpath("//select[@id='qf-0q-rooms'][@name='q-rooms']")));
dropdown2.selectByIndex(2);

Select dropdown3 = new Select(driver.findElement(By.xpath("//select[@id='qf-0q-room-0-adults'][@name='q-room-0-adults']")));
dropdown3.selectByIndex(2);

Select dropdown4 = new Select(driver.findElement(By.xpath("//select[@id='qf-0q-room-0-children'][@name='q-room-0-children']")));
dropdown4.selectByIndex(2);
*/

//search button
driver.findElement(By.xpath("//div[@class='widget-query-group widget-query-ft']//button[@class='cta cta-strong']")).click();
Thread.sleep(3000);

driver.get("https://www.hotels.com/?intlid=HOME+%3A%3A+header_main_section");

//Hotels.com APP
driver.findElement(By.xpath("//a[@href='https://170552.measurementapi.com/serve?action=click&publisher_id=170552&site_id=100374&site_id_android=100380&site_id_web=113995&destination_id=317749&my_publisher=brand.site.footer&intlid=web_footer']")).isDisplayed();
/*
//navbar
//HotelDeals
driver.findElement(By.xpath("//a[@href='/hotel-deals/?intlid=HOME+%3A%3A+header_main_section']")).click();
//Packages
driver.findElement(By.xpath("//a[@href='http://travel.hotels.com/packages-flights?intlid=OTHER+%3A%3A+header_main_section']")).click();
//Groups
//driver.findElement(By.xpath("//a[@href='http://groups.hotels.com/GroupForm.cfm?locale=en_US&intlid=OTHER+%3A%3A+header_main_section&kw=header']")).click();
//Gift Cards
//driver.findElement(By.xpath("//a[@href='/page/giftcards?intlid=OTHER+%3A%3A+header_main_section']")).click();
//Help
driver.findElement(By.xpath("//a[@href='/customer_care/index.html?intlid=OTHER+%3A%3A+header_customer_section']")).click();
//Website FeedBack
driver.findElement(By.xpath("//li[@class='last-child ']//a[@href='mailto:userexperience@hotels.com?subject=Site%20feedback:%20OTHER|en_US|HCOM_US|www.hotels.com']")).click();
*/

driver.findElement(By.xpath("//button[@class='show-more-btn']")).click();
driver.findElement(By.xpath("//a[@href='https://www.hotels.com/de1410382/hotels-houston-texas/']//div[@data-destination-name='Houston']")).click();


	}

}
