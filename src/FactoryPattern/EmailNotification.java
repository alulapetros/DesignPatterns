package FactoryPattern;

public class EmailNotification implements Notification {

	@Override
	public void notiftyCustomer() {
		System.out.println("\nThis is an EMAIL Notification\nYour Order is Ready for Pick up!");

	}

}
