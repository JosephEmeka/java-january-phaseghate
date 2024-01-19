import java.util.Scanner;

public class AgeCalculator{

	public static int yearOfBirth;

	public static void main (String[] args){
			
		requestYearOfBirth();

		}





		public static void checkAge(){


		if (yearOfBirth > 2024) {

		System.out.println("Invalid Entry! try again");

		requestYearOfBirth();

			}

		else {

			int age = 2024-yearOfBirth;

			System.out.printf("your are %d years old.", age);

			
			}

		}




		public static void requestYearOfBirth(){

			Scanner input = new Scanner(System.in);

			System.out.println("Enter Year of birth: ");

			yearOfBirth = input.nextInt(); 
			
			checkAge();
	
		}


}


	