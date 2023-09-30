package Practice_Day1;

import java.util.Scanner;

public class Switch_Statements {
public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the character :");
	char s=sc.next().toLowerCase().charAt(0);
	
	
	switch(s){
		case 'a' :
			System.out.println("This is Vowels");
			break;
			
		case 'e':
			System.out.println("This is Vowels");
			break;
		case 'i':
			System.out.println("This is Vowels");
		break;
		
		case 'o':
			System.out.println("This is Vowels");
		break;
		
		case 'u':
			System.out.println("This is Vowels");
		break;
		
		default :
			System.out.println("This is Consonant");
	}
	
	}

}
