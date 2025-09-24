package com_java;
import java.util.Scanner;

public class Equationfloat {
	public static void main(String[]args) {
		Scanner K = new Scanner(System.in);
		float a= K.nextFloat();
		float b= K.nextFloat();
		float c= K.nextFloat();
		float d= K.nextFloat();
		float result = b+a*c-b/d*c+b%a;
	System.out.println(result);
	}

}
