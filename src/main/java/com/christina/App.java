package com.christina;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		Child idChild = (Child) context.getBean("idealchild");
		System.out.println(idChild);
		idChild.study();

		Child bChild = (Child) context.getBean("badchild");
		System.out.println(bChild);
		bChild.study();

		Person person = (Person) context.getBean("person");
		System.out.println(person);
		person.showPhoneNos();

	}
}
