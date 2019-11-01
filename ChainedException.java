import java.util.*;
import java.io.*;
public class ChainedException {
	public static void main(String[] args) throws IOException {
		int a,b;
		b=20;
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF a");
		a = s.nextInt();
		try {
		if(a==0) {
			ArithmeticException e = new ArithmeticException("PROBLEM:DIVIDE BY ZERO");	/*CREATING AN ARITHMETIC EXCEPTION AS WE ARE ATTEMPTING TO DIVIDE BY ZERO*/
			e.initCause(new IOException("REAL CAUSE:THE VALUE OF a WAS INPUTTED AS ZERO"));		/* SINCE THE WHOLE PROBLEM OCCURED DUE TO THE INPUT BEING ZERO WE CHAIN THE REAL CAUSE AS IOException ARISING DUE TO INPUTTING a AS ZERO*/
			throw e;
		}
		else {
			System.out.println("b/a="+(b/a));		/*PRINT b/a IF NO EXCEPTION HAS OCCURED*/
		}
		}catch(ArithmeticException e) {
			System.out.println(e);					/*PRINT THE TOP LAYER OF THE EXCEPTION*/
			System.out.println(e.getCause());		/*PRINT THE ACTUAL CAUSE THAT CAUSED THE EXCEPTION(INPUTTING a AS ZERO)*/
		}
	}
}


/*OUTPUT 1:-
ENTER THE VALUE OF a
0
java.lang.ArithmeticException: PROBLEM:DIVIDE BY ZERO
java.io.IOException: REAL CAUSE:THE VALUE OF a WAS INPUTTED AS ZERO
*/

/* OUTPUT 2:-
ENTER THE VALUE OF a
10
b/a=2

*/