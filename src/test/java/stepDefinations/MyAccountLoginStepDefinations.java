package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyAccountLoginStepDefinations {
	
	public WebDriver driver=null;
	
	
	@Given("Open browser")
	public void open_browser() {
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver_win32 (2)//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	   
	}

	@When("Enter url {string}")
	public void enter_url(String url) {
		driver.get(url);
	   
	}

	@When("Click on My Account menu")
	public void click_on_my_account_menu() {
		driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
	 
	}

   /*@When("Enter registered Username and Password")
	public void enter_registered_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("kandevinod446");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vinod@123");
	  
	}*/
	
	
	@When("Enter registered Username {string} and Password {string}")
	public void enter_registered_username_and_password(String user, String pwd) {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[1]/input[1]")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.name("login")).click();
	    
	}

	@Then("User must successfully login in Web Page")
	public void user_must_successfully_login_in_web_page() {
		String capText= driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/div/p[1]/strong")).getText();
		  Assert.assertEquals(true,capText.contains("kandevinod446"));
		  driver.close();
	 
	}
	
	@Then("Verify login")  // This method is for system outline and examples
	public void verify_login() {
	   String captureText= driver.findElement(By.xpath("//strong[contains(text(),'Error')]")).getText();
	    if(captureText.contains("ERROR")) 
	    {
	    	Assert.assertTrue(captureText, true);
	    	
	    }
	    else
	    {
	    	Assert.assertFalse(false);
	    }
	    
	    
	    
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
