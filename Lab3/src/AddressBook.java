import java.util.ArrayList;
import java.util.List;

// Git repository https://github.com/marctebo/Lab_3.git
public class AddressBook {
	
	private List<BuddyInfo> book;
	
	public AddressBook(){
		book = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo pal){
		if(pal!=null)
			book.add(pal);
	}
	
	public void removeBuddy(BuddyInfo pal){
		if(!book.contains(pal))
			System.out.print("You dont have a friend named" + pal.getName());
		else
			book.remove(pal);
	}
	public static void main(String[] args){
		BuddyInfo buddy = new BuddyInfo("Marc", "Carleton",1234);
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(buddy);
	}
}
