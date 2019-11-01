/*HERE WE USE MULTIPLE catch BLOCKS FOR A SINGLE try BLOCK*/
import java.util.*;
public class MultipleCatch {
	public static void main(String[] args)
	{
		try {
			int a,b,c;
			b=10;
			String s1=null;
			Scanner s = new Scanner(System.in);
			System.out.println("ENTER THE VALUE OF a:");
			a = s.nextInt();
			if(a==0)
			{
				c=b/a;  /*EXCEPTION ARISES AS WE ARE ATTEMPTING TO DIVIDE BY 0 AN ArithmeticException OBJECT IS CREATED AND THROWN, SUBSEQUENT LINES IN TRY NOT RUN */
			}
			else {
				a = s1.length();	/*EXCEPTION ARISES AS WE ARE ATTEMPTING TO FIND THE LENGTH OF A null STRING A NullPointerException OBJECT IS CREATED AND THROWN,SUSBSEQUENT LINES IN TRY NOT RUN*/
			}
			System.out.println("THIS LINE WILL NOT RUN");
			
			
		}catch(ArithmeticException e) {
			/*THIS IS THE CATCH FOR THE DIVIDE BY ZERO ERROR*/
			System.out.println("EXCEPTION 1:"+e);
			
		}catch(NullPointerException e) {
			/*THIS IS THE CATCH FOR THE EXCEPTION ARISING DUE TO FINDING LENGTH OF NULL STRING*/
			System.out.println("EXCEPTION 2:"+e);
		}catch(Exception e) {
			/* THIS CATCHES ANY OTHER EXCEPTION THAN ArithmeticException AND NullPointerException*/
			System.out.println("EXCEPTION:"+e);
		}
		System.out.println("THIS LINE WILL BE EXECUTED");	/*PROGRAM DOES NOT TERMINATE AND THE LINES AFTER THE TRY CATCH BLOCK ARE EXECUTED*/
	}
}




/*OUTPUT 1:-
ENTER THE VALUE OF a:
2
EXCEPTION 2:java.lang.NullPointerException
THIS CODE WILL BE EXECUTED
*/

/*OUTPUT 2:-
EXCEPTION 1:java.lang.ArithmeticException: / by zero
THIS LINE WILL BE EXECUTED
*/