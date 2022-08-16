
//This program check if a user enter odd or even
package gorkhasolutions.assignment.an.com;

import java.util.Scanner;

public class CheckingOddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number here to check");
	
		
		int number = input.nextInt();
		
		
		if(number%2==0) {
			
			System.out.println(" The number you entered is even : " + number);
			
		}
		
		else {
			System.out.println(" The number you enter is odd:  " + number);
		}
		
		
		/*int number = 541;
		
		if(number%2==0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}*/
		

	}

}
