package org.jacob;

public class Contact {

	String name;
	String phone;
	String address;
	
	public void Contact(String name) {
		this.name = name;
	}
	public void Contact(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
