package core;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebDriver;

public class Utility {
	public static String fileName = System.getProperty("user.dir") + "\\Configuration.properties";

	public static void openBrowser(WebDriver driver, String urlPropertyName) throws IOException {
		driver.get(getPropertyData(urlPropertyName));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	public static String getPropertyData(String propertyName) throws IOException {
		FileReader reader = new FileReader(fileName);
		Properties p = new Properties();
		p.load(reader);
		return p.getProperty(propertyName);
	}

	public static int generateRandomNumber() {
		Random rnd = new Random();
		int number = rnd.nextInt(99999999);
		return number;
	}
	/*
	 * public static void main(String arg[]) { String
	 * act="Thank you for the payment. Looks like your payment was already completed in previous transaction. An invoice has been sent to the email address provided on registration.You can view/print and forward your paid and unpaid invoices 24/7 at My Invoices."
	 * ; String
	 * exp="Thank you for the payment. Looks like your payment was already completed in previous transaction. An invoice has been sent to the email address provided on registration.You can view/print and forward your paid and unpaid invoices 24/7 at"
	 * ;
	 * 
	 * System.out.println(act.contains(exp));
	 * 
	 * }
	 */
}
