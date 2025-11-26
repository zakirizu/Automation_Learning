package testNG;

import org.testng.annotations.Test;

public class Notification {
	
	@Test
	public void MobileNotifcaiton() {
		System.out.println("Mobile Notification");
	}
	
	@Test
	public void EmailNotificaiton() {
		System.out.println("Email Notification");
	}

	@Test
	public void PushNotification() {
		System.out.println("Push Notification");
	}
	
	@Test
	public void SMSNotification() {
		System.out.println("SMS Notification");
	}
}
