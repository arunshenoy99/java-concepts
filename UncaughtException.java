/*HERE WE USE JAVA'S DEFAULT THROW AND CATCH MECHANISM*/
public class UncaughtException {
	public static void main(String[] args)
	{
		int a,b,c;
		a=0;
		b=10;
		c=b/a;	/*EXCEPTION ARISES AS WE ARE ATTEMPTING TO DIVIDE BY 0 AN ArithmeticException OBJECT IS CREATED AND THROWN, SUBSEQUENT LINES NOT RUN*/
		System.out.println("This will not be printed");	/*AS WE ARE USING JAVA'S DEFAULT CATCH MECHANISM THIS LINE WILL NOT BE PRINTED AS PROGRAM TERMINATES WHEN EXCEPTION OCCURS*/
	}
}


/* OUTPUT:-
Exception in thread "main" java.lang.ArithmeticException: / by zero
at UncaughtException.main(UncaughtException.java:8)
*/