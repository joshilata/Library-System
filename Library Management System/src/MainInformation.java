import java.util.Scanner;
public class MainInformation
{
	private static Scanner scanner;
	public static void main(String[]args)
	{
	 /*Allow user to input the Book details */

		System.out.println("Enter the ISBN number : ");
		scanner =new Scanner(System.in);
		String strISBN=scanner.next();
		System.out.println("Enter the Book title : ");
		String strBook=scanner.next();
		System.out.println("Enter the Author : ");
		String strAuthor=scanner.next();
		System.out.println("Enter the Book Edition : ");
		String strEdition=scanner.next();
	
	 /*Call BookDisplay and pass the user input to display using DisplayBookInfo() */
		
		BookDisplay BD1 = new BookDisplay(strISBN, strBook, strAuthor,strEdition);
		BD1.DisplayBookInfo();
	}
}
