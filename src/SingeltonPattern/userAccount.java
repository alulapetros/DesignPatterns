package SingeltonPattern;

// this class assumes that only a single account manger in needed 
public class userAccount {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	

	private static userAccount accountManager;

	private userAccount() {
		super();
	}
	
	//there is no user account created for 
	public static userAccount getUserAccountInstance(){
		if (accountManager == null) {
			accountManager = new userAccount();
			return accountManager;
		}
		else {
			return null;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "userAccount [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + "]";
	}
	

}
