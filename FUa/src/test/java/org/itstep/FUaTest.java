package org.itstep;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;

import junit.framework.Assert;

public class FUaTest {

	WebDriver driver = null;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\TESTS\\WEB DRIVERS\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://f.ua/");

	}

	@Test
	public void test() {
		WebElement pap = driver.findElement(By.xpath(
				"//a[@class='title not_auth']"));
		pap.click();
		
		
		
		
		/*String parentWindow = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for (String window : all) {
			driver.switchTo().window(window);*/
			WebElement text = driver.findElement(By.linkText("Создать новый профиль"));
			text.click();
			
			
		//}
		
	//	driver.switchTo().window(parentWindow);
	    
			
			WebElement name = driver.findElement(By.xpath("//form[@id='register_form']/div[1]/div[2]/input"));
			name.sendKeys("Mishanya22");
			
			WebElement mail =driver.findElement(By.xpath("//form[@id='register_form']/div[2]/div[2]/input"));
		mail.sendKeys("Mishko22@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//form[@id='register_form']/div[3]/div[2]/div[2]/input"));
		password.sendKeys("123456");
		
		WebElement password2 = driver.findElement(By.xpath("//form[@id='register_form']/div[3]/div[3]/div[2]/input"));
		password2.sendKeys("123456");
		
		WebElement button = driver.findElement(By.xpath("//form[@id = 'register_form']/div[5]/input"));
		button.submit();
		
		WebElement tel =driver.findElement(By.linkText("Телефоны, ноуты, планшеты"));
		String href = tel.getAttribute("href");
		driver.get(href);
		
		WebElement tel1 = driver.findElement(By.xpath("//a[@rel='https://f.ua/statik/images/icons/45_1.png']"));
		String href1 = tel1.getAttribute("href");
		driver.get(href1);
		
		WebElement tel2 = driver.findElement(By.xpath("//div[@id='item_5521443']/div[1]/div[1]/div[5]/a"));
		String href2 = tel2.getAttribute("href");
		driver.get(href2);
		
		
		
		WebElement telName = driver.findElement(By.xpath("//div[@class='info'][@style='height: auto;']"));
		WebElement h1 = telName.findElement(By.tagName("h1"));
		String mob = h1.getText();
		//Assert.assertTrue(mob.equals("Смартфон Xiaomi Redmi Note 5 4/64GB Black"));
		assertEquals("Смартфон Xiaomi Redmi Note 5 4/64GB Black",mob);
				
	
		
		//добавление товара в карзину 
		
		//*[@id="ga-master-id"]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[2]/div[4]/div[1]/div[2]/div[10]/a
		
		//*[@id="ga-master-id"]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[2]/div[4]/div[1]/div[2]/div[10]/a
		
		WebElement tov = driver.findElement(By.xpath("//*[@id=\"ga-master-id\"]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[2]/div[4]/div[1]/div[2]/div[10]/a"));
	//	WebElement tov = driver.findElement(By.linkText("В корзину"));
		/*String hhref = tov.getAttribute("href");
		driver.get(hhref);*/
		tov.click();
		
		WebElement karzina = driver.findElement(By.xpath("//div[@id='popup_content']/div[1]/div[1]/div[1]/a"));
		String karz = karzina.getAttribute("href");
		driver.get(karz);
		
		
		/*WebElement textTrue = driver.findElement(By.partialLinkText("Вы добавили 2 товара на сумму "));
		Srting textSing = textTrue.getText();
		assertEquals(textSing, "Вы добавили 2 товара на сумму ");*/
		
		/*WebElement texti = driver.findElement(By.xpath("//div[@id='cart_container']/div"));
		int textb = texti.getSize();
		System.out.println(textb);
	//	String textb = texti.findElement(By.partialLinkText("Вы добавили 2 товара на сумму"));
		//String fext = texti.findElement(By.partialLinkText("Вы добавили 2 товара на сумму"));
	//	assertEquals("Вы добавили 2 товара на сумму g-faA грн ", textb);
		
		*/
		
		//  по части текса WebElement tov = driver.findElement(By.partialLinkText("text"));
		
		
		//*[@id="cart_container"]/table/tbody/tr[2]/td[2]/div/a
		
		// ТЕСТ "В ИЗБРОНЫЕ"
		
		 WebElement izbranoe = driver.findElement(By.xpath("//*[@id=\"cart_container\"]/table/tbody/tr[2]/td[2]/div/a"));
		 String izbanoe1 = izbranoe.getAttribute("href");
		 driver.get(izbanoe1);
		 
		 
		 WebElement izbranoe2 = driver.findElement(By.xpath("//*[@id=\"ga-master-id\"]/div[1]/div[2]/div/div[1]/div/div/div[1]/div[2]/div[4]/div[1]/ul/li[2]/a"));
izbranoe2.click();
		
		
		WebElement izbranoe3 = driver.findElement(By.xpath("//input[@type='text'][@name='new_group_first']"));
		izbranoe3.sendKeys("11");
		
		
		WebElement izbranoe4 = driver.findElement(By.xpath("//input[@type='submit'][@value='Сохранить'][@class='btn']"));
		izbranoe4.click();
		
		
		
		
			
		}
		
		
	

	

	@After
	public void tearDown() throws Exception {
		//driver.close();
	}

}
