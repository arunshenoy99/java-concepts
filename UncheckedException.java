/*HERE WE USE THE KEYWORD throw TO THROW AN EXCPETION MANUALLY, WE THROW TWO EXCEPTIONS ONE OF WHICH WE CATCH AND THE OTHER IS CAUGHT BY JAVA'S DEFAULT MECHANISM*/
import java.util.*;
public class UncheckedException {
	public static void main(String[] args) {
		String s1 = null;
		int accountbalance = 1000;
		int withdrawalamount;
		Scanner s =  new Scanner(System.in);
		System.out.println("ENTER THE WITHDRAWAL AMOUNT");
		withdrawalamount= s.nextInt();
		try {
			if(accountbalance<withdrawalamount) {
				throw new ArithmeticException("INSUFFICIENT BALANCE");		/*WE THROW AN ArithmeticException OBJECT AS THE WITHDRAWAL AMOUNT IS GREATER THAN THE ACCOUNT BALANCE,THIS EXCEPTION IS HANDLED BY OUR CATCH BLOCK*/
			}
			else {
				if(s1==null) {
					throw new NullPointerException("s1 IS NOT INITIALISED");	/*WE THROW AN NullPointerException OBJECT AS THE STRING s1 HAS NOT BEEN INITIALIZED, THIS EXCEPTION IS THROWN BY US BUT IS HANDLED BY THE DEFAULT CATCH MECHANISM*/
				}
			}
		}catch(ArithmeticException e) {
			/*HANDLES ONLY THE EXCEPTION ARISEN DUE TO WITHDRAWAL AMOUNT BEING GREATER THAN BALANCE*/
			System.out.println(e.getMessage());
		}
		System.out.println("THIS LINE WILL BE EXECUTED ONLY WHEN ArithmeticException ARISES AND NOT FOR NullPointerException");	/*THIS CODE IS EXECUTED ONLY WHEN OUR CATCH BLOCK RUNS ie FOR ArithmeticException AND IS NOT EXECUTED WHEN THE DEFAULT CATHC MECHANISM RUNS ie FOR NullPointerException */
	}
}



/*OUTPUT 1:-
ENTER THE WITHDRAWAL AMOUNT
1000
Exception in thread "main" java.lang.NullPointerException: s1 IS NOT INITIALISED
at UncheckedException.main(UncheckedException.java:17)
*/

/*OUTPUT 2:-
ENTER THE WITHDRAWAL AMOUNT
3000
INSUFFICIENT BALANCE
THIS LINE WILL BE EXECUTED ONLY WHEN ArithmeticException ARISES AND NOT FOR NullPointerException

 */