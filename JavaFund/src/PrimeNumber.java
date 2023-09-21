import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
	String input =	sc.next();
	printPrimeNumber(Integer.parseInt(input));

	}
	
	// it will print all prime  number from 0 to number 
	
	//
	public static void printPrimeNumber(int number) {
		
	List<Integer> listOfPrimeNumber = new ArrayList<Integer>();

	
		for (int i = 2; i <= number; i++) {
			int currentNumber = i;
			boolean isPrime = true;
			// this will check whether current number is prime of not
			for (int j = currentNumber - 1; j >= 2; j--) {

				if (currentNumber % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime){
				listOfPrimeNumber.add(currentNumber);
			}

		}
		
		// print the list
		System.out.println(listOfPrimeNumber);
	}
	
	// tell whether given number is prime or not
	public static boolean isPrimeNumber(int number){
		return false;
	}

}
