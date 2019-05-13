package defaultClasses;

public class Contact {

	String name;
	String phone;
	String address;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Contact(String name) {
		this.name = name;
	}
	public Contact(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
}
