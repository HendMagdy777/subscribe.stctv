package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserSubscriptionPage {
	WebDriver driver;
	public UserSubscriptionPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locator
	By lightSubscriptionName = By.id("name-لايت");
	By mainSubscriptionName = By.id("name-الأساسية");
	By premiumSubscriptionName = By.id("name-بريميوم");
	By lightSubscriptionPrice = By.id("currency-لايت");
	By mainSubscriptionPrice = By.id("currency-الأساسية");
	By premiumSubscriptionPrice = By.id("currency-بريميوم");
	By lightSubscriptionCurrency = By.cssSelector("#currency-لايت > i");
	By mainSubscriptionCurrency = By.cssSelector("#currency-الأساسية > i");
	By premiumSubscriptionCurrency = By.cssSelector("#currency-بريميوم > i");


	// Methods
	public String getsubsctiptionName(String subscriptionName){
		if (subscriptionName.equalsIgnoreCase("light")){
			return  driver.findElement(lightSubscriptionName).getText();
		}
		else if (subscriptionName.equalsIgnoreCase("main")){
			return  driver.findElement(mainSubscriptionName).getText();
		}
		else if (subscriptionName.equalsIgnoreCase("premium")){
			return  driver.findElement(premiumSubscriptionName).getText();
		}
		else
			return "Wrong Option";

	}
	public String getsubsctiptionPrice(String subscriptionName){
		if (subscriptionName.equalsIgnoreCase("light")){
			return  driver.findElement(lightSubscriptionPrice).getText();
		}
		else if (subscriptionName.equalsIgnoreCase("main")){
			return  driver.findElement(mainSubscriptionPrice).getText();
		}
		else if (subscriptionName.equalsIgnoreCase("premium")){
			return  driver.findElement(premiumSubscriptionPrice).getText();
		}
		else
			return "Wrong Option";

	}
	public String getsubsctiptionCurrency(String subscriptionName){
		if (subscriptionName.equalsIgnoreCase("light")){
			return  driver.findElement(lightSubscriptionCurrency).getText();
		}
		else if (subscriptionName.equalsIgnoreCase("main")){
			return  driver.findElement(mainSubscriptionCurrency).getText();
		}
		else if (subscriptionName.equalsIgnoreCase("premium")){
			return  driver.findElement(premiumSubscriptionCurrency).getText();
		}
		else
			return "Wrong Option";
	}
}
