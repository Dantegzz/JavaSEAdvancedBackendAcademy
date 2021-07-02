package com.Dgonzalez.util;

import java.util.Scanner;

public class AmazonUtil {
	
	public static int validateUserResponseMenu(int min, int max) {
		//Read user response
		Scanner sc = new Scanner(System.in);
		
		//Validate Response
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("Please enter a valid option");
			System.out.println("Please try again");
		}
		
		int response = sc.nextInt();
		
		//Validate response range
		while(response < min || response > max) {
			//Ask again
			System.out.println("Please enter a valid option");
			System.out.println("Please try again");
			
			while(!sc.hasNextInt()) {
				sc.next();
				System.out.println("Please enter a valid option");
				System.out.println("Please try again");
			}
			response = sc.nextInt();
		}
		System.out.println("Your selection was: " + response + "\n");
		return response;
	}

}
