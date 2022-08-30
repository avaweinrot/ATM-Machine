
public class ATMTester2 {

	public static void main(String[] args) {
		ATM tester = new ATM(); 
		
		tester.openAccount(0001, 100);
		System.out.println(tester.checkBalance(0001)); 
		tester.withdrawMoney(0001, 50);
		System.out.println(tester.checkBalance(0001));
		tester.closeAccount(0001);
		System.out.println(tester.checkBalance(0001));
		tester.withdrawMoney(0001, 50);
		tester.closeAccount(0001);
		System.out.println(tester.checkBalance(0001));
		

	}

}
