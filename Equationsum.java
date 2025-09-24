package com_java;
import java.util.Scanner;

public class Equationsum {
	public static void main(String[]args) {
		Scanner K = new Scanner(System.in);
		int a= K.nextInt();
		int b= K.nextInt();
		int c= K.nextInt();
		int d= K.nextInt();
		int e= K.nextInt();
	int result = a+b-c*b/d+e;
	System.out.println(result);
	}

}
