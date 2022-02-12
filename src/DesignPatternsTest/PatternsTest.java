package DesignPatternsTest;

import java.util.Scanner;

import Facade.NotiFicationMaker;
import FactoryPattern.Notification;
import FactoryPattern.UserNotificationFactory;
import FactoryPattern.noNumericInputAllowed;
import SingeltonPattern.AccountManager;

public class PatternsTest {

	public static void main(String[] args) {

		// -----------------Factory Pattern Test-------------------------------

		// create a new instance of userNotificationFactory to produce notifications

		Scanner input = new Scanner(System.in);

		UserNotificationFactory notifyUser = new UserNotificationFactory();

		System.out.print("How do you want to be notifiyed when You order is ready?\n");
		System.out.println("SMS, Email, or Push");
		String usersChoice = input.nextLine();
		input.close();

		Notification myNotification;
		try {
			myNotification = notifyUser.generateNotification(usersChoice);
			myNotification.notiftyCustomer();
		} catch (noNumericInputAllowed e) {
			System.err.println(e.toString());
		}

		// -----------------Singleton Pattern Test-------------------------------

		// create a new instance of a user
		System.out.println("\n-----------------  Singleton Pattern Test  -------------------------------\n");

		AccountManager currentAccountManager = AccountManager.getUserAccountInstance();
		currentAccountManager.setFirstName("Thomas");
		currentAccountManager.setLastName("Robert");
		currentAccountManager.setPhoneNumber(2023451211);

		System.out.println(currentAccountManager.toString());
		System.out.println("\n--------------------------------------------------------------------------------\n");

		// -----------------Facade Pattern Test-------------------------------
		System.out.println("\n-----------------   Notifacation with Facade Pattern   -------------------------------\n");

		NotiFicationMaker notifyWithFacade = new NotiFicationMaker();
		notifyWithFacade.emailNotify();
		notifyWithFacade.smsNotify();
		notifyWithFacade.pushNotify();
	}

}
