package FactoryPattern;

/* The assumption here is after a customer made an order on the Pizza ordering application, 
 * a notification is sent based on the user's preference
 * for instance, there would be Email notification, SMS text notification, or Push notification
 * Therefore a user would mention their preferred notification method and the factory will produce an object of requested type
 * 
 *I used the same interface and implementations to demonstrate facade pattern as-well
*/

public interface Notification {

	void notiftyCustomer();

}
