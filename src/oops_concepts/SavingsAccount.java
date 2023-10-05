package oops_concepts;

public class SavingsAccount extends BankAccount {

	@Override
	public void withdraw() {
		int i=10;
		
		if(i<100) {
			System.out.println("Falls");
		}
		else {
			System.out.println("True");
		}
		
	}
	public static void main(String[] args) {
		SavingsAccount s=new SavingsAccount();
		s.withdraw();
	}
	
}
