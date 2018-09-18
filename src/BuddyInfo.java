/**
 * Mathew Smith
 * 101029870
 * SYSC 3110A L1
 *
 */

public class BuddyInfo {

	private String name;
	private String address;
	private String phoneNumber;


	public BuddyInfo(String string) {
		// TODO Auto-generated constructor stub
		setName(string);
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private String getAddress() {
		return address;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	private String getPhoneNumber() {
		return phoneNumber;
	}

	private void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo newbuddy = new BuddyInfo("Mathew");
		System.out.println("Hello " + newbuddy.getName());
		
	}

}
