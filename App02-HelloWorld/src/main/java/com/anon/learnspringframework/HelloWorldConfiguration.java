package com.anon.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {};

record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Anon Bianco";
	}
	
	@Bean
	public int age() {
		return 23;
	}
	
	@Bean(name="adam")
	public Person person1() {
		return new Person("Adamsen Branay", 23, new Address("Arun Excello", "Porur"));
		
		
	}
	
	@Bean
	public Person person2() {
		return new Person(name(), age(), address1());	
	}
	
	@Bean
	public Person person3Parameter(String name, int age, Address address2) {
		return new Person(name, age, address2);	
	}
	
	@Bean
	@Primary
	public Address address1() {
		return new Address("South of Amala Convent", "Thuckalay");
	}
	
	@Bean
	public Address address2() {
		return new Address("Varghese Edifice", "Mettukadai");
	}

}