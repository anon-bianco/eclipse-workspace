package com.anon.learnspringframework;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("adam"));
		
		System.out.println(context.getBean("person2"));
		
		System.out.println(context.getBean("person3Parameter"));
		
		System.out.println(context.getBean("address1"));
		
		System.out.println(context.getBean(Address.class));
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

	}

}