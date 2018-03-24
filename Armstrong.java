package com.test;

import java.util.InputMismatchException;
import java.util.Scanner;

// Check given Number is Armstrong Number or Not
public class Armstrong {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter Number :");
			int number = scanner.nextInt();
			int result = 0;
			int a,temp;
			temp = number;
			
			while(number>0){
				a = number%10;
				number = number/10;
				result = result+(a*a*a);
			}
			if(temp == result)
				System.out.println("Armstrong Number");
			else
				System.out.println("Not Armstrong Number");
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}
