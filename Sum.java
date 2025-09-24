package com_java;
import java.util.Scanner;


public class Sum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a =s.nextInt();
		int b =s.nextInt();
		
		System.out.println("SUM OF " + (a+b));
		System.out.println("SUB OF " + (a-b));
		System.out.println("MUX OF " + (a*b));
		System.out.println("DIV OF " + (a/b));
		System.out.println("MODULUS OF " + (a%b));
		
	}

}
