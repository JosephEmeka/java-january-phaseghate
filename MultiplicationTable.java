import java.util.Scanner;

public class MultiplicationTable {


	public static void main (String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter preferred Number: ");

		int number = input.nextInt();
		
		input.close();


		int result = 0;

		for (int count = 1; count < 13; count++){

			result = number * count;

			System.out.printf("%d * %d = %d%n", number, count, result);


		}


	}
}