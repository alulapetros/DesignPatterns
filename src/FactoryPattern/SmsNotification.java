package FactoryPattern;

public class SmsNotification implements Notification {

	@Override
	public void notiftyCustomer() {
		System.out.println("\nThis is SMS Notification\nYour Order is Ready for Pick up!");

	}

}
