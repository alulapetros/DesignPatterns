package FactoryPattern;

//this class will have a method to accept a type of notification request and generate a notification object accordingly
// i didn't catch all exceptions here in this code, if a user input invalid string
//(a string other than SMS,email or push an exception in raised)
public class UserNotificationFactory {

	public Notification generateNotification(String typeOfNotification) throws noNumericInputAllowed {
		Notification userNotification;

		if (typeOfNotification.isEmpty() || typeOfNotification == null || !typeOfNotification.matches("[a-zA-Z_]+")) {
			throw new noNumericInputAllowed();
		}

		else {
			switch (typeOfNotification.toLowerCase()) {
			case "sms":
				userNotification = new SmsNotification();
				break;
			case "email":
				userNotification = new EmailNotification();
				break;
			case "push":
				userNotification = new PushNotification();
				break;

			default:
				userNotification = null;
				break;
			}

		}

		return userNotification;

	}

}
