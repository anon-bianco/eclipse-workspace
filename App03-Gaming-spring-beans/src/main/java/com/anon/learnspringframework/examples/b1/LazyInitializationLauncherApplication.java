package com.anon.learnspringframework.examples.b1;


import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}

@Component
@Lazy
class ClassB{
	
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("Some initialization logic");
		this.classA = classA;
	}
	
	public void run() {
		System.out.println("Programming is amazing");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
	

	public static void main(String[] args) {
		
		try(var context	= new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)){
			
			context.getBean(ClassB.class).run();
			
		}

	}

}
