import java.util.Scanner;

public class ReverseFiveDigitNumber{

	
	public static void main (String [] args){
			
		

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Five Number: ");

		int fiveDigitNumber = input.nextInt();
		


		if (fiveDigitNumber <10000 && fiveDigitNumber > 99999) {

			
		int remainder = 0;

		int reversed = 0;

		while (fiveDigitNumber != 0) {


				remainder = fiveDigitNumber % 10;

				reversed = (reversed * 10) + remainder;
				  
				fiveDigitNumber = fiveDigitNumber / 10;

				}

			System.out.printf("The reverse of number is %d: ", reversed);


			}


			else 
				{

				System.out.print("Invalid Entry! I was expecting a 5 digit number");

				 input = new Scanner(System.in);

				System.out.println("Enter Five Number: ");

				 fiveDigitNumber = input.nextInt();


			
		if (fiveDigitNumber <10000 && fiveDigitNumber > 99999) {

			
		int remainder = 0;

		int reversed = 0;

		while (fiveDigitNumber != 0) {


				remainder = fiveDigitNumber % 10;

				reversed = (reversed * 10) + remainder;
				  
				fiveDigitNumber = fiveDigitNumber / 10;

				}

			System.out.printf("The reverse of number is %d: ", reversed);


			}


				}

				

		
		}




}