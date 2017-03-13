import java.util.Scanner;

public class GradeBookTest

{

	public static void main(String[] args ) 
	
	{
		
	
		Scanner input = new Scanner( System.in );
		
		GradeBook myGradeBook = new GradeBook();
		
		
		System.out.println("Enter the name of the Book" );
		
		System.out.println("Enter the name of course: " );
		
		String courseName = input.nextLine();
		System.out.println();
		
		myGradeBook.displayMessage( courseName );
		
		
			// TODO Auto-generated method stub
						
				
				
			
	}

}
