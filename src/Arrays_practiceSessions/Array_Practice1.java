package Arrays_practiceSessions;
/**
 * Print the average of the integers in an integer array? 
 * */
public class Array_Practice1 {
public static void main(String[] args) {
	int [] j=new int[]{2,2,2,2,2};
	int sum=0;
	for(int  i=0; i<j.length; i++) {
		System.out.println(j[i]);
		sum+=j[i];
		
	}
	System.out.println("average value :"+sum/j.length);

}
}
