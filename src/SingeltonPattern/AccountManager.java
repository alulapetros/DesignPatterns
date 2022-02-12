package SingeltonPattern;
//this class assumes that only a single account manger in needed 

public class AccountManager {
	private String firstName;
	private String lastName;
	private int phoneNumber;
	

	private static AccountManager accountManager;

	private AccountManager() {
		super();
	}
	
	//there is no account Manager created, make one
	public static AccountManager getUserAccountInstance(){
		if (accountManager == null) {
			accountManager = new AccountManager();
			return accountManager;
		}
		//if already exists return it
		else {
			return accountManager;
		}	
		
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int i) {
		this.phoneNumber = i;
	}

	@Override
	public String toString() {
		return "userAccount [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + "]";
	}
	

}
