package com_java;
import java.util.Scanner;

public class Selection {
	public static void main (String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.print("ENTER YOU AGE ");
		int age = s.nextInt();
		if (age>=18 ) {
			System.out.print("enter gender M,F");
			String g=s.next();
			 if (g.equalsIgnoreCase("M")){
					System.out.println("you are eligible for army");
			}
			else {
				System.out.print("ok you are eligible for air force");
			}
			
		}
		else {
			System.out.println("sory not eligible");
		}
		
	}

}
