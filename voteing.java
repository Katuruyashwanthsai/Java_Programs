// if else condition.
package conditions;
import java.util.Scanner;

public class voteing {
	public static void main (String[]args ){
		Scanner a= new Scanner(System.in);
		int age = a.nextInt();
		if(age>=18) {
			System.out.println("you are eligible for vote" + age);
		}
		else {
			System.out.println("you are not eligible for vote" +  age);
		}
	}

}
