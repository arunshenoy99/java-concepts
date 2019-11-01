/*HERE WE USE JAVA'S THROW BUT OUR CATCH MECHANISM*/
public class CaughtException {
	public static void main(String[] args)
	{
		try {
			int a,b,c;
			a=0;
			b=20;
			c=b/a;	/*EXCEPTION ARISES AS WE ARE ATTEMPTING TO DIVIDE BY 0 AN ArithmeticException OBJECT IS CREATED AND THROWN, SUBSEQUENT LINES IN TRY NOT RUN*/
			System.out.println("THIS LINE WILL NOT BE EXECUTED");
		}catch(ArithmeticException e) {
			System.out.println("EXCEPTION 1: DIVIDE BY ZERO");	/*DISPLAY OUR OWN MESSAGE*/
			System.out.println("EXCEPTION 2:"+e);				/*DISPLAY ERROR MESSAGE THROWN BY JAVA'S THROW MECHANISM*/
		}
		System.out.println("THIS LINE WILL BE EXECUTED");		/*PROGRAM DOES NOT TERMINATE AND THE LINES AFTER THE TRY CATCH BLOCK ARE EXECUTED*/
	}
	
}




/*OUTPUT:-
EXCEPTION 1: DIVIDE BY ZERO
EXCEPTION 2:java.lang.ArithmeticException: / by zero
THIS LINE WILL BE EXECUTED
*/
