/*THIS TAKES CARE OF CHECKED EXCEPTIONS IN JAVA USING THE throws KEYWORD*/
public class CheckedException {
	public static void main(String[] args) throws InstantiationException{
		try {
			throw new InstantiationException("CANNOT CREATE OBJECT FOR ABSTRACT CLASS OR INTERFACE");		/*SUCH AN EXCEPTION IS CREATED WHEN AN OBJECT OF ABS\TRACT CLASS OR INTERFACE IS CREATED*/
		}catch(InstantiationException e) {
			System.out.println(e.getMessage());
		}
		
	}

}

/*OUTPUT:-
CANNOT CREATE OBJECT FOR ABSTRACT CLASS OR INTERFACE
*/