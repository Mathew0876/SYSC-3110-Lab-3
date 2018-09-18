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

	}
	
	public void addBuddy(String name) {
		addressBook.add(new BuddyInfo(name));
		
	}
	
	public void removeBuddy(int index) {
		addressBook.remove(index);
		
	}
	
	

}
