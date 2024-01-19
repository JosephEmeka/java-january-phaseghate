import java.util.Scanner;

public class PrimeNumber{

	
	public static void main (String[] args){
			
		Scanner input = new Scanner(System.in);

		System.out.println("Enter positive Number: ");

		int positiveNumber = input.nextInt();

		int counter = 0;


		for (int count = 1; count < positiveNumber; count++){

			if (positiveNumber % count == 0) {

				int totalTimesDivisible = counter ++;

				if  (totalTimesDivisible < 2){System.out.println("Number is a prime number");}

			else {System.out.println("Number is not a prime number");}

			}


		}


	}

}