package Facade;

import FactoryPattern.EmailNotification;
import FactoryPattern.Notification;
import FactoryPattern.PushNotification;
import FactoryPattern.SmsNotification;

public class NotiFicationMaker {
	// Notification type as instance variables inside the NotificationMaker class

	private Notification email;
	private Notification sms;
	private Notification push;

	// constructor
	public NotiFicationMaker() {

		email = new EmailNotification();
		sms = new SmsNotification();
		push = new PushNotification();
	}

	// call methods according to the preferred notification
	public void emailNotify() {
		email.notiftyCustomer();
	}

	public void smsNotify() {
		sms.notiftyCustomer();
	}

	public void pushNotify() {
		push.notiftyCustomer();
	}

}
