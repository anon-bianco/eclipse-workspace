package com.anon;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		printFunctional(List.of(12, 5, 2, 25, 7, 8, 9, 5));
		
		

	}
	

	private static void printFunctional(List<Integer> numbers) {
		
		numbers.stream().forEach(System.out :: println); //:: - Methdod reference 
		
	}

}