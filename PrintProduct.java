import java.util.Scanner;

public class PrintProduct{

	
	public static void main (String[] args){
			
		Scanner input = new Scanner(System.in);

		System.out.println("Enter preferred first Number: ");

		int firstNumber = input.nextInt();
		
		System.out.println("Enter preferred second Number: ");

		int secondNumber = input.nextInt();

		System.out.println(numberProduct(firstNumber, secondNumber));




		}




		public static int numberProduct(int numberOne, int numberTwo){


			int product = 0;

			for (int count = 1; count <= numberTwo; count ++ ){

				product += numberOne;


					}

			return product;



		}


}