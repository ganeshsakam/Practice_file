package Practice_Day1;

import java.util.Scanner;

public class Condiational_statements {
public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the  value one: ");
		int a=scanner.nextInt();
		System.out.println("Enter the  value Two: ");
		int b=scanner.nextInt();
		System.out.println("Enter the  value Three: ");
		int c=scanner.nextInt();
		
		if(a>b) {
		System.out.println("This is Least number:"+a);
		}
		else if(b>c) {
			System.out.println("This is average number:"+b);
		}
		else {
			System.out.println("This is Greatest number :"+c);
		}

	}
		
}
