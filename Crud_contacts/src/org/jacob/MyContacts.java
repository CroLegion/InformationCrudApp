package org.jacob;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyContacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("contact.xml");
	    Contact contact = (Contact) context.getBean("contactBean");
//	    contact.setName("Test");
//	    contact.setAddress("123 main");
	    System.out.println(contact.getName());
	    System.out.println(contact.getAddress());
	    context.registerShutdownHook();
	}

}
