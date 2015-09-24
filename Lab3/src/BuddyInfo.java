
public class BuddyInfo {

	private String name;
	private String address;
	private int age;
	
	public BuddyInfo(String name,String address, int age){
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo homer = new BuddyInfo("Homer Simpson",null,50);
		System.out.println("Hello " + homer.getName() + "!!!!");
	}

}
