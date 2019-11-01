/*HERE WE USE NESTED TRY STATEMENTS AND ANALYZE HOW EXCEPTIONS CAN BE CAUGHT FOR NESTED TRY BLOCKS*/
import java.util.*;
public class NestedTry {
	public static void main(String[] args) {
		int a,b,c;
		int arr[] = {1};
		String s1=null;
		b=20;
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF a:");
		a = s.nextInt();
		try {
			if(a==0) {
				c=b/a;  /*EXCEPTION ARISES AS WE ARE ATTEMPTING TO DIVIDE BY 0 AN ArithmeticException OBJECT IS CREATED AND THROWN, SUBSEQUENT LINES IN TRY NOT RUN*/
			}
			try {
				if(a==1) {
				c = s1.length();/*EXCEPTION ARISES AS WE ARE ATTEMPTING TO FIND THE LENGTH OF A null STRING A NullPointerException OBJECT IS CREATED AND THROWN,SUSBSEQUENT LINES IN TRY NOT RUN*/
				}
				else
				{
				arr[11]=10;	/*EXCEPTION ARISES AS THE SIZE OF arr IS 1 AND WE ARE TRYING TO INITIALIZE a[11], AN ArrayIndexOutOfBounds EXCEPTION OBJECT IS CREATED AND THROWN, SUBSEQUENT LINES IN TRY WILL NOT BE EXECUTED*/
				}
			}catch(ArrayIndexOutOfBoundsException e) {
				/*THIS BLOCK CATCHES THE ARRAY INDEX OUT OF BOUNDS EXCEPTION ARISING FROM THE INNER try BLOCK*/
				System.out.println("EXCEPTION 1:"+e);
				
			}
			
		}catch(ArithmeticException e) {
			/*THIS BLOCK CATCHES THE DIVIDE BY ZERO EXCEPTION FROM OUTER TRY BLOCK*/
			System.out.println("EXCEPTION 2:"+e);
		}catch(NullPointerException e) {
		/*THIS BLOCK CATCHES THE NULL POINTER EXCEPTION FROM THE INNER BLOCK*/
			System.out.println("EXCEPTION 3:"+e);
		}
		System.out.println("THIS CODE WILL BE EXECUTED");		/*PROGRAM DOES NOT TERMINATE AND THE LINES AFTER THE TRY CATCH BLOCK ARE EXECUTED*/
	}

}



/*OUTPUT 1:-
ENTER THE VALUE OF a:
0
EXCEPTION 2:java.lang.ArithmeticException: / by zero
THIS CODE WILL BE EXECUTED
 */

/* OUTPUT 2:-
ENTER THE VALUE OF a:
1
EXCEPTION 3:java.lang.NullPointerException
THIS CODE WILL BE EXECUTED
 */

/*OUTPUT 3:-
EXCEPTION 1:java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 1
THIS CODE WILL BE EXECUTED
 */

