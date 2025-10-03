package com_java;
import java.util.Scanner;
public class Revers {
public static void main(String[]args) {
	 Scanner s = new Scanner(System.in);
	 int i = s.nextInt();
	  int result = 0;
	  while (i!=0) {
		  int sai =i % 10;
		  result = result*10+sai;
		  i = i/10;
		 System.out.println(result) ;
	  }
}
}
