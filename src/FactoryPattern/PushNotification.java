package FactoryPattern;

public class PushNotification implements Notification {

	@Override
	public void notiftyCustomer() {
		System.out.println("\nThis is an PUSH Notification\nYour Order is Ready for Pick up!");

	}

}
