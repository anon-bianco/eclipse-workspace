package com.anon;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		
		printStructured(List.of(12, 5, 2, 25, 7, 8, 9, 5));
		
		

	}

	private static void printStructured(List<Integer> numbers) {
		
		for(int num : numbers) {
			System.out.println(num);
		}
		
	}

}