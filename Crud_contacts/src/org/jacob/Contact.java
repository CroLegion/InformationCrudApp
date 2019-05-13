package org.jacob;

public class Contact {

	String name;
	String phone;
	String address;
	
	
	public Contact(String name) {
		this.name = name;
	}
	public Contact(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
