package com.christina;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		Child idChild = (IdealChild) context.getBean("idealchild");
		idChild.study();
		idChild.doHobby();
		
		Child bChild = (Child) context.getBean("badchild");
		bChild.study();
		bChild.doHobby();
		
		Person person = (Person) context.getBean("person");
		person.showPhoneNos();

	}
}
