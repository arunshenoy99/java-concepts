import java.util.*;
class InvalidWithdrawalAmountException extends Exception{	/*CREATING OUR OWN EXCEPTION CLASS AS A SUBCLASS OF EXCEPTION WHICH IS INTURN A SUBCLASS OF THROWABLE*/
	private int d;
	InvalidWithdrawalAmountException(int diff){
		d=diff;
	}
	public String toString() {										/*OVERRIDING THE toString() METHOD TO MAKE OUR OWN MESSAGE*/
		return("THE WITHDRAWAL AMOUNT EXCEEDS YOUR BALANCE BY "+d);
	}
}
public class CustomException  {
	public static void main(String[] args) throws InvalidWithdrawalAmountException {
		int balance = 1000;
		Scanner s = new Scanner(System.in);
		System.out.print("ENTER THE WITHDRAWAL AMOUNT:");
		int wa = s.nextInt();
		try {
		if(wa>balance) {
			throw new InvalidWithdrawalAmountException(wa-balance);	/*THROWING OUR CUSTOM EXCEPTION*/
		}
		else {
			balance = balance-wa;
			System.out.println("MONEY SUCESSFULLY WITHDRAWN");
		}
		}catch(InvalidWithdrawalAmountException e) {
			System.out.println(e);
			
		}
	}

}

/*OUTPUT 1:-
ENTER THE WITHDRAWAL AMOUNT:1000
MONEY SUCESSFULLY WITHDRAWN
*/
/*OUTPUT 2:-
ENTER THE WITHDRAWAL AMOUNT:3000
THE WITHDRAWAL AMOUNT EXCEEDS YOUR BALANCE BY 2000

*/
