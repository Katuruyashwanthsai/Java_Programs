//if else if condition;
package conditions;
import java.util.Scanner;
public class marks {
	public static void main (String[]args ){
		Scanner a= new Scanner(System.in);
		int marks = a.nextInt();
		if(marks>=90) {
			System.out.println("grade A");
		}
		else if (marks>=80) {
			System.out.println("grade B");
		}
		else if (marks>=70) {
			System.out.println("grade C");
		}
		else if(marks>=60) {
			System.out.println("grade D");
		}
			else if (marks>=50) {
			System.out.println("just pass");
		}
		else {
			System.out.println("fail");
		}
}
}