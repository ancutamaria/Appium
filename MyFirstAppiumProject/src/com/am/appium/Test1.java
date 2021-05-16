package com.am.appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Test1 {
	
	public static void main(String[] args) throws MalformedURLException {
		
		// the driver is an object of the entire mobile
		AndroidDriver<AndroidElement> driver = Utils.capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// to identify attributes of the elements, we use xpath (with ui automator viewer), id, className, androidUIAutomator
		
		/* xpath - is used to identify an element 
		 * xpath syntax
		 * ///tagName[@attribute='value']
		 * */
		
		//xpath
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();

		//id
		driver.findElementById("android:id/checkbox").click();
		
		//when there are no unique identifiers with xpath: take the second android.widget.RelativeLayout:
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		
		//classname
		driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
		
		// driver.findElementById("android:id/button1").click();
		// the above line does the same thing as the one below(in case there are no differentiators):
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		
		
	}

}
