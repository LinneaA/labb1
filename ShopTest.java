package se.iths;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Before;

public class ShopTest {
	WebDriver driver;
	
	@Before
	public void setup() {
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumGecko\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	/*@After
	public void setup2(){
		driver.close();
	}
	*/
	 @Test
		public void defaultStore() {
			driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
			WebElement book2 = driver.findElement(By.xpath((".//*[@id='site-branding']/div/h1/a")));
			book2.click();
		assertEquals("Shopizer Demo - Default store", driver.getTitle());
		System.out.println(driver.getTitle());
		}
	 
	 @Test

	 public void testComputerBooks() throws InterruptedException {

		 	driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
	 		WebElement storeLink = driver.findElement(By.xpath((".//*[@id='topMain']/li[1]/a/span")));
	 		storeLink.click();
	 		Thread.sleep(2000);
	 		assertEquals("Shopizer Demo - Computer Books", driver.getTitle()); 
	 }
	 
	
	@Test
	public void selectBook() throws InterruptedException {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement book = driver.findElement(By.xpath(("//*[contains(@src, 'google')]")));
		book.click();	
		Thread.sleep(2000);
 		assertEquals("The Big Switch", driver.getTitle()); 

	}
	
	
	  @Test
	public void selectBook2() throws InterruptedException {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement book = driver.findElement(By.xpath(("//*[contains(@src, 'spring')]")));
		book.click();
		Thread.sleep(2000);
 		assertEquals("Spring in Action", driver.getTitle()); 
	} 
	
	
	@Test
	public void selectBook3() {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement book = driver.findElement(By.xpath(("//*[contains(@src, 'node')]")));
		book.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
 		assertEquals("Node Web Development", driver.getTitle()); 
	}
	
	
	@Test
	public void searchField() {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement book = driver.findElement(By.xpath((".//*[@id='searchField']")));
		book.click();
	}
	
	@Test
	public void selectComputerBooks() {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement book = driver.findElement(By.xpath((".//*[@id='footer-section']/div[2]/div/div[3]/div/ul/li[2]/a/span")));
		book.click();
	}
	
	
	@Test
	public void shoppingCart() {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement book = driver.findElement(By.xpath((".//*[@id='open-cart']")));
		book.click();
	}
	
	
	@Test
	public void signInButton() {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement book = driver.findElement(By.xpath((".//*[@id='customerAccount']/button")));
		book.click();
	}
	
	
	@Test
	public void contactUs() throws InterruptedException {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, -250);");
		WebElement book = driver.findElement(By.xpath((".//*[@id='navbar-collapse-2']/ul/li[2]/a")));
		book.click();
		
		Thread.sleep(2000);
		
		WebElement book11 = driver.findElement(By.className("contact-title"));
		System.out.println(book11.getText());
	}
	
	
	@Test
	public void addToCart() throws InterruptedException {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement book = driver.findElement(By.xpath(("//*[contains(@src, 'google')]")));
		book.click();

		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		
		Thread.sleep(2000);
		
		WebElement book5 = driver.findElement(By.xpath((".//*[@id='input-6']/div/button")));
		book5.click();
}

	@Test
	public void testGoToDefaultStore() throws InterruptedException {
		
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/product/the-big-switch.html");
		
		WebElement storeLink = driver.findElement(By.linkText("Default store"));
		
		storeLink.click();
		
		Thread.sleep(2000);
		
		assertEquals("Shopizer Demo - Default store", driver.getTitle());
		driver.close();
		
		System.out.println(driver.getTitle());
} 

	@Test
	public void openTheCart() throws InterruptedException {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement book = driver.findElement(By.xpath(("//*[contains(@src, 'google')]")));
		book.click();

		Thread.sleep(3000);
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		
		Thread.sleep(3000);
		
		WebElement book5 = driver.findElement(By.xpath((".//*[@id='input-6']/div/button")));
		book5.click();
		
		Thread.sleep(3000);
		
		Actions actions2 = new Actions(driver);
		actions2.keyUp(Keys.CONTROL).sendKeys(Keys.HOME).perform();
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(By.id("open-cart")));
	
	WebElement book7 = driver.findElement(By.id("open-cart"));
	
	book7.click();
	
	Thread.sleep(3000);
		
	WebElement book8 = driver.findElement(By.xpath((".//*[@id='miniCartDetails']/li/div/a")));
		
	book8.click();
	
	Thread.sleep(3000);

	WebElement book9 = driver.findElement(By.id("checkoutButton"));
	
	book9.click();
}
	
	
	@Test
	public void openCart() throws InterruptedException {
		driver.get("http://jenkins2017.westeurope.cloudapp.azure.com:8080/shop/");
		WebElement book = driver.findElement(By.xpath(("//*[contains(@src, 'google')]")));
		book.click();

		Thread.sleep(3000);
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		
		Thread.sleep(3000);
		
		WebElement book5 = driver.findElement(By.xpath((".//*[@id='input-6']/div/button")));
		book5.click();
		
		Thread.sleep(3000);
		
		Actions actions2 = new Actions(driver);
		actions2.keyUp(Keys.CONTROL).sendKeys(Keys.HOME).perform();
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(By.id("open-cart")));
	
	WebElement book7 = driver.findElement(By.id("open-cart"));
	
	book7.click();
	
	Thread.sleep(3000);
		
	WebElement book8 = driver.findElement(By.xpath((".//*[@id='miniCartDetails']/li/div/a")));
		
	book8.click();
	
	Thread.sleep(3000);

	WebElement book10 = driver.findElement(By.xpath((".//*[@id='mainCartTable']/tbody/tr[1]/td[5]/button")));
	
	book10.click();
}
	
}