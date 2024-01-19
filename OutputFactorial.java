import java.util.Scanner;

public class OutputFactorial {


	public static void main (String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter preferred Number: ");

		int number = input.nextInt();
		
		input.close();


		int factorial = 1;


		for (int count = 1; count <= number; count++){

			factorial *= count;

			}

		System.out.printf("%d factorial = %d", number, factorial);

	}
}