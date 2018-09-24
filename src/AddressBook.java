import java.util.ArrayList;

/**
 * 
 */

/**
 * Mathew Smith
 * 101029870
 * SYSC 3110A L1
 *
 */
public class AddressBook {

	private ArrayList<BuddyInfo> buddyInfo;
	
	public AddressBook() {
		this.buddyInfo = new ArrayList<BuddyInfo>();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("AddressBook.java");
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);
		
		// Test Change
		

	}
	
	public void addBuddy(BuddyInfo name) {
		buddyInfo.add(name);
		
	}
	
	public void removeBuddy(int index) {
		buddyInfo.remove(index);
		
	}
	
	

}
