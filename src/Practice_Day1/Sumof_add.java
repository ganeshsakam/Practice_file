package Practice_Day1;

import java.util.Scanner;

public class Sumof_add {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value1:");
	int num=sc.nextInt();
	System.out.println("Enter value2:");
	int num1=sc.nextInt();
	System.out.println("Enter value3:");
	int num2=sc.nextInt();
	System.out.println("Enter value4:");
	int num3=sc.nextInt();
	
	int sum=num+num1+num2+num3;
	System.out.println(sum);
	System.out.println("This is a average value:"+sum/4);
	}
}
	
	

