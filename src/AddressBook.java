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

	ArrayList<BuddyInfo> addressBook  = new ArrayList<BuddyInfo>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("AddressBook.java");
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(0);
		

	}
	
	public void addBuddy(BuddyInfo name) {
		addressBook.add(name);
		
	}
	
	public void removeBuddy(int index) {
		addressBook.remove(index);
		
	}
	
	

}
