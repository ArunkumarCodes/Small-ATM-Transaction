import java.util.*;
public class Atm {
	public static void main (String [] args) {
		int actuallPin=1234;
		int amountBalance=50000;
		System.out.println("Start");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Pin:");
		int userPin=sc.nextInt();
		if(actuallPin==userPin) {
			System.out.println("Enter amount Withdraw:");
			int amountWithdraw=sc.nextInt();
			if(amountBalance>=amountWithdraw) {
				System.out.println("Succesful your Translation...");
			}else {
				System.err.println("Insuficent Balance..");
			}

		}else {
			System.err.println("Incorrect Pin Number");
		}
	}
}
