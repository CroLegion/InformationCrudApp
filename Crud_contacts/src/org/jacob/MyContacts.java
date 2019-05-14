package org.jacob;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyContacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("contact.xml");
	    Contact contact = (Contact) context.getBean("contactBean");
	    System.out.println(contact.name);
	}

}
