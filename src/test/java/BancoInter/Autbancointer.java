package BancoInter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autbancointer {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
	
	//comando para indicar o tipo de navegador e o caminhos do driver do navegador 
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
     driver = new ChromeDriver();
	// comando para maximizar o navegador 
	driver.manage().window().maximize();
	driver.get("https://inter.co/");
}
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(5000);
	driver.findElement(By.xpath("(//button)[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("name")) .sendKeys("Eduardo Miguel");
		Thread.sleep(2000);
		String texto = driver.findElement(By.xpath("(//h2)[9]")).getText();
		//metodo de validação de texto
		assertEquals("Abra agora sua Conta Digital", texto);
		System.out.println("valor da variavel texto:" + texto);
		driver.findElement(By.id("phone")) .sendKeys("79981783121");
		driver.findElement(By.id("email")) .sendKeys("teste@teste.com");
		driver.findElement(By.id("socialId")) .sendKeys("60904679870");
		driver.findElement(By.id("dateOfBirth")) .sendKeys("10032007");
		driver.findElement(By.cssSelector("body > div.sc-dILkzW.jmczzn > div.sc-hUheUT.eReyjh > div > form > div.sc-jNDflC.RXypR > label")).click();
		driver.findElement(By.xpath("(//button)[9]")).click();
	}


}
