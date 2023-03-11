package steps;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import data.JsonDataReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.UserSubscriptionPage;
import tests.TestPase;


public class UserSubscription extends TestPase {
	UserSubscriptionPage subscriptionPage;
	String lightSubName;
	String lightSubPrice;
	String lightSubCurrency;
	String mainSubName;
	String  mainSubPrice;
	String  mainSubCurrency;
	String premiumSubName;
	String premiumSubPrice;
	String premiumSubCurrency;
	@Given("User open Subscription Page")
	public void user_open_subscription_page() {
		subscriptionPage = new UserSubscriptionPage(driver);
	}
	@When("User check subscription options")
	public void user_check_subscriptio_options(){
		lightSubName = subscriptionPage.getsubsctiptionName("light");
		lightSubPrice = subscriptionPage.getsubsctiptionPrice("light");
		lightSubCurrency = subscriptionPage.getsubsctiptionCurrency("light");
		mainSubName = subscriptionPage.getsubsctiptionName("main");
		mainSubPrice = subscriptionPage.getsubsctiptionPrice("main");
		mainSubCurrency = subscriptionPage.getsubsctiptionCurrency("main");
		premiumSubName = subscriptionPage.getsubsctiptionName("premium");
		premiumSubPrice = subscriptionPage.getsubsctiptionPrice("premium");
		premiumSubCurrency = subscriptionPage.getsubsctiptionCurrency("premium");}
	@Then("User find 3 subscription options light , main and premium subscription options")
	public void the_registeration_page_opend_success() {
		Assert.assertEquals(lightSubName, "لايت");
		Assert.assertEquals(lightSubPrice, "1.2 دينار كويتي/شهر");
		Assert.assertEquals(lightSubCurrency, "دينار كويتي/شهر");
		Assert.assertEquals(mainSubName, "الأساسية");
		Assert.assertEquals(mainSubPrice, "2.5 دينار كويتي/شهر");
		Assert.assertEquals(mainSubCurrency, "دينار كويتي/شهر");
		Assert.assertEquals(premiumSubName, "بريميوم");
		Assert.assertEquals(premiumSubPrice, "4.8 دينار كويتي/شهر");
		Assert.assertEquals(premiumSubCurrency, "دينار كويتي/شهر");
	}
}
