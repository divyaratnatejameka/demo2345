package cu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cu.Drivershdc2;

public class cuu {
	
	WebDriver div;
	@Given("TESTME app is launched zz")
	public void testme_app_is_launched_zz() {
	  
		  div=Drivershdc2.getDriver("CRM");
		  div.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		  
	}

	@Given("User acccessing registration link in app")
	public void user_acccessing_registration_link_in_app() {
	    
		 WebElement sp=div.findElement(By.linkText("SignUp"));
		  sp.click();
	}

	@When("User providing valid data for all requires fields")
	public void user_providing_valid_data_for_all_requires_fields() {
	   
		div.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Divya1222003");
		 
		  
		  div.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Divya");
		  div.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Meka");
		  div.findElement(By.xpath("//input[@name='password']")).sendKeys("Divya123");
		  div.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys("Divya123");
		  div.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[2]")).click();
		  div.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("Divya123@gmail.com");
		  div.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys("9866506677");
		  div.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("02/21/1992");
		  div.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("Hyderabad");
		  WebElement dn=div.findElement(By.xpath("//select[@id='securityQuestion']"));
			Select sel=new Select(dn);
			sel.selectByValue("411013");
			div.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys("Teja");
			div.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	}

	@Then("User verifying registration statussss")
	public void user_verifying_registration_statussss() {
	 
		String expected="Login";
		String actual=div.getTitle();
		Assert.assertEquals(actual,expected);
		}

	@When("User clicks on login link")
	public void user_clicks_on_login_link() {
	    
		WebElement sp=div.findElement(By.linkText("SignIn"));
		sp.click();
	 
	}

	@Then("user enters the valid username {string}")
	public void user_enters_the_valid_username(String string) {
	    
		 div.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string);
		 

		 
	}

	@Then("user the enters the valid password {string}")
	public void user_the_enters_the_valid_password(String string) {
	    
		 div.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string);
	}

	@Then("user submits the application")
	public void user_submits_the_application() {
	   
		 div.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@Then("verifies the login statuswss")
	public void verifies_the_login_statuswss() throws InterruptedException {
	  
		String act=div.getTitle();
	      String expect="Home";
	      Thread.sleep(5000);
	      Assert.assertEquals(act, expect);
	      System.out.println("successful login");
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
		
		div.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
		
	}

	@Then("Enters four characters of a product")
	public void enters_four_characters_of_a_product() throws InterruptedException {
	  
		WebElement a=div.findElement(By.xpath("//*[@id=\"myInput\"]"));
		
		Actions act=new Actions(div);
		  Thread.sleep(1000);
		  act.keyDown(a, Keys.SHIFT).sendKeys("head").keyUp(Keys.SHIFT).build().perform();
		  act.sendKeys(Keys.DOWN).build().perform();
		  act.sendKeys(Keys.ENTER).build().perform();
		
	}

	@Then("User searches for a product")
	public void user_searches_for_a_product() {
	   		div.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("checks for availablity for ordering")
	public void checks_for_availablity_for_ordering() {
	   	
		WebElement b=div.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a"));
		String act=b.getText();
		String exp="Add to cart";
		Assert.assertEquals(act, exp);
		
	}

//	@Given("Alex has regitered in to Testmeapp")
//	public void alex_has_regitered_in_to_Testmeapp() {
//	    // Write code here that turns the phrase above into concrete actions
//	   // throw new cucumber.api.PendingException();
//	}
//
//	@When("Alex search for a particular product like headphone")
//	public void alex_search_for_a_particular_product_like_headphone() {
//	    // Write code here that turns the phrase above into concrete actions
//	  //  throw new cucumber.api.PendingException();
//	}

	@When("Try to proced to payment without addding any item in the cart")
	public void try_to_proced_to_payment_without_addding_any_item_in_the_cart() {
	   	
		WebElement b=div.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a"));
		String act=b.getText();
		String exp="Pay now";
		Assert.assertEquals(act, exp);
	}

//	@Then("Testme doesnt display the cart icon")
//	public void testme_doesnt_display_the_cart_icon() {
//		
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new cucumber.api.PendingException();
//	}


}
